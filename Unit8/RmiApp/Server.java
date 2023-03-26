package Unit8.RmiApp;

import java.rmi.Naming;

public class Server {
    public static void main(String[] args) {
        try{
            HelloImpl obj = new HelloImpl();
            Naming.rebind("//;ocalhost/Hello", obj);
            System.out.println("Hello server ready");
        }catch(Exception e){
            System.out.println("Server failed:" + e);
        }
    }
}
