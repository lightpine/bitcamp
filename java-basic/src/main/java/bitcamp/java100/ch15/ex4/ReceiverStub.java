package bitcamp.java100.ch15.ex4;

import java.io.PrintStream;
import java.net.Socket;

public class ReceiverStub {

        Socket socket;
        PrintStream out;
        
        public ReceiverStub(Socket socket) throws Exception {
           this.socket = socket;
           System.out.println("수신자 "+ socket.getInetAddress().getHostAddress()+"가 연결 되었음");
           out = new PrintStream(socket.getOutputStream());
           
        }

        public void receive(String message) {
            // TODO Auto-generated method stub
            out.println(message);
            
        }
        

}
