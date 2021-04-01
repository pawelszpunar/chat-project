import client.ClientConnection;
import server.ChatServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

public class ChatApp {
    static final Logger logger = Logger.getLogger(ChatApp.class.getName());
    public static void main(String[] args) throws IOException {
        //   A*>----------<*B
        // A ip - adres sieciowy unikalny globalny
        //  port - numer portu to liczba short, któa określa usługę danego serwera w obrębie maszyny
        // B ip
        //   port

        ChatServer server = new ChatServer(5555, logger);
        server.start();

    }
}
