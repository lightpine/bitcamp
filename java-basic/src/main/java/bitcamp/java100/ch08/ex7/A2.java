// 다형성 - 오버라이딩 문법 정리
package bitcamp.java100.ch08.ex7;

public class A2 extends A{
    public void teat1() {
        m4(); //상속 받은 public 사용가능
        m3(); // 서브 클래스에서 상속 받은 pretected 멤버 사용 가능!
        m2(); // 같은 패키지에서 상속 받은 default 멤버 사용 가능!
        //m1(); // private 멤버는 오직 그 클래스 안에서만 사용할 수 있다.// 컴파일 오류!
        // 그러나 다음 코드에서 m1을 추가하게 되면 여기서 호출할 수 있다.        
    }
    
    // A 클래스의 m1을 오버라이딩 하는것이 아니다.
    // 그냥 A2클래스의 새로 추가한 메서드이다.
    // 이유? 
    // private멤버는 오직 그 클래스 안에서만 사용할 수 있다.    
    private void m1() {
        System.out.println("B.m1()");
    }

    // 수퍼 클래스 A의 m2메서드를 오버라이딩 한다.
    void m2() {}
    // 수퍼 클래스 A의 m3메서드를 오버라이딩 한다.
    protected void m3() {}
    // 수퍼 클래스 A의 m4메서드를 오버라이딩 한다.
    public void m4() {}
    
    // 즉 자식 클래스에서 접근 가능한 메서드에서만 오버라이딩 할 수 있다.
}
