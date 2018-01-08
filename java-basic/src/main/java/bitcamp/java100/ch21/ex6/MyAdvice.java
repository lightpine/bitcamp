package bitcamp.java100.ch21.ex6;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    
    // XMl 설정파일 대신에 어노테이션을 사용하여 asvice를 지정할 수 있다.
    
    @Before("execution(* bitcamp.java100.ch21.ex6.X.*(..)) and args(name)")
    public void doBefor(String name) {
        System.out.printf("MyAdvice.doBefor: %s\n", name);
    }
    
    public void doAfter() {
        System.out.println("MyAdvice.doAfter()");
    }
    
    // 리턴 값 받기
    @AfterReturning(
            value="execution(* bitcamp.java100.ch21.ex6.X.*(..))",
            returning="returnValue")
    public void doAfterReturning(Object returnValue) {
        System.out.printf("MyAdvice.doAfterReturning: %s\n", returnValue);
    }
    
    // 예외 객체 받기
    @AfterThrowing(
            value="execution(* bitcamp.java100.ch21.ex6.X.*(..))",
            throwing="error")
    public void doAfterThrowing(Exception error) {
        System.out.printf("MyAdvice.doAfterThrowing: %s\n", error.getMessage());
    }
    
    public void doAround() {
        System.out.println("MyAdvice.doAround()");
    }
}
