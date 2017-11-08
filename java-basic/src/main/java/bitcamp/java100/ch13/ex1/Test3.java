// 예외처리 문법을 사용하여 예외상황을 처리하기.
package bitcamp.java100.ch13.ex1;

import java.io.Console;

public class Test3 {

    public static void main(String[] args) {
        
        Console console = System.console();
        
        if (console == null) {
            System.err.println("콘솔 입력을 지원하지 않습니다.");
            System.exit(1);
        }
        
        
        // 인스턴스 주소가 null인 상태에서 인스턴스를 불러올때 
        // 널포인트 입셉션 오류가 뜬다!
        
        
        while (true) {
            
            try { // 예외상황이 발생할 가능성이 있는 코드는 try 블록에 둔다.
                int a = Integer.parseInt(console.readLine("a? ")); 
                String op = console.readLine("연산자? ");
                int b = Integer.parseInt(console.readLine("b? "));
            
                switch(op) {
                case "+": System.out.printf("결과 = %d\n", a + b); break;
                case "-": System.out.printf("결과 = %d\n", a - b); break;
                case "*": System.out.printf("결과 = %d\n", a * b); break;
                case "/": System.out.printf("결과 = %d\n", a / b); break;
                case "%": System.out.printf("결과 = %d\n", a % b); break;
                default: System.out.println("지원하지 않는 연산자 입니다.");
                }
            }catch (Throwable err) {
                // 예외상황이 발생할 경유 어떻게 처리할 지 
                // 그 코드를 둔다.
                // 이 예제에서는 오류가 발생 했을때 간단히 안내를 출력하고
                // 프로그램 멈춤없이 계속 실행한다.
                System.out.println("숫자 형식이 올바르지 않습니다.");
            }
            
        }
        
        
        // 예외가 발생할 가능성이 있는 코드를
        // try.. catch... 블록에 묶어두면, 다음 두 가지의 이익을 얻을 수 있다.
        // 1) 예외가 발생하더라도
        //    프로그램을 멈추지 않고 계속 실행할 수 있다.
        // 2) 예외를 처리하는 코드와 원래 실행 코드를 분리함 으로써
        //    코드의 가독성을 높여준다!
        // 이것이 예외처리 문법을 사용하는 이유이다.
        // 
        
    }
}
