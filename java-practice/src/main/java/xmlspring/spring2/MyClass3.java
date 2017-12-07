package xmlspring.spring2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;


public class MyClass3 {
    
    public MyClass3(String name) {
        System.out.println("=> MyClass(String)");
    }
    
    public MyClass3(float left, float right) {
        System.out.println("MyClass(float,float)");
    }
    public MyClass3(MyClass myClass) {
        System.out.println("=> MyClass(MyClass)");
    }
    public MyClass3(MyClass2 myClass2) {
        System.out.println("=> MyClass(MyClass)");
    }
    
}
