// HTTP 서버 만들기
package bitcamp.java100.ch15.ex6;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HTTPServer {

    public static void main(String[] args) throws Exception{
        
        ServerSocket ss = new ServerSocket(9999);
        System.out.println("서버 시작!");
        
        while (true) {
            try{
                Socket socket = ss.accept();
                
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream()));
                
                String line;
                while (true) {
                    
                    line = in.readLine();
                    System.out.println(line);
                    if (line.length() == 0)
                        break;
                }
                
                PrintStream out = new PrintStream(
                        new BufferedOutputStream(
                                socket.getOutputStream()));
                
                out.println("HTTP/1.1 200 OK");
                
                out.println("Server: Simple HTTP Server");
                out.println("Content-Type: text/html; charset=UTF-8"); // 타입 중요하다! 
                
                out.println();
                
                out.println("<html><head><title>하하하</title></head>");
                out.println("<body><h1>안녕하세요!</h1></body></html>");
                out.flush(); // 이거 잊어버리지 말자!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
                
                in.close();
                out.close();
                socket.close();
                
            } catch (Exception e) {}
            
            }
            
    }

}
