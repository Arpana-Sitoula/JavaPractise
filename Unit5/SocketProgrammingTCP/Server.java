package Unit5.SocketProgrammingTCP;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{
    public static void main(String[] args) throws Exception{

        //step1: create socketport for incoming request
        ServerSocket ss = new ServerSocket(2345);

        //step2: wait for incoming connection request
        Socket s = ss.accept();

        //step3: read request from connection socket
        DataInputStream dis = new DataInputStream(s.getInputStream());

        //step4: write reply to connection socket (we don't do that here)
        
        String str = dis.readUTF();
        System.out.println("Client message = "+ str);

        //step5: close connection socket
        ss.close();
}
}