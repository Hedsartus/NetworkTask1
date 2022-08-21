import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(9999)) {
            while (true) {
                new Thread(() -> {
                    try (var client = new ConnectionHelper(server)) {
                        final String name = client.readMessage();
                        System.out.printf("Hi %s, your port is %d%n", name, client.getPort());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }).start();
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
