package bitcamp.java100.ch12.ex5;

public class Test2 implements D{
    
    // D인터페이스
    @Override public void m4() {System.out.println("m4()");}
    @Override public void m1() {System.out.println("m1()");}
    @Override public void m3() {System.out.println("m3()");}
    @Override public void m2() {System.out.println("m2()");}
    
    // m1같은경우 2개가 있지만 여기서 선언해줌으로 만족한다!
    
}
