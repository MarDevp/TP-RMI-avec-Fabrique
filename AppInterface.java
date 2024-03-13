import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AppInterface extends Remote {
    String reverse(String input) throws RemoteException;
}
