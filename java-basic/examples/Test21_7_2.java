//## Scanner - 연습 IIackage bitcamp.java100;

import java.io.Console;

public class Test21_7_2{
 
 public static void main(String[] args){
     Console console = System.console();
     
     if (console == null) {
         
         System.err.println("콘솔을 지원하지 않습니다."); // err = 에러메시지를 띄울때 사용한다.
         
         System.exit(1); // JVM을 종료한다.
     }
     String str = console.readLine("숫자? ");
     StringBuffer buf = new StringBuffer();
     buf.append(str);
     
     
     //전체길이의 절반만 반복
     int len =  buf.length() / 2;
     
     for (int left = 0, right = buf.length() -1; left < len; left++, right--) {
         char ch = buf.charAt(left);
         buf.setCharAt(left, buf.charAt(right));
         buf.setCharAt(right, ch);
     }
     System.out.printf("입력 문자열 : %s\n", str);
     System.out.printf("변경 문자열 : %s\n", str);
 }


}


