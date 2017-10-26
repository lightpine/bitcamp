// 상속 (inheritance) - 기존의 calculator에 더하기 빼기 기능을 추가한다.
package bitcamp.java100.ch07.ex3.before;

public class CalculatorA {
    int result;
    
    void multiple(int value) {
        this.result *= value;
    }
    
    void divide(int value) {
        if (value == 0) {
            System.err.println("0으로 나누면 안됩니다!");
            return;
        }
        this.result /= value;
    }
    
    void plus(int value) {
        this.result += value;
    }
    
    void minus(int value) {
        this.result -= value;
    }
    
}
