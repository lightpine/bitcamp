// 스태틱 맴버 - 클래스 로딩과 스태틱 블록 실행 시
package bitcamp.java100.ch06.ex3;

public class Test7 {
        
    static class A{ //2 
        static int a = 100; //3
        static { // 4
            System.out.println("A의 스태틱 블록 실행!");
            System.out.printf("A==> a = %d\n",A.a); // a 100
            B.b = 222; // b =222
            System.out.printf("A==> a = %d\n",A.a); // a 111
            System.out.println("A의 스태틱 블록 종료!");
        }
    }
    
    static class B{
        static int b = 200; // 5
        static {
            System.out.println("B의 스태틱 블록 실행!");
            System.out.printf("B==> b = %d\n",B.b); // 200
            A.a = 111; // 6
            System.out.printf("B==> b = %d\n",B.b);  // 200
            System.out.println("B의 스태틱 블록 종료!");
        }
    }
        public static void main(String[] args) {
            new A(); // 1
            System.out.println(B.b);
    }
}

