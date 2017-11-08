package bitcamp.java100.ch12.ex3;

public class Test3 {
    
    public static void main(String[] args) {
        System.out.println(Protocol3.AA);
        
        //Protocol3.AA = 300; // 컴파일 오류!
        
        // 인터페이스를 사용하고 싶다면 
        // 인터페이스를 구현한 클래스를 먼저 만들고 
        // 그 인스턴스를 생성하여 사용하라!
        class MyClass implements Protocol3{

            @Override
            public void m1() {System.out.println("m1()");}

            @Override
            public void m2(int p) {System.out.println("m2()");}

            @Override
            public void m3(String v) {System.out.println("m3()");}
            
        }
        Protocol3 obj = new MyClass();
        obj.m1();
        obj.m2(10);
        obj.m3("gg");
        
    }
}
