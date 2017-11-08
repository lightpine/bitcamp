package bitcamp.java100.ch12.ex5;

public interface Test4 extends A,E{
    // 이 인터페이스는 컴파일 오류이다!
    // 왜?
    // A의 m1을 상속받게 되면 타입이 void가 되고,
    // E의 m1을 상속받게 되면 타입이 void가 되고,
    
    
}
