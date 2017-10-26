// 중첩(Nested) 클래스 또는 Inner 클래스
// 패키지에 직접 소속된 클래스가 아니라 다른 클래스 안에 소속된 클래스를 말한다.
//

package bitcamp.java100.ch08.ex1;

// 다음 X 클래스는 같은 파일에 있지만 엄연한 패키지 멤버 클래스 이다.
// 중첩 클래스는 아래에 Test6에 소속된 클래스를 말한다.
class x1{}
// 그래서 퍼블릭 또는 디폴트 이 두가지로만 접근을 제한 할 수 있다.
// 다음과 같이 프로텍티드 프라이빗 안된다.

//protected class x2{} // 컴파일 오류!
//private class x3{} // 컴파일 오류!




public class Test6 {
    // 클래스 안에 선언된 클래스를 중첩 클래스라 부른다.
    // 중첩 클래스도 클래스의 멤버로 보기 떄문에
    // 변수나 메서드처럼 모든 접근범위를 가진 수 있다.
    
    private class x4{}
    class x5{};
    protected class C6{};
    public class X7{};
    public static void main(String[] args) {
        
    }

}


