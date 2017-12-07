package spring.annotation6;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation2 {
    
    String[] name() default "유관순";
    int[] age() default 19;
}
