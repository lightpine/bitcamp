// 스레드 만들고 사용하기 II - Runnable 인터페이스 구현하
package bitcamp.java100.ch16.ex1;

public class Test3 {

    static class MyRunnable implements Runnable{
        @Override
        public void run() {
            
            for (int i = 0; i < 10000; i++) {
                System.out.println("MyThread => " + i);
            }
            
        }
    }
    // 스레드 만드는 방법 
    // 1) Thread를 상속받기
    public static void main(String[] args) {
        
        Thread t = new Thread(new MyRunnable());
        
        t.start();
        
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        
        
    }

}
