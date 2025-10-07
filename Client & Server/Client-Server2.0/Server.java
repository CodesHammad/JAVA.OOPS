import java.util.*;
import java.net.*;
import java.io.*;

class Threading extends Thread {
    private Socket client;

    public Threading(Socket client) {
        this.client = client;
    }

    public void run() {
        try {
            Scanner in = new Scanner(client.getInputStream());
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);

            while (true) {
                String message = in.nextLine();
                System.out.println("Client says " + message);
                if (message.equals("exit")) {
                    break;
                }
            }
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class Server {

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(9090);
            System.out.println("Waiting for client connection");
            Socket client = server.accept();
            System.out.println("client connected");

            Threading handle = new Threading(client);
            handle.start();
            server.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}