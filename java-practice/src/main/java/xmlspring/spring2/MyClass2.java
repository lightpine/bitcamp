package xmlspring.spring2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;


public class MyClass2 {
    
    public MyClass2() {
        System.out.println("=> MyClass()");
    }
    
    public MyClass2(int age) {
        System.out.println("=> MyClass(int)");
    }
    
    public MyClass2(String name) {
        System.out.println("=> MyClass(String)");
    }

    public MyClass2(String name, int age) {
        System.out.println("=> MyClass(String,int)");
    }
    
    public MyClass2(int age, String name) {
        System.out.println("=> MyClass(int,String)");
    }
    
    public MyClass2(String name, int age, boolean working) {
        System.out.println("=> MyClass2(String,int,boolean)");
    }
    
    public static void main(String[] args) throws Exception {
        Constructor<?> c =
                MyClass2.class.getConstructor(int.class,String.class);
        System.out.println(c.getName());
        
        Parameter[] prams = c.getParameters();
        for (Parameter p : prams) {
            System.out.println(p.getName());
        }
    }
}
