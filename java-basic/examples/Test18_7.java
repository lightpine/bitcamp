// ## StringBuffer 클래스 사용법 - 원본 문자열 변경하기


package bitcamp.java100;
import java.util.regex.*;


public class Test18_7{
    
    public static void main(String[] args) throws Exception {
        // Immutable 객체
        // 한번 값이 설정되면 메모리에 값이 바뀌지 않는다.
        String s1 = "Hello!";
        
        
        String s2 = s1.replace("l", "x");
        
        System.out.println(s1);
        System.out.println(s2);
        
        //Mutable
        
        StringBuffer sb1 = new StringBuffer("Hello!");
        
        //append(추가할 문자열)
        sb1.append(" World!");
        System.out.println(sb1);
        
        sb1.replace(2, 4, "xx");
        System.out.println(sb1);
     }
    
}
