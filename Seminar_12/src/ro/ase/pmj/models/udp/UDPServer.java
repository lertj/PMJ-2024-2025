package ro.ase.pmj.models.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;

public class UDPServer extends Thread{
    private static int port = 8001;
    private DatagramSocket socket;

    UDPServer(){
        try {
            socket = new DatagramSocket(port);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        super.run();
        while(true){
            byte[] buf = new byte[100];
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            try {
                socket.receive(packet);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            String msg = new String(packet.getData(),0,packet.getLength());
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Starting server on port " + port);
            UDPServer server = new UDPServer();
            server.start();

            byte[] buf = new byte[100];
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            server.socket.receive(packet);

            String msg = new String(packet.getData(),0,packet.getLength());
            System.out.println(msg);

            while(true){
                byte[] sBuf = scanner.nextLine().getBytes();
                DatagramPacket sPacket = new DatagramPacket(sBuf, sBuf.length, packet.getAddress(), packet.getPort());
                server.socket.send(sPacket);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            System.out.println("Server stopped");
        }

    }
}
