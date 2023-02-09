package Unit5.SocketProgrammingUDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {
    public static void main(String[] args) throws Exception{

        //get a datagram socket
        DatagramSocket socket = new DatagramSocket(2345);
        
        InetAddress add = InetAddress.getLocalHost();

        byte myBuffer[] = new byte[2000];
        DatagramPacket dp = new DatagramPacket(myBuffer,myBuffer.length, add,2345);
        
        //receive request
        socket.receive(dp);
        System.out.println("Message Received: ");
        String rec = new String(dp.getData());
        System.out.println(rec);

        //close socket
        socket.close();
    }
}
