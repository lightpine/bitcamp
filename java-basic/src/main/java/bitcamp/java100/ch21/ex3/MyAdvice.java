package bitcamp.java100.ch21.ex3;

import org.springframework.stereotype.Component;

// 특정 위치에 삽입될 코드를 갖고있는 클래스를 정의한다.
public class MyAdvice {
    
    // 삽입될 코드는 메서드로 정의한다.
    public void doBefor() {
        System.out.println("MyAdvice.doBefor()");
    }
    
    public void doAfter() {
        System.out.println("MyAdvice.doAfter()");
    }
    
    public void doAfterReturning() {
        System.out.println("MyAdvice.doAfterReturning()");
    }
    
    public void doAfterThrowing() {
        System.out.println("MyAdvice.doAfterThrowing()");
    }
    
    public void doAround() {
        System.out.println("MyAdvice.doAround()");
    }
}
