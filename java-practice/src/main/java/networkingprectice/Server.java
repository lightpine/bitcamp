package networkingprectice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws Exception {
        
        ServerSocket ss = new ServerSocket(9999);
        System.out.println("서버 시작");
        
        Socket socket = ss.accept();
        
        DataInputStream netIn = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        
        String filename = netIn.readUTF();
        
        BufferedOutputStream fileOut = new BufferedOutputStream(new FileOutputStream("xx-" + filename));
        
        long length = netIn.readLong();
        
        for (int i = 0; i < length; i++) {
            fileOut.write(netIn.read());
        }
        
        fileOut.flush();
        
        DataOutputStream netOut = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
        netOut.writeUTF("success");
        
        fileOut.close();
        netIn.close();
        netOut.close();
        socket.close();
        ss.close();
        
    }

}
