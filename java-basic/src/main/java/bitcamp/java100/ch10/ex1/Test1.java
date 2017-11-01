package bitcamp.java100.ch10.ex1;

import bitcamp.java100.ch10.ex1.other.C;

public class Test1 {

    public static void main(String[] args) {
        
        A obj1 = new A();
        
        bitcamp.java100.ch10.ex1.other.B obj2 = 
                new bitcamp.java100.ch10.ex1.other.B();
        
        //Other.B obj3 = new other.B(); // 컴파일 오류!
        
        C obj4 = new C();
        
        //bitcamp.java100.ch10.ex1.other.D obj5 = 
        //        new bitcamp.java100.ch10.ex1.other.D(); // 컴파일 오류!
        F obj6 = new F();
        G obj7 = new G();
        
        
    }

}
