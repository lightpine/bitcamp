// 예외처리 문법 정리 : Throw를 이용하여 예외 던지기!
package bitcamp.java100.ch13.ex7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Test3 {

    // 메서드에서 예외를 던지면 보통 다음과 같이
    // 메서드 선언부에 던지는 예외의 타입을 나열한다.
    // 
    static void m1(int i) throws RuntimeException, Error,
    ArithmeticException,IndexOutOfBoundsException {
        
        switch(i) {
        case 1 : throw new RuntimeException();
        case 2 : throw new Error();
        case 3 : throw new ArithmeticException();
        case 4 : throw new IndexOutOfBoundsException();
        
        }
    }
    
    // 참고 Error예외는 JVM에서 발생되는 예외일때 주로 사용한다.
    // 따라서 개발자가 짠 애플리케이션에서 발생되는 예외는
    // Exception 계열의 예외를 던지도록 하라!
    // 즉 Error를 던지고 싶을 때 RuntimeException 계열의 예외를 던져라!
    static void m2(int i) {
        
        switch(i) {
        case 1 : throw new RuntimeException();
        case 2 : throw new Error();
        case 3 : throw new ArithmeticException();
        case 4 : throw new IndexOutOfBoundsException();
        
        }
    }
    
    
    
    public static void main(String[] args) 
            throws IOException, Exception {
    }
}
