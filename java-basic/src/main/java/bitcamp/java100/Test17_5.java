// ## 메서드

package bitcamp.java100;

public class Test17_5{
   
    //: 값을 반환하는 메서드
    static String m1() {
        return "Hello";
    }
    static int m2() {
        return 100;
    }
    static boolean m3() {
        return true;
    }
    
    //static int m4() {return "Hello";}
    //static int m5() {return;}
     static int m6() {
         return 100;
         //int a = 100; // 영원히 실행 안되는 문장!
     }
     
     public static void main(String[] args) {
         
         String v = m1();
         System.out.println(v);
         
         //리플레이스 템프 위드 쿼리(리펙토링100가지중 한가지)
         //메서드 명은 동사형식으로 한다.
         //단점 디버깅에는 좋지 않은 구조
         //코드를 읽어낼 때 좋은 구조
         System.out.println(m1());
         
         m1(); // 반환값이 버려지는 형태 
         
         //String s = m2(); // 자료형이 안맞으면 컴파일 오류!
         
     }
        
}

