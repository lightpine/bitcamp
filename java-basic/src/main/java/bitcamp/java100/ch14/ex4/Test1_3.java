// 데이터 프로세싱 스트림 클래스 사용법 - ObjectOutputStream 사용하기
// 
package bitcamp.java100.ch14.ex4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test1_3 {
    public static void main(String[] args) throws Exception {
        
        // 다음 데이터를 출력해보자!
        // 조건: 국,영,수 각각의 만점은 1000점이다.
        
//        Score3 s = new Score3("홍길동", 800, 900, 1000);
        Score4 s = new Score4("홍길동", 800, 900, 1000, 900);
        
        ObjectOutputStream out = new ObjectOutputStream(
                                    new FileOutputStream("test3.dat"));
        
        out.writeObject(s);
        
        out.close();
        
        System.out.println("출력을 완료했습니다.");
    }
}











