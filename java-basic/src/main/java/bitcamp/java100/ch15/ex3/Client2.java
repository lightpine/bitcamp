// 네트워킹 프로그래밍 -  사용자가 입력한 데이터 보내
package bitcamp.java100.ch15.ex3;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {

    public static void main(String[] args) throws Exception{
        
        Scanner scan = new Scanner(System.in);
        System.out.print("보낼 메세지 : ");
        String message = scan.nextLine();
        
        System.out.print("서버 주소 : ");
        String serverAddr = scan.nextLine();
        Socket socket = new Socket(serverAddr, 9999);
        scan.close();
        
        System.out.println("서버와 연결되었음!");
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        out.println(message);
        
        Scanner in = new Scanner(socket.getInputStream());
        String line = in.nextLine();
        
        System.out.println(line);

        out.close();
        in.close();
        socket.close();

    }

}
