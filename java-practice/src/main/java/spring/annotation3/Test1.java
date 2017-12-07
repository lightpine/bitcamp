package spring.annotation3;

import java.lang.annotation.Annotation;

public class Test1 {
    public static void main(String[] args) {
        
        Annotation[] annos = MyClass1.class.getAnnotations();
        
        for (Annotation a : annos) {
            System.out.println(a.annotationType().getName());
        }
        
    }
}
