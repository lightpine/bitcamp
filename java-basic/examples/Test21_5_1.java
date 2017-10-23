// ## Scanner - 연습 I


package bitcamp.java100;

import java.io.Console;

public class Test21_5_1{
    
    
    public static void main(String[] args) {
        Console console = System.console();
        
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1);
            
        }
        
        long value = Long.parseLong(console.readLine("숫자?"));
        
        int[] cunt = new int[10];
        
        while (value > 0) {
            cunt[(int)(value & 10)]++;
           value /= 10;
           
        }
        int i = 0;
        while(i < cunt.length) {
            System.out.printf("%d = %d\n",i, cunt[i]);
            i++;
        }
        
    }
}


            
            
                
                

