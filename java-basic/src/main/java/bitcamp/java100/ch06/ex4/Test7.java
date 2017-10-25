// 클래스 멤버오 인스턴스 멤버의 활용
package bitcamp.java100.ch06.ex4;

// 인스턴스 메서드의 활용
// 인스턴스 메서드에는 인스턴스 주소를 저장하는 내장변수 this 가 있다.

public class Test7 {
    
    public static void main(String[] args) {
        // 다음 2개의 식을 동시에 계산 해보자
        // 2 + 5 * 3 - 7 / 2
        // 3 * 6 - 5 + 11 / 2
        
        // 각 식의 계산 결과를 개별적으로 관히라기 위해 result변수가 들어있는 
        // 인스턴스를 준비한다.
        
        Calculator3 c1 = new Calculator3();
        Calculator3 c2 = new Calculator3();
        
        // 인스턴스 메서드를 호출할 때는 앞에 인스턴스 주소를 줘야한다.
        
        // 첫번째 식 계산
        c1.plus(2);
        c1.plus(5);
        c1.multiple(3);
        c1.minus(7);
        c1.divides(2);
        
        System.out.println(c1.result);
        
        // 두번째 식 계산
        c2.plus(3);
        c2.multiple(6);
        c2.minus(5);
        c2.plus(11);
        c2.divides(2);
         
         System.out.println(c2.result);

    }

}
