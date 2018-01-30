package aop.ch21.ex5;

public class MyAdvice {
    
    public void doBefore(String name) {
        System.out.printf("MyAdvice.doBefore: %s\n", name);
    }
    
    public void doAfter() {
        System.out.println("MyAdvice.doAfter()");
    }
    
    public void doAfterReturning(Object returnValue) {
        System.out.printf("MyAdvice.doAfterReturning: %s\n", returnValue);
    }
    
    public void doAfterThrowing(Exception error) {
        System.out.printf("MyAdvice.doAfterThrowing: %s\n", error);
    }
    
    public void doAround() {
        System.out.println("MyAdvice.doAround()");
    }
}

