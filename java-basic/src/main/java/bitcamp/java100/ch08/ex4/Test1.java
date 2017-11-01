// equals 오버라이딩 전
package bitcamp.java100.ch08.ex4;

import java.util.Scanner;

public class Test1 {
    
    public static void main(String[] args) {
           Score s1 = new Score(1, "홍길동", 100, 100, 100);
           Score s2 = new Score(1, "홍길동", 100, 100, 100);
           
           if (s1 != s2) {
               System.out.println("s1과 s2는 주소가 다르다!");
           }
           
           if (s1.equals(s2)) {
               System.out.println("s1과 s2의 내용은 같다!");
           }
           
           // Score 클래스에 대해 equals를 호출하는 것을
           // Score의 수퍼클래스인 Object의 eqauls를 호출하는것이다.
           // Object의 equals는 원래 같은 인스턴스인지를 검사한다.
           // 따라서 당연히 s1과 s2는 다른인스턴스 이기 때문에
           // 결과는 false이다.
           
           // String 클래스처럼 eqauls가 인스턴스의 내용이 같은지를 비교하게 만들고 싶다.
           // => 상속받은 eqauls를 오버라이딩 하라.
           
           
           
           
    }

}
