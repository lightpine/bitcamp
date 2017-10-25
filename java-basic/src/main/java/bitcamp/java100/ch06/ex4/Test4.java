// 클래스 멤버오 인스턴스 멤버의 활용
package bitcamp.java100.ch06.ex4;

// 클래스 분리
// 계산을 수행하는 코드를 별도의 클래스로 분류해 두면 다른 프로그램을 개발할 때
// 재사용하기 쉬울 것이다. 
// 그래서 각가의 기능별로 클래스로 묶어서 분리하는 것이다.


public class Test4 {
    
    public static void main(String[] args) {
         
        // 다른 클래스에 소속된 메서드를 호출할 때는 클래스 이름을 붙여야 한다.
        
        Calculator1.plus(2);
        Calculator1.plus(5);
        Calculator1.multiple(3);
        Calculator1.minus(7);
        Calculator1.divides(2);
         
         System.out.println(Calculator1.result);

    }

}
