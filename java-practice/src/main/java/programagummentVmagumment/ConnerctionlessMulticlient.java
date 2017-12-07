package programagummentVmagumment;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class ConnerctionlessMulticlient {

    public static void main(String[] args)throws Exception{
        
        Scanner scan = new Scanner(System.in);
        
        MulticastSocket socket = new MulticastSocket();
        
        InetAddress ip = InetAddress.getByName("224.0.0.1");
        
        int port = 9999;
        
        while (true) {
            System.out.println("보낼 메시지? ");
            String message = scan.nextLine();
            
            if (message.equals("quit")) {
                System.out.println("Goodby");
                break;
            }
            
            byte[] bytes = message.getBytes("UTF-8");
            
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length, ip, port);
            
            socket.send(packet);
            System.out.println("데이터 출력 완료!");
        }
        socket.close();
        scan.close();
        
        
        
        

    }

}
