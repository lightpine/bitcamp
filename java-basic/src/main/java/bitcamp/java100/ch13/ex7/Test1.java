// 예외처리 문법 정리 : Throw를 이용하여 예외 던지기!
package bitcamp.java100.ch13.ex7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Test1 {

    static void m1(int i) throws Throwable {
        
        if (i < 0) {
            
            throw new Throwable();
            
        }
    }
    
    // 타입을 나열할 때 순서는 상관없다.
    static void m2(int i) throws SQLException, Exception,
        IOException,FileNotFoundException {
        
        switch(i) {
        case 1 : throw new Exception();
        case 2 : throw new SQLException();
        case 3 : throw new IOException();
        case 4 : throw new FileNotFoundException();
        }
    }
    
    static void m3(int i) throws Exception {
        
        switch(i) {
        case 1 : throw new Exception();
        case 2 : throw new SQLException();
        case 3 : throw new IOException();
        case 4 : throw new FileNotFoundException();
        }
    }
    
    static void m4(int i) throws Throwable {
        
        switch(i) {
        case 1 : throw new Exception();
        case 2 : throw new SQLException();
        case 3 : throw new IOException();
        case 4 : throw new FileNotFoundException();
        }
    }
    
//    static void m5(int i) throws Object { // 컴파일 오류!
//        
//        switch(i) {
//        case 1 : throw new Exception();
//        case 2 : throw new SQLException();
//        case 3 : throw new IOException();
//        case 4 : throw new FileNotFoundException();
//        }
//    }
    
//    static void m6(int i) throws String { // 컴파일 오류!
//        
//        switch(i) {
//        case 1 : throw new Exception();
//        case 2 : throw new SQLException();
//        case 3 : throw new IOException();
//        case 4 : throw new FileNotFoundException();
//        // throwable타입이 아닌 것은 던질 수 없다.
//        case 5 : throw new String();
//        }
//    }
    
    
    public static void main(String[] args) {
        
    }
}
