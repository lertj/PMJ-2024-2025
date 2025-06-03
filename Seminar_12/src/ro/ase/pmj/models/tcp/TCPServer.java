package ro.ase.pmj.models.tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    private static int port = 8005;
    public static void main(String[] args) {
        try(ServerSocket server = new ServerSocket(port)){
            System.out.println("Server started on port " + port);
            Socket socket = server.accept();
            InputStream iStream = socket.getInputStream();
            DataInputStream dis = new DataInputStream(iStream);
            System.out.println(dis.readUTF());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
