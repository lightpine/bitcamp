// ## Scanner - 연습 I


package bitcamp.java100;

import java.io.Console;

public class Test21_5{
    
    public static void main(String[] args){
       
        
        Console console = System.console();
        
        if (console == null) {
            
            System.err.println("콘솔을 지원하지 않습니다."); // err = 에러메시지를 띄울때 사용한다.
            
            System.exit(1); // JVM을 종료한다.
        }
        
        int dan;
        while(true) {
        dan = Integer.parseInt(console.readLine("구구단?"));
        for(int i = 1; i <= 9; i++) {
            if (dan <= 0) {
                System.out.println("다음에 또 봐요!");
                System.exit(1);
                break;
            }else if(dan == 1 || dan >= 10){
                System.out.println("2에서 9단까지만 가능합니다!");
                break;
            }else
                System.out.println(dan + " * " + i + " = " + dan*i);
        }
        
        
        }
    }
}
