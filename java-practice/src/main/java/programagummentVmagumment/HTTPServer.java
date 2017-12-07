
package programagummentVmagumment;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HTTPServer {
    
    public static void main(String[] args) throws Exception {
        
        ServerSocket ss = new ServerSocket(9999);
        
        System.out.println("서버 시작!");
        
        while (true) {
            Socket socket = ss.accept();
            
            BufferedReader  in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            String line;
            while (true) {
                try {
                    line = in.readLine();
                    System.out.println(line);
                    if (line.length() == 0) {
                        break;
                    }
                    
                    PrintStream out = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
                    out.println("HTTP/1.1 200 OK");
                    out.println("Server: Simple HTTP Server");
                    out.println("Content-Type: text/html; charset=UTF-8");
                    
                    out.println();
                    
                    out.println("<html><head><title>하하하</title></head>");
                    out.println("<boby><h1>안녕하세요!</h1></body></html>");
                    out.println();
                    
                    in.close();
                    out.close();
                    socket.close();
                    
                    
                } catch (Exception e) {
                    System.out.println("서버와 통신중 에러 발생!");
                }
            }
            
        }
        
    }
}