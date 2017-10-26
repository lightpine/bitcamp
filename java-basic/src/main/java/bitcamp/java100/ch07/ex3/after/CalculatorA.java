// 상속 (inheritance) - 기존의 calculator에 더하기 빼기 기능을 추가한다.
package bitcamp.java100.ch07.ex3.after;

public class CalculatorA extends Calculator {
    void plus(int value) {
        this.result += value;
    }
    
    void minus(int value) {
        this.result -= value;
    }
    
}
