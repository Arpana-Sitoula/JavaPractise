package Unit5.SocketProgrammingTCP;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(2345);
        //establish connection
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        String str = dis.readUTF();
        System.out.println("Client message = "+ str);
        ss.close();
}
}