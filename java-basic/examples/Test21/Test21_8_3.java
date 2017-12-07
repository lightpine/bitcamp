// ## Scanner - 연습 II

package bitcamp.java100.Test21;

import java.io.Console;
//4단계 : 계속 입력할지 여부를 묻는 기능 추가
public class Test21_8_3{
   
     
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
            String name = console.readLine("이름 : ");
            String email = console.readLine("이메일 : ");
            String tell = console.readLine("전화 : ");
            String response = console.readLine("저장하시겠습니까?(y/n)");
                    if(response.toLowerCase().equals("y") ||
                            response.toLowerCase().equals("yes")) {
                    names[cursor] = name;
                    emails[cursor] = email;
                    tells[cursor] = tell;
                    cursor++;
            }
            response = console.readLine("계속 입력하시겠습니까?(y/n)");
            if(!(response.toLowerCase().equals("y") ||
                    response.toLowerCase().equals("yes")))
                break;
        }
        
        
        // 배열에 저장된 값을 출력한다.
        
        for (int i = 0; i < cursor; i++) {
            
            System.out.printf("%s,%s,%s\n",names[i],emails[i],tells[i]);
        }
        
        
    }
}
       


         
         