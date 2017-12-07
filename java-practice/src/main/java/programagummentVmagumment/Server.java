package programagummentVmagumment;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws Exception {
        
        ServerSocket ss = new ServerSocket(9999);
        System.out.println("서버 시작!");
        
        while (true) {
            
            Socket socket = ss.accept();
            
            System.out.printf("%s에서 접속했습니다.\n", socket.getInetAddress().getHostAddress());
            
            service(socket);
            
        }
        
        
    }

    private static void service(Socket socket) {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintStream out = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
        
        
        
    }

}
