// 네트워킹 프로그래밍 -  데이터 주고 받기
package bitcamp.java100.ch15.ex3;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws Exception{
        
        Socket socket = new Socket("192.168.0.50", 9999);
        
        System.out.println("서버와 연결되었음!");
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        
        out.println("Hello");
        
        Scanner in = new Scanner(socket.getInputStream());
        
        String line = in.nextLine();
        
        System.out.println(line);

        out.close();
        in.close();
        socket.close();

    }

}
