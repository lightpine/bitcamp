// 예외처리 문법 정리 : 예외 체인
package bitcamp.java100.ch13.ex8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Test1 {

    static void m1() {
        m2();
    }
    static void m2() {
        m3();
    }
    static void m3() {
        m4();
    }
    static void m4() {
        
    }
    public static void main(String[] args) {
        m1();
    }
}
