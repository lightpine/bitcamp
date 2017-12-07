// 예외처리 문법정리 : 예외 클래스의 상속 관계와 catch 블록
package bitcamp.java100.ch13.ex5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Test7 {

    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("입력> ");
        String str = keyScan.nextLine().toLowerCase();
        
        try {
            System.out.println("try 블록 실행");
            
            switch (str) {
            case "a": throw new Exception();
            case "b": throw new IOException();
            case "c": throw new FileNotFoundException();
            case "d": throw new SQLException();
            }
            
            System.out.println(str);
            
        } catch (Exception e) {
            // try 블록에서 발생되는 각각의 예외를 구분하지 않고
            // 처리하고 싶다면 그 예외 클래스들의 공통 수퍼 클래스를
            // 파라미터로 사용하라!
            System.out.println("Exception 처리");
            
        } 

    }

}
