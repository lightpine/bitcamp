// 상속을 이용한 기능 확장
package bitcamp.java100.ch07.ex2;

public class CalculatorA extends Calculator{
    // 기존의 calculator가 갖고있는 코드는 이 클래스에 복사해올 필요가 없다.
    
    void plus(int value) {
        this.result += value;
    }
    
    void minus(int value) {
        this.result -= value;
    }
    
}
