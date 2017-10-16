// ## 메서드 호출

package bitcamp.java100;

// 메모리 호출 후 무조건 되돌아 간다.

public class Test17_10{
   
    static void m1() {
        System.out.println("m1() --->");
        m2();
        System.out.println("m1() <---");
    }
    
    static void m2() {
        System.out.println("    m2() --->");
        m3();
        System.out.println("    m2() <---");
    }
    
    static void m3() {
        System.out.println("        m3() --->");
        m4();
        System.out.println("        m3() <---");
    }
    
    static void m4() {
        System.out.println("             m4()...");
        //while(true) {}
    }
    
    //Eclipse IDE에 있는 디버그 기능을 이용 메서드 호출 과정 추적
    //더블클릭시 파란 점이 생김
    //브레이크 포인트
     public static void main(String[] args) {
         
         System.out.println("main()===> ");
         m1();
         System.out.println("main() <===");
         
         
     }
}

