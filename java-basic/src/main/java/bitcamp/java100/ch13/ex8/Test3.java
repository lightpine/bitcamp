// 예외처리 문법 정리 : RuntimeExcpetion을 이용한 예외 체인 관리
package bitcamp.java100.ch13.ex8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Test3 {

    static void m1() {
        m2();
    }
    static void m2() {
        m3();
    }
    static void m3() {
        m4();
    }
    static void m4()  {
        throw new RuntimeException();
    }
    public static void main(String[] args)  {
        // m4()에서 발생된 스텔스 예외가 여기까지 전달 된다면
        // RuntimeExceotion 예외이기 때문에
        // 물론 main()에서도 try...catch를 안써도 된다.
        // 하지만,
        // 최소한 main()에서는 예외의 종류에 상관없이 처리하라!
        try {
            m1();
        }catch(Exception e) {
            // 예외가 발생했을 때 제대로 종료할 수 있게
            // 최소한 main() 메서드에서는 예외를 처리하라!
            
        }
        
        
    }
}
