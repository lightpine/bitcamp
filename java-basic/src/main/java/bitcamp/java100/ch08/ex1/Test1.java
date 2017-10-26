// 캡슐화 - 같은 패키지의 클래스가 멤버에 접근할 경우
package bitcamp.java100.ch08.ex1;

public class Test1 {

    public static void main(String[] args) {
        // Test1은 A클래스와 같은 패키지에 있는 클래스이다.
        //  프라이빗 멤버?
        //A.v1 = 100; // 접근 불가!
        
        // 디폴트 멤버
        A.v2 = 200; // OK
        
        // 프로텍티드 멤버
        A.v3 = 300; // OK
                    //Test1이 A에 서브 클래스는 아니지만 같은 패키지의 클래스이다.
        
        // 퍼블릭
        A.v4 = 400; // OK
        

    }

}
