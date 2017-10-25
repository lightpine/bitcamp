// 상속 (inheritance) - 기존의 코드를 복사해서 사용할 때 문제점
package bitcamp.java100.ch07.ex2;

// 기존 코드에 문제가 있으면 그 코드를 사용해서 만든 모든 코드를 변경해야 한다.

public class Test4 {
    public static void main(String[] args) {
        // 기존의 calculator를 사용하여 작업을 수행한다.
        Calculator calc = new Calculator();
        calc.result = 1;
        calc.multiple(5);
        
        // 무심코 0으로 나눈다.
        // 기존의 divide는 0으로 나누는 경우를 처리하지 않았기 때문에
        // 즉시 실행 오류를 발생시킨다.
        // JVM은 실행 오류를 보고받으면 즉시 프로그램 실행을 멈춘다.
       
        calc.divide(0);
        
        calc.multiple(17);
        
        System.out.println(calc.result);
    }
}
