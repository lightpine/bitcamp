package bitcamp.java100.ch06.ex3;

public class MyClass2 {
    // static member
      
    // 스태틱 변수 = 클래스 변수 = static member
    // 클래스 이름으로 사용하고, 클래스의 소속된 변수라고 해서
    // 클래스 변수라 부른다.
   
    static int v1 = 100;
    static void m1() { // static method
        System.out.println("MyClass2.m1()");
    } 
    
    // instance member 
    int v2 = 200; // 인스턴스 메서드
    
    void m2() {
        System.out.println("인스턴스.m2()");
    }
    
 
}
