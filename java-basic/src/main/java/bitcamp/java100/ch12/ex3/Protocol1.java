// 인터페이스를 정의하는 방법
package bitcamp.java100.ch12.ex3;


public interface Protocol1 {
    // 인터페이스의 모든 메서드는 규칙이기 때문에 
    // 모든 메서드는 추상 메서드이다
    void m1();
    
    // 물론 abstract 명시적으로 붙일 수 있다.
    abstract void m2();
    
    // 인터페이스는 규칙이기 떄문에 모든 메서드는 공개되어야 한다.
    // 즉 public 이다.
    // 다음과 같이 public을 명시해도 된다.
    public abstract void m3();
    
    // public abstract 생략할수도 있다.
    void m4();
    
    // 모든 메서드가 추상메서드 이기 때문에 구현해서는 안된다.
    //void m5() {} // 컴파일 오류!
    
    
}
