package bitcamp.java100.ch15.ex4;

import java.net.Socket;
import java.util.Scanner;

public class SenderStub {
    
    Socket socket;
    Scanner in;
    
    public SenderStub(Socket socket) throws Exception{
        this.socket = socket;
        System.out.println("송신자 "+ socket.getInetAddress().getHostAddress()+"가 연결 되었음");
        in = new Scanner(socket.getInputStream());
    }

    public String nextMessage() {
        // TODO Auto-generated method stub
        return in.nextLine();
    }
    
}
