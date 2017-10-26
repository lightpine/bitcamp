// 클래스의 접근 범위 테스트 2
package bitcamp.java100.ch08.ex1.other;

import bitcamp.java100.ch08.ex1.A; // 퍼블릭이라 찾아진다
import bitcamp.java100.ch08.ex1.B; // 접근 불가! 디폴트라!

public class Test5 {

    public static void main(String[] args) {
        new A();
        //new B(); // 디폴트
    }

}
