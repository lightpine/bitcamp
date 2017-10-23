// ## Scanner - 연습 II

// 숫자를 입력받아 출력
//16-4

package bitcamp.java100;

import java.io.Console;

public class Test21_6_1{

    static Console console;
    
    static void prepareConsole() {
        if (console == null) {
            
            System.err.println("콘솔을 지원하지 않습니다."); // err = 에러메시지를 띄울때 사용한다.
            
            System.exit(1); // JVM을 종료한다.
        }
    }
    
    static long inputNumber() {
        return Long.parseLong(console.readLine("숫자 :"));
    }
    static int[] countNumber(long value) {
        
       int [] cnt = new int[10];
       while(value > 0){
       cnt[(int)(value % 10)]++;
       value /= 10;

        }
    return cnt;
    }
    
    static void print(int[] cnt) {
        int x = 0;
        while (x < cnt.length) {
            System.out.println("[" + x + "]" + " = " + cnt[x]);
            x++;
        }
    }
    
    public static void main(String[] args){
        
        prepareConsole();
        
        long value =inputNumber();
        
        int[] cnt = countNumber(value);
        
        print(cnt);
        
        }
      
    }
