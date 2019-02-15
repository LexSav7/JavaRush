import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

    public static void main(String[] args) {
        System.out.println("Waiting for clients...");
        try {
            ServerSocket ss = new ServerSocket(9608);
            Socket soc = ss.accept();
            System.out.println("Connection established");
            BufferedReader reader = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String data = reader.readLine();
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println("Server says: " + data);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
