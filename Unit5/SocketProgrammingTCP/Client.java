package Unit5.SocketProgrammingTCP;

import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception{
        //Step1: create a socket object
        Socket s = new Socket("localhost",2345);

        //Step2: create an output stream that can be used to send info. to the Socket
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());

       //Step3: create an input stream to read the response from server (wo don't do that here)
      
       //Step4: do I/O with input and output streams
        dout.writeUTF("Helloooooo");
        dout.flush();
        dout.close();
        
         //Step5: close the socket when done
        s.close();
    }
}
