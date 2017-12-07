package networkingprectice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws Exception {
        
        File photo = new File("Cat.jpg");
        
        BufferedInputStream filein = new BufferedInputStream(new FileInputStream(photo));
        
        Socket socket = new Socket("localhost", 9999);
        
        DataOutputStream netOut = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
        
        netOut.writeUTF(photo.getName());
        netOut.writeLong(photo.length());
        
        int b;
        while ((b = filein.read()) != -1) {
            netOut.write(b);
        }
        
        netOut.flush();
        
        DataInputStream netIn = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        
        String response = netIn.readUTF();
        
        System.out.println(response);
        netOut.close();
        netIn.close();
        filein.close();
        socket.close();
        
        
        
    }

}
