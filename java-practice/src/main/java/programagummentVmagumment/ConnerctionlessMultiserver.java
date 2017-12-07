package programagummentVmagumment;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ConnerctionlessMultiserver {

    public static void main(String[] args) throws Exception{
        
        MulticastSocket socket = new MulticastSocket(9999);
        
        InetAddress groupAddr = InetAddress.getByName("224.0.0.1");
        
        socket.joinGroup(groupAddr);
        
        byte[] buf = new byte[1024];
        
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        
        System.out.println("데이터를 기다리는 중...");
        
        socket.receive(packet);
        
        String message = new String(packet.getData(), 0, packet.getLength(), "UTF-8");
        
        System.out.printf("[%s:%d] %s\n",
                packet.getAddress().getHostAddress(),
                packet.getPort(),
                message);
        
    }

}
