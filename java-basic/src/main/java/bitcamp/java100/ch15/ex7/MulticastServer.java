package bitcamp.java100.ch15.ex7;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastServer {

    public static void main(String[] args) throws Exception{
        
        MulticastSocket socket = new MulticastSocket(9999);
        
        InetAddress groupAddres = InetAddress.getByName("224.0.0.1");
        
        socket.joinGroup(groupAddres);
        
        byte[] buf = new byte[1024];
        
        DatagramPacket packet = new DatagramPacket(buf, buf.length);

        while (true){
            System.out.println("데이터를 기다리는 중...");
            
            socket.receive(packet);
            
            String message = new String(packet.getData(), 0, packet.getLength(), "UTF-8");
            
            System.out.println("[" + packet.getAddress().getHostAddress() + " : " + packet.getPort() + "] = " + message);
            
            System.out.println("---------------------------------------------------------");
        
        }
//        socket.leaverGroup(groupAddres);
        
    }

}
