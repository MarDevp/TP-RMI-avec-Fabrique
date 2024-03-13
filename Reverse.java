public class Reverse extends UnicastRemoteObject implements AppInterface {
    public Reverse() throws RemoteException {}

    public String reverseString(String input) throws RemoteException {
        return new StringBuilder(input).reverse().toString();
    }
}
