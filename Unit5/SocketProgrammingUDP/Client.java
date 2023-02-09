package Unit5.SocketProgrammingUDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args) throws Exception{

        //get a datagram socket
        DatagramSocket socket = new DatagramSocket();

        //send request
        InetAddress add = InetAddress.getLocalHost();
        String msg = "hellooooo";
        byte[] data = msg.getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length,add, 2345);
        socket.send(packet);

        //close socket
        socket.close();
    }
}
