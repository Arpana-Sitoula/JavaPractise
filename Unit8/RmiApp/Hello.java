package Unit8.RmiApp;
import java.rmi.*;

public interface Hello extends Remote {
    String sayHello() throws RemoteException;
}
