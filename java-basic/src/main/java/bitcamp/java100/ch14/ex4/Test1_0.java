// 데이터 프로세싱 스트림 클래스 사용법 - ObjectOutputStream 사용하기
// 
package bitcamp.java100.ch14.ex4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test1_0 {
    public static void main(String[] args) throws Exception {
        
        // 다음 데이터를 출력해보자!
        // 조건: 국,영,수 각각의 만점은 1000점이다.
        Score s = new Score("홍길동", 800, 900, 1000);
        
        ObjectOutputStream out = new ObjectOutputStream(
                                    new FileOutputStream("test0.dat"));
        
        out.writeObject(s); // Score 클래스는 직렬화를 허락하지 않았기 때문에
                            // 실행 오류가 발생한다.
        
        out.writeUTF(s.getName());
        out.writeInt(s.getKor());
        out.writeInt(s.getEng());
        out.writeInt(s.getMath());
        
        out.close();
        
        System.out.println("출력을 완료했습니다.");
    }
}











