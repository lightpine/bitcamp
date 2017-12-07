package networkingprectice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;

public class Client2 {

    public static void main(String[] args) throws Exception {
        
        File photo = new File("Cat.jpg");
        
        BufferedInputStream filein = new BufferedInputStream(new FileInputStream(photo));
        
        Socket socket = new Socket("localhost", 9999);
        
        DataOutputStream netOut = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
        
        long start = System.currentTimeMillis();
        
        netOut.writeUTF(photo.getName());
        netOut.writeLong(photo.length());
        
        int b;
        while ((b = filein.read()) != -1) {
            netOut.write(b);
        }
        
        netOut.flush();
        
        DataInputStream netIn = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        
        String response = netIn.readUTF();
        
        long end = System.currentTimeMillis();
        
        System.out.println(response);
        System.out.println(end - start);
        netOut.close();
        netIn.close();
        filein.close();
        socket.close();
        
        
        
    }

}
