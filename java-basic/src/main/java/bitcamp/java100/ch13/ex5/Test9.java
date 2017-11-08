// 예외처리 문법 정리 : catch블록을 여러개 둘 경우!
package bitcamp.java100.ch13.ex5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Test9 {

    public static void main(String[] args) {
        
        Scanner keyScan = new Scanner(System.in);
        System.out.print("입력> ");
        String str = keyScan.nextLine().toLowerCase();
        
        try {
            
            System.out.println("try블록 실행!");
            
            switch(str) {
            case "a" : throw new Exception();
            case "b" : throw new IOException();
            case "c" : throw new FileNotFoundException();
            case "d" : throw new SQLException();
            }
            
            System.out.println(str);
            
        }catch(IOException|SQLException e) {
            
            System.err.println("IOException|SQLException 예외 처리!");
            
        }catch (Exception e) {
            // 예외처리 중 슈퍼클래스는 이렇게 별도 처리한다.
            System.err.println("Exception 예외 처리!");
        }
    }
}
