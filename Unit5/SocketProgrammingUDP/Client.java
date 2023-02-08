package Unit5.SocketProgrammingUDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args) throws Exception{
        DatagramSocket socket = new DatagramSocket();
        InetAddress add = InetAddress.getLocalHost();
        String msg = "hellooooo";
        byte[] data = msg.getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length,add, 2345);
        socket.send(packet);
        socket.close();
    }
}
