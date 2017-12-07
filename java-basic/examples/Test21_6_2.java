// ## Scanner - 연습 II

// 숫자를 입력받아 출력
//16-4

package bitcamp.java100;

import java.io.Console;

public class Test21_6_2{
    
    public static void main(String[] args){
        
        static Console console;
        
        static void preareConsole() {
           Console =System.console();
           if (console == null) {
               
               System.err.println("콘솔을 지원하지 않습니다."); // err = 에러메시지를 띄울때 사용한다.
               
               System.exit(1); // JVM을 종료한다.
           }
           
        }
        
        static StringBuffer inputnumber() {
            
            StringBuffer buf = new StringBuffer(console.readLine("숫자 : "));
            return buf;
        }
        
       
        static int[] count(Stringbuffer buf)) {
            int[] dnt = new int[10];
            
            for(int i = 0; i < value; i++) {
                
                System.out.println(value.charAt(i) - '0');
                cnt[value.charAt(i) - '0']++;
            }
        }
        static void print(int vlaue) {
            for (int i = 0; i < cnt.length; i++) {
                System.out.printf("%d = %d\n", i, cnt[i]);
            }
        }
        
       
       
        
        
        System.out.println(">");
    }
}
