// ## Scanner - 연습 II

package bitcamp.java100.Test21;

import java.io.Console;
//2단계 : 배열를 사용하여 사용자가 입력한 값을 저장한다.
public class Test21_8_1{
   
     
    public static void main(String[] args){
        
        
        Console console = System.console();
        
        if (console == null) {
            
            System.err.println("콘솔을 지원하지 않습니다."); // err = 에러메시지를 띄울때 사용한다.
            
            System.exit(1); // JVM을 종료한다.
        }
        // 값을 저장할 레퍼런스 배열을 만든다.
        
        
        String[] names = new String[3];
        String[] emails = new String[3];
        String[] tells = new String[3];
        
        // 값이 저장될 위치 (Index)
        int cursor = 0;
        
        // 배열의 개수만큼 입력 받는다.
        
        while(cursor < names.length) {
            names[cursor] = console.readLine("이름 :");
            emails[cursor] = console.readLine("이메일 : ");
            tells[cursor] = console.readLine("전화 : ");
            cursor++;
        }
        
        cursor = 0;
        
        while(cursor < names.length) {
            System.out.println(names[cursor]);
            System.out.println(emails[cursor]);
            System.out.println(tells[cursor]);
            cursor++;
        }
        
        
    }
}
       


         
         