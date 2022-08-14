import java.io.IOException;

public class Client {
    private static final String host = "127.0.0.1";
    private static final int port = 9999;

    public static void main(String[] args) {
        ConnectionHelper connectionHelper = null;
        try {
            connectionHelper = new ConnectionHelper(host, port);
            connectionHelper.sendMessage("John Doe");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                connectionHelper.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}