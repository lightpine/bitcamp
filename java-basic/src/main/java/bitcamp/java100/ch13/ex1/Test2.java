// 예외상황이 발생할 것을 예측하여 조건문으로 처리하기
package bitcamp.java100.ch13.ex1;

import java.io.Console;

public class Test2 {

    public static void main(String[] args) {
        
        Console console = System.console();
        
        if (console == null) {
            System.err.println("콘솔 입력을 지원하지 않습니다.");
            System.exit(1);
        }
        
        
        // 인스턴스 주소가 null인 상태에서 인스턴스를 불러올때 
        // 널포인트 입셉션 오류가 뜬다!
        
        
        while (true) {
            
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
        }
        
        // 이 예제의 문제점
        // Test1과 달리 콘솔 객체를 사용하기 전에 유효 여부를 검사한 뒤에
        // 사용하였다. 
        // 혹시 사용하지 못하는 상황이라도 간단한 오류 메세지를 통해
        // 사용자에게 프로그램이 종료된 이유를 알렸다.
        // 즉 예외상황을 부드럽게 처리하였다.
        // 문제는.
        // 사용자가 숫자를 입력할 때 숫자가 아닌 문자를 입력할 경우
        // 그 문자를 숫자로 바꾸려 하다가 예외가 발생한다는 점이다.
        // 더 심각한 문제는 
        // 예외가 발생하자마자 즉시 프로그램 실행을 멈춘다는 점이다. 
        // 개인용 PC에서 실행하는 프로그램인 경우에는 프로그램을 즉시 멈추더라도
        // 충격이 크지 않지만 
        // 24시간 365일 내내 실행되어야 하는 프로그램인 경우
        // 멈추는 즉시 치명적인 상황이다.
        // 현재 이 프로그램이 그렇다!
        // 숫자로 변활할 수 없는 문자를 입력하면 예외가 발생하고
        // 프로그램이 멈춘다.
        
    }
}
