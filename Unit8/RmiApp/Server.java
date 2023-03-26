package Unit8.RmiApp;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try{
            HelloImpl obj = new HelloImpl();
            Registry reg = LocateRegistry.createRegistry(1234);
            reg.rebind("", obj);
            System.out.println("Hello server ready");
        }catch(Exception e){
            System.out.println("Server failed:" + e);
        }
    }
}
