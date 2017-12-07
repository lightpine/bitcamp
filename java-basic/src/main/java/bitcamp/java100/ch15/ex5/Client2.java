package bitcamp.java100.ch15.ex5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;

public class Client2 {

    public static void main(String[] args) throws Exception{
        // TODO Auto-generated method stub
        File photo = new File("./sample/jls9.pdf");
        
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
        
        DataInputStream netin = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        
        String response = netin.readUTF();
        
        long end = System.currentTimeMillis();
        
        System.out.println(response);
        System.out.println(end - start);
        netOut.close();
        netin.close();
        socket.close();
        filein.close();
        
    }

}
