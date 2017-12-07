package programagummentVmagumment;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws Exception{
        
        Scanner scan = new Scanner(System.in);
        System.out.println("서버 주소? ");
        String serverAddr = scan.nextLine();
        
        Socket socket = new Socket(serverAddr, 9999);
        
        PrintStream out = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
        
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        
        while (true) {
            
            System.out.print("계산식? ");
            String message = scan.nextLine();
            
            out.println(message);
            out.flush();
            
            System.out.println(in.readLine());
            
            if (message.equals("quit")) {
                break;
            }
            
            in.close();
            out.close();
            socket.close();
            scan.close();
        }
    }
}
