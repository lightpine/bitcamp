package bitcamp.java100.ch06.ex4;

public class Calculator2 {
    // 계산 결과를 여러 개 개별적으로 관리하기 위해 인스턴스 변수로 전환한다.
    int result;
    
    // 스태틱 멤버는 인스턴스 멤버를 사용할 수 없다.
    // 인스턴스 주소가 있어야만 사용할 수 있다.
    static void plus(Calculator2 that, int value) {
        that.result += value;
    }
    static void minus(Calculator2 that, int value) {
        that.result -= value;
    }
    static void multiple(Calculator2 that, int value) {
        that.result *= value;
    }
    static void divides(Calculator2 that, int value) {
        that.result /= value;
    }
}
