package bitcamp.java100;

public class Test11_3{
    
    public static void main(String[] args)
    {
        System.out.print("ABC");
        System.out.print('\b');
        System.out.println("123");

        System.out.println("ABC\t123");
        System.out.println("ABC\u0009123"); // \u0009 탭에 대한 코드값
        System.out.println("ABC\n123");// 코드값 0x000a
        System.out.println("ABC\r123");// 코드값 0x000d
        System.out.println("ABC\f123");
        System.out.println("ABC\"123");
        System.out.println("ABC'123");
        System.out.println('\'');
        System.out.println('"');
        System.out.println("c:\\workspace\\test");
        
    }        
    

}