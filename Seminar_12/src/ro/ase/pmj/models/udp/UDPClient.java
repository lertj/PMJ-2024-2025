package ro.ase.pmj.models.udp;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UDPClient extends Thread{
    private static int port = 8001;
    private DatagramSocket socket;

    UDPClient(){
        try {
            socket = new DatagramSocket();
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        super.run();
        while(true){
            byte[] rBuf = new byte[100];
            DatagramPacket rPacket = new DatagramPacket(rBuf, rBuf.length);
            try {
                socket.receive(rPacket);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            String msg = new String(rPacket.getData(),0,rPacket.getLength());
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Starting client on port");
            UDPClient client = new UDPClient();
            client.start();
            while(true){
                byte[] buf = scanner.nextLine().getBytes();
                InetAddress address = InetAddress.getByName("localhost");
                DatagramPacket packet = new DatagramPacket(buf, buf.length,address, port);
                client.socket.send(packet);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            System.out.println("Client stopped");
        }
    }
}
