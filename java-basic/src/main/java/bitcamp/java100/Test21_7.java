//## Scanner - 연습 II



package bitcamp.java100;

import java.io.Console;

public class Test21_7{
 
 public static void main(String[] args){
     Console console = System.console();
     
     if (console == null) {
         
         System.err.println("콘솔을 지원하지 않습니다."); // err = 에러메시지를 띄울때 사용한다.
         
         System.exit(1); // JVM을 종료한다.
     }
     
     String str = console.readLine("문자열 ? ");
     
     for(int i =str.length()-1; i >= 0;i--) {
         System.out.print(str.charAt(i));
         
     }
     
 }


}


