import java.io.IOException;
import java.net.ServerSocket;

public class ClientHandler extends ConnectionHelper implements Runnable {

    public ClientHandler(ServerSocket server) throws IOException {
        super(server);
    }

    @Override
    public void run() {
        final String name = super.readMessage();
        System.out.printf("Hi %s, your port is %d%n", name, getPort());
    }
}
