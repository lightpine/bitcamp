package spring.annotation;

@MyAnnotation
public class MyClass {

    @MyAnnotation
    public int a;
    
    @MyAnnotation
    public void m1() {
        System.out.println("Hello");
    }
    
    public void m2(@MyAnnotation int a, @MyAnnotation String b) {
        @MyAnnotation
        int x = 10;
    }
}
