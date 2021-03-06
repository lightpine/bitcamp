// 네트워킹 프로그래밍 -  데이터 주고 받기
package bitcamp.java100.ch15.ex3;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) throws Exception {
        
        ServerSocket ss = new ServerSocket(9999);
        
        System.out.println("서버를 실행하였다.");
        
        Scanner scan = new Scanner(System.in);
        
        Socket socket = ss.accept();
        
        Scanner in = new Scanner(socket.getInputStream());
        
        String line = in.nextLine();
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        out.println(line);
        
        in.close();
        out.close();
        
        socket.close();
        
        ss.close();
        System.out.println("서버를 종료하였다.");
    }

}
