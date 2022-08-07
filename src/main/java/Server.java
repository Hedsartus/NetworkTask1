import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) {
        try(ServerSocket server = new ServerSocket(9999)) {
            while (true) {
                ConnectionHelper connectionHelper = new ConnectionHelper(server);
                new Thread(() -> {
                    System.out.println("New connection accepted");
                    final String name = connectionHelper.readLine();
                    System.out.println(String.format("Hi %s, your port is %d", name, connectionHelper.getPort()));
                }).start();
            }

        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
