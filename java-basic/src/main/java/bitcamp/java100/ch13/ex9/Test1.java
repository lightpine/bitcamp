// 예외처리 문법 정리 : 예외를 던질 때 간단한 내용을 포함 시키자!
package bitcamp.java100.ch13.ex9;

public class Test1 {
    static void m1() throws Exception {
        throw new Exception();
    }
    
    static void m2() throws Exception {
        throw new Exception("이래서...저래서..예외가 발생했어요~↑↓!");
    }
    
    public static void main(String[] args) {
        try {
            m1();
        }catch(Exception e) {
            // m1에서 던지는 예외 객체는 예외 상황에 대한
            // 자세한 정보를 포함하고 있지 않기 때문에
            // 예외 상황을 짐작하기가 어렵다!
            // 즉 유지보수할 때 버그를 유추(디버깅) 하기가 어렵다. 
            System.out.println("예외가 발생했다나 뭐라나");
        }
        
        try {
            m2();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
