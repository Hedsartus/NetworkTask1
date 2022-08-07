import java.io.IOException;
import java.util.Scanner;

public class Client {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String host = "127.0.0.1";
    private static final int port = 9999;

    public static void main(String[] args) {

        try (ConnectionHelper connectionHelper = new ConnectionHelper(host, port)) {
            connectionHelper.writeLine("John Doe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}