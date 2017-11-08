// 예외의 종류 : RuntimeException 계열 예외
//              Errer 계열의 예외
package bitcamp.java100.ch13.ex2;

public class Test2 {

    public static void main(String[] args) {
        
        // Errer, RuntimeException이 발생하는 코드는
        // try...catch... 사용을 강제하지 않는다.
        // 선택 사항이다.
        // 즉 try... catch로 예외를 처리하지 않더라도
        // 컴파일 오류가 발생하지 않는다.
        
        // 예) 0으로 나눌때 ArithmeticException 예외가
        // 대표적으로 try... catch를 사용하지 않아도 되는 예외이다.
        try {
            System.out.printf("%d / %d = %d\n", 20, 0, 20 / 0);
        }catch (RuntimeException e) {
            System.out.println("나누기 실행중 오류 발생!");
        }
        
        // 다만 try...catch로 처리하지 않으면
        // 예외가 발생할 때 그 코드를 포함하고 있는 메서드의 
        // 상위 호출자에게 예외를 던진다.
        // 그 상위 호출자도 try... catch로 처리하지 않는다면
        // 또 그 상위의 상위로 계속 올라가면서 예외를 전달한다.
        // 마지막은 main()을 호출한 JVM에게 전달한다.
        // 예외가 JVM에게 전달되면,
        // 즉시 프로그램 실행을 멈추고 예외 정보를 출력한다.
        
    }
}
