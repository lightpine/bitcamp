package spring.annotation2;

import spring.annotation3.MyAnnotation1;
import spring.annotation3.MyClass1;

public class Test1 {
    public static void main(String[] args) {
        
        MyAnnotation1 anno = MyClass1.class.getAnnotation(MyAnnotation1.class);
        
        System.out.println(anno.name());
        System.out.println(anno.age());
    }
}
