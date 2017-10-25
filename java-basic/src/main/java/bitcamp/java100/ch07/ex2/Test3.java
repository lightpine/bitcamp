// 상속 (inheritance) - 기존의 calculator에 곱하기 나누기 기능을 추가한다.
package bitcamp.java100.ch07.ex2;

public class Test3 {
    public static void main(String[] args) {
        CalculatorB calc = new CalculatorB();
        calc.result = 1;
        calc.multiple(10);
        calc.multiple(17);
        calc.divide(3);
        calc.remainder(5);
        
        System.out.println(calc.result);
    }
}
