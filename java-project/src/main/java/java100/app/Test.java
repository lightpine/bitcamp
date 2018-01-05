package java100.app;

import org.springframework.context.annotation.Bean;

public class Test {

    public static void main(String[] args) {
        
        String name ="FirstName";
        
        String.format("%c%s", 
               Character.toLowerCase(name.charAt(0)),name.substring(1));
        System.out.println(name);
    }
}
