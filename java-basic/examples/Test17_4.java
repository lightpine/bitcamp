// ## 메서드

package bitcamp.java100;

public class Test17_4{
   
    //가변하는 파라메터 값을 쓰고싶을때 파라메터에 ... <- 을 붙이면 된다.
    static void m1(int... values) {
        System.out.printf("아규먼트 개수 %d\n", values.length);
        for (int v : values) {
           System.out.println(v);
           
           
        }
        System.out.println("--------------------------------------------------------------");
    }
    
    //static void m2(int... values, int... valuse2) {} 컴파일 오류!
    //static void m2(int... values, String... valuse2) {} 컴파일 오류!
    static void m3(String name, int age, int... valuse) {}
    //static void m4(int... valuse, int age, String name) {}
    //static void m5(String name, int... valuse, int age) {}
    //static void m6(String name, int... valuse, String tell) {}
    //: 가변길이 파라미터의 응용
    static void sum(int... valuse) {
        int s = 0;
        for (int v : valuse) {
            s += v;
            
        }
        System.out.printf("합계 : %d\n",s);
    }
    
     public static void main(String[] args) {
         m1();
         m1(10);
         m1(10,20);
         m1(10,20,30);
         
         //m1(10, "hello");
         sum();
         sum(1,2,3,4,5);
         sum(100, 80, 70, 90);
         
     }
     
        
}

