package Unit8.RmiApp;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
    try{
        Registry reg = LocateRegistry.getRegistry(1234);
        Hello obj = (Hello) reg.lookup("");

        String message = obj.sayHello();
        System.out.println(message);
    } catch( Exception e){
        System.out.println("Hello client exception: "+ e);
    }
}
}
