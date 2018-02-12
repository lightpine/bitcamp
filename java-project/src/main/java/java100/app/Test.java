package java100.app;

public class Test {

    public static void main(String[] args) {
        
        String name ="FirstName";
        
        String.format("%c%s", 
               Character.toLowerCase(name.charAt(0)),name.substring(1));
        System.out.println(name);
    }
}
