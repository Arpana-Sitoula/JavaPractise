package Unit5.SocketProgrammingTCP;

import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception{
        Socket s = new Socket("localhost",2345);
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF("Helloooooo");
        dout.flush();
        dout.close();
        s.close();
    }
}
