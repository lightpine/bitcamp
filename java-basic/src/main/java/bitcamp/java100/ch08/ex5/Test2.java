// compute 오버라이딩 후
package bitcamp.java100.ch08.ex5;

import java.util.Scanner;

public class Test2 {
    
    public static void main(String[] args) {
        ScoreEx2 s1 = new ScoreEx2(1, "홍길동", 100, 100, 100, 80, 80);
           
           System.out.printf("합계 = %d\n", s1.getSum());
           System.out.printf("평균 = %f\n", s1.getAver());
           // ScoreEX가 Score로부터 상속받은 compute를 재정의하였기 떄문에
           // 과학과 사회점수를 포함한 계산결과를 출력한다.
           
           s1.setKor(80);
           System.out.printf("합계 = %d\n", s1.getSum());
           System.out.printf("평균 = %f\n", s1.getAver());
           
           // setkor()은 Score클래스의 메서드이다.
           // setKor에서 호출하는 컴퓨트는 Score의 compute인가?
           // 아니면 ScoreEx의 컴퓨트인가?
           // 
           // 결론
           // compute를 호출할 때 어떤 클래스의 인스턴스 주소를 줬는지에 따라 결정된다.
           // setKor을 호출할 때 넘겨준 인스턴스는 Score가 아니라 ScoreEx이다.
           // 따라서 setKor 메서드의 this에는 ScoreEx의 주소가 들어있다.
           // 그리고 그 ScoreEX를 가지고 compute를 호출하는 것이기 때문에
           // compute를 찾을 떄 일단 ScoreEx에서 찾아 올라온다
           }

}
