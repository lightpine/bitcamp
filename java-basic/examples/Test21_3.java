// ## Scanner - 활


package bitcamp.java100;

import java.io.Console;

public class Test21_3{
    
    public static void main(String[] args){
        
        // 콘솔 객체를 준비한다.
        Console console = System.console();
        
        if (console == null) {
            
            System.err.println("콘솔을 지원하지 않습니다."); // err = 에러메시지를 띄울때 사용한다.
            
            System.exit(1); // JVM을 종료한다.
        }
        
        String name;
        int age;
        boolean working;
        float gpa;
        
        name    = console.readLine("이름 ?(예: 홍길동) ");
        age     = Integer.parseInt(console.readLine("나이 ?(예: 20)"));
        working = Boolean.parseBoolean(console.readLine("이름 ?(예: true 또는 false)"));
        gpa     = Float.parseFloat(console.readLine("이름 ?(예: 4.15)"));
        
        System.out.println("----------------------------------");
        System.out.printf("이름   = %s\n", name);
        System.out.printf("나이   = %d\n", age);
        System.out.printf("재직여부 = %b\n", working);
        System.out.printf("졸업학점 = %.2f\n", gpa);
        
    }
}
