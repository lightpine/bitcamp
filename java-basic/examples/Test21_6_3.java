// ## Scanner - 연습 II

// 숫자를 입력받아 출력
//16-4

package bitcamp.java100;

import java.io.Console;

public class Test21_6_3{
    
    public static void main(String[] args){
        Console console = System.console();
        
        if (console == null) {
            
            System.err.println("콘솔을 지원하지 않습니다."); // err = 에러메시지를 띄울때 사용한다.
            
            System.exit(1); // JVM을 종료한다.
        }
        
        
        long checkNum = Long.parseLong(console.readLine("숫자 : "));
        int[] number = new int[10];
        // 12345678 시작숫자;
        
        // 1;
        //number[0]~ number[9]
        
        while(checkNum > 0) {
            number[(int)(checkNum % 10)]++; // number[6] += 1 => 1.8번 방에 1이 증가, 2 7번방 1증 3. 6 1+
            checkNum /= 10; //<= 1234567  
            }
        
        int i = 0;
        
        while(i < number.length) {
            
            System.out.printf("%d = %d\n", i, number[i]);
            i++;
            
        }
        System.out.println(">");
    }
}
