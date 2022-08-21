import java.io.IOException;

public class Client {
    private static final String host = "127.0.0.1";
    private static final int port = 9999;

    public static void main(String[] args) {
        try (var connectionHelper = new ConnectionHelper(host, port)) {
            connectionHelper.sendMessage("John Doe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}