package Unit8.RmiApp;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements Hello{
    public HelloImpl() throws RemoteException{
        super();
    }
    public String sayHello(){
        return "Hello World!!";
    }
}
