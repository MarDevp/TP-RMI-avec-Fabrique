import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class AppImpl extends UnicastRemoteObject implements AppInterface {
    public AppImpl() throws RemoteException {}

    public String reverse(String input) throws RemoteException {
        return new StringBuilder(input).reverse().toString();
    }
}
