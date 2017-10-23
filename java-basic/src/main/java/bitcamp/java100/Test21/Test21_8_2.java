// ## Scanner - 연습 II

package bitcamp.java100.Test21;

import java.io.Console;
//3단계 : 계속 입력할지 여부를 묻는 기능 추가
public class Test21_8_2{
   
     
    public static void main(String[] args){
        
        
        Console console = System.console();
        
        if (console == null) {
            
            System.err.println("콘솔을 지원하지 않습니다."); // err = 에러메시지를 띄울때 사용한다.
            
            System.exit(1); // JVM을 종료한다.
        }
        // 값을 저장할 레퍼런스 배열을 만든다.
        
        
        String[] names = new String[100];
        String[] emails = new String[100];
        String[] tells = new String[100];
        
        // 값이 저장될 위치 (Index)
        int cursor = 0;
        
        // 배열의 개수만큼 입력 받는다.
        
        while(cursor < names.length) {
            names[cursor] = console.readLine("이름 :");
            emails[cursor] = console.readLine("이메일 : ");
            tells[cursor] = console.readLine("전화 : ");
            cursor++;
            String response = console.readLine("계속 입력하시겠습니까?(y/n)");
            if(!(response.toLowerCase().equals("y") ||
                    response.toLowerCase().equals("yes")))
                break;
        }
        
        
        
        for (int i = 0; i < cursor; i++) {
            System.out.println(names[i]);
            System.out.println(emails[i]);
            System.out.println(tells[i]);
        }
        
        
    }
}
       


         
         