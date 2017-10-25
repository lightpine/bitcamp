// 클래스 멤버오 인스턴스 멤버의 활용
package bitcamp.java100.ch06.ex4;

// 인스턴스 변수의 활용
// 메서드를 실행할 때 개별적으로 관리되어야 할 값이 있다면
// 즉 값을 개별적으로 관히라고 싶다면 인스턴스 변수에 저장하고,
// 공통으로 한 변수에서 관리하고 싶다면 스태틱 변수에 저장하라!
public class Test6 {
    
    public static void main(String[] args) {
        // 다음 2개의 식을 동시에 계산 해보자
        // 2 + 5 * 3 - 7 / 2
        // 3 * 6 - 5 + 11 / 2
        
        // 각 식의 계산 결과를 개별적으로 관히라기 위해 result변수가 들어있는 
        // 인스턴스를 준비한다.
        
        Calculator2 c1 = new Calculator2();
        Calculator2 c2 = new Calculator2();
        
        // 첫번째 식 계산
        Calculator2.plus(c1, 2);
        Calculator2.plus(c1, 5);
        Calculator2.multiple(c1, 3);
        Calculator2.minus(c1, 7);
        Calculator2.divides(c1, 2);
        
        System.out.println(c1.result);
        
        // 두번째 식 계산
        Calculator2.plus(c2, 3);
        Calculator2.multiple(c2, 6);
        Calculator2.minus(c2, 5);
        Calculator2.plus(c2, 11);
        Calculator2.divides(c2, 2);
         
         System.out.println(c2.result);

    }

}
