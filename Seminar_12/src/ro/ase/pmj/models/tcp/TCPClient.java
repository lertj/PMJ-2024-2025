package ro.ase.pmj.models.tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
    private static int port = 8005;
    public static void main(String[] args) {
        InetAddress address;
        try {
            address = InetAddress.getByName("localhost");
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        try(Socket socket = new Socket(address, port)){
            OutputStream oStream =  socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(oStream);
            dos.writeUTF("Salut!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
