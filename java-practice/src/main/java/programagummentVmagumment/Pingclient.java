package programagummentVmagumment;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Pingclient {

    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("서버 주소? ");
        
        String serverAddr = scan.nextLine();
        
        System.out.println("보낼 메시지? ");
        
        String message = scan.nextLine();
        
        scan.close();
        
        DatagramSocket socket = new DatagramSocket();
        
        byte[] bytes = message.getBytes("UTF-8");
        
        InetAddress ip = InetAddress.getByName(serverAddr);
        
        int port = 9999;
        
        DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length, ip, port);
        
        socket.send(packet);
        socket.close();
        
        System.out.println("데이터 출력 완료!");
        
        
        
        
    }

}
