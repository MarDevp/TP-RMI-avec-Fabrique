import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ReverseInterface extends Remote {
    String reverse(String input) throws RemoteException;
}
