package spring.annotation6;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation1 {
    
    String[] name() default {"홍길동","임꺽정", "유관순"};
    int[] age() default {30, 35, 19};
}
