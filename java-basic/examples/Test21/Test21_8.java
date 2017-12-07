// ## Scanner - 연습 II

package bitcamp.java100.Test21;

import java.io.Console;
//1단계 : 변수를 사용하여 사용자가 입력한 값을 저장한다.
public class Test21_8{
   
     
    public static void main(String[] args){
        
        
        Console console = System.console();
        
        if (console == null) {
            
            System.err.println("콘솔을 지원하지 않습니다."); // err = 에러메시지를 띄울때 사용한다.
            
            System.exit(1); // JVM을 종료한다.
        }
        String name = console.readLine();
        String email = console.readLine();
        String tell = console.readLine();
        
        System.out.println(name);
        System.out.println(email);
        System.out.println(tell);

    }
}
       


         
         