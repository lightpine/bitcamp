// 네트워킹 프로그래밍 -  ServerSocket 사용법 
package bitcamp.java100.ch15.ex1;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws Exception {
        
        ServerSocket ss = new ServerSocket(9999);
        
        System.out.println("서버를 실행하였다.");
        
        Socket socket = ss.accept();
        
        System.out.println("클라이언트와 연결되었음!");
        System.out.println("서버 IP = "         + socket.getLocalAddress().getHostAddress());
        System.out.println("서버 PORT = "       + socket.getLocalPort());        
        System.out.println("클라이언트 IP = "   + socket.getInetAddress().getHostAddress());
        System.out.println("클라이언트 PORT = " + socket.getPort());
        
        ss.close();
        System.out.println("서버를 종료하였다.");
    }

}
