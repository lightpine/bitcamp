// ## Scanner


package bitcamp.java100;

import java.util.Scanner;

public class Test21_1{
    
    public static void main(String[] args){
        Scanner keyScan = new Scanner(System.in); 
        
        // nextLine = 입력내용을 한줄 입력을 완료할 때 까지 리턴하지 않는다.
        // 이렇게 입력 또는 출력이 끝날 때까지 리턴하지 않는 메서드를 "blocking I/O" 라 한다.
        // 이와 반대로 입력 작업을 시켜놓고 즉시 리턴하는 메서드를 "non-blocking I/O"라 한다.
        System.out.print("입력하세요: ");
        String line = keyScan.nextLine(); // blocking I/O
        
        System.out.println(line);
        keyScan.close();
     }
}
