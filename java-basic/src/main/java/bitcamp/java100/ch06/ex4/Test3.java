// 클래스 멤버오 인스턴스 멤버의 활용
package bitcamp.java100.ch06.ex4;
// 스태틱 변수 사용
public class Test3 {
    
    static int result;
    
    static void plus(int value) {
         result += value;
    }
    static void minus(int value) {
         result -= value;
    }
    static void multiple(int value) {
         result *= value;
    }
    static void divides(int value) {
         result /= value;
    }
    
    public static void main(String[] args) {
         
         plus(2);
         plus(5);
         multiple(3);
         minus(7);
         divides(2);
         
         System.out.println(result);

    }

}
