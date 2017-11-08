// 예외처리 문법 정리 : 예외 체인
package bitcamp.java100.ch13.ex8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Test2 {

    static void m1() throws Exception {
        m2();
    }
    static void m2() throws Exception {
        m3();
    }
    static void m3() throws Exception {
        m4();
    }
    static void m4() throws Exception {
        throw new Exception();
    }
    public static void main(String[] args)  {
        try {
            m1();
        }catch(Exception e) {
            // 예외가 발생했을 때 제대로 종료할 수 있게
            // 최소한 main() 메서드에서는 예외흫 처리하라!
            
        }
        
        
    }
}
