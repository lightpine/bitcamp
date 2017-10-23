// 스태틱 맴버 - 스태틱 
package bitcamp.java100.ch06.ex3;

public class Test5 {
    static int v1 = 100;
    
    static void m1() {// 인스턴스가 없어도
        System.out.println("m1()");
        }
    int v2 = 200; // 인스턴스가 있어야만 
    void m2() {
        System.out.println("m2()");
    }

    public static void main(String[] args) {
        System.out.println(v1); // ok
        m1();
        
        // 인스턴스 변수는 인스턴스 주소를 통해서만 접근 할 수 있다.
        // System.out.println(v2); // 컴파일 오류!
        // 인스턴스 메서드는 호춯할 때 반드시 인스턴스 주소를 메서드 앞에 줘야 한다.
        // m2(); //컴파일 오류!
        
        // 스태틱 멤버에서 인스턴스 멤버를 사용하려면?
        // 인스턴스를 만들자!
        
        Test5 obj1 = new Test5();
        obj1.v2 = 300; // ok
        obj1.m2(); // ok
        
        
    }
}

