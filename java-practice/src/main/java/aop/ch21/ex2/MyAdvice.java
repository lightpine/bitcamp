package aop.ch21.ex2;

import org.springframework.stereotype.Component;

@Component
public class MyAdvice {
    
    public void advice1() {
        System.out.println("MyAdvice.advice1()");
    }
    
    public void advice2() {
        System.out.println("MyAdvice.advice2()");
    }
}
