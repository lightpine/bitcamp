package java100.app.contllor;

public interface Controller {
    
    // abstract가 생략된 것이다 컴파일 할때 자동으로 붙는다.
    // 인터페이스에선 구현하는 것이 아닌다.
    /*public abstract*/ void execute();
    
    // 객체를 사용하기 전에 준비시키는 메서드
    default void init() {}
    
    // 프로그램을 종료하기 전에 객체에게 마무리 작업을 시키는 메서드
    default void destroy() {}
    
}
