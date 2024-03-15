import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket server = new DatagramSocket(4222);
        byte[] buf = new byte[256];
        DatagramPacket pac = new DatagramPacket(buf, buf.length);
        server.receive(pac);
        String str = new String(pac.getData(), 0, pac.getLength());
        System.out.println("Message is: " + str);
        server.close();
    }
}
