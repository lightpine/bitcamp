// Finally 블록이 필요한 경우
package bitcamp.java100.ch13.ex3;

import java.io.FileReader;

public class Test2 {

    public static void main(String[] args) {
        
        FileReader in = null;
        try {
            in = new FileReader("./build.gradle2");
            System.out.println("파일 읽기 준비 완료!");
            
            int ch;
            while(true) {
                ch = in.read();
                if (ch == -1) break;
                System.out.print((char)ch);
                
            }
            System.out.println("-----------------------------");
            
        } catch(Exception e){
            System.out.println("파일 읽기 중 오류 발생!");
        } finally { // 언제 쓰느냐?! 보통 파일 입출력, 소켓 네트워킹, DB에서 사용한다.
            System.out.println("finally 실행!");
            // try블록이 정상적으로 실행되든 오류가 발생하여
            // catch블록이 실행되든 상관없이 
            // finally블록은 반드시 실행된다.
            // 그래서 이 블록에는 주로 사용한 자원을 해제시키는 코드를 둔다.
            try {
                // close메서드도 예외를 던질 수 있기 때문에 try...catch 블록안에서 실행해야 한다.
            in.close();
            }catch(Exception e) {
                //물론 close하다가 예외가 발행한 것은 처리할 필요가 없다.
                // 사용한 파일을 채제시키다가 오류가 발생했는데
                // 처리할것이 뭐가 있겠는가? 그냥 둔다.
            }
        }
    }
}
