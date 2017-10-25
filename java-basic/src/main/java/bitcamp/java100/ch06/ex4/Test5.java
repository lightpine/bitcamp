// 클래스 멤버오 인스턴스 멤버의 활용
package bitcamp.java100.ch06.ex4;

// 스태틱 변수의 한계


public class Test5 {
    
    public static void main(String[] args) {
        // 다음 2개의 식을 동시에 계산 해보자
        // 2 + 5 * 3 - 7 / 2
        // 3 * 6 - 5 + 11 / 2
        
        // 첫번째 식 계산
        Calculator1.plus(2);
        Calculator1.plus(5);
        Calculator1.multiple(3);
        Calculator1.minus(7);
        Calculator1.divides(2);
        
        System.out.println(Calculator1.result);
        
        // 두번째 식 계산
        Calculator1.result = 0;
        Calculator1.plus(3);
        Calculator1.multiple(6);
        Calculator1.minus(5);
        Calculator1.plus(11);
        Calculator1.divides(2);
         
         System.out.println(Calculator1.result);

    }

}
