
package bitcamp.java100.ch06.ex3;

public class MyClass3 {
    // static member
      
    // 스태틱 변수 = 클래스 변수 = static member
    // 클래스 이름으로 사용하고, 클래스의 소속된 변수라고 해서
    // 클래스 변수라 부른다.
   
    static int v1 = 100;
    
    static void m1() { // static method
        System.out.println(v1);
    } 
    // static block
    // 스태틱 변수가 생성된 후 자동으로 실행되는 블록
    // 그래서 보통 스태틱변수를 초기화시키는 코드를 이 블록에 둔다.
    
    static {
        System.out.println("MYClass3 static block 실행");
        v1 = 300;
    }
    // 한 클래스에 스태틱 블록을 여러개 만들 수 있지만 가능한 한개만 만든다.
    // 괜히 많이 만들면 코드를 이해하는데 오히려 방해된다.
    static {
        System.out.println("MYClass3 static block 실행2222222");
    }
 
}
