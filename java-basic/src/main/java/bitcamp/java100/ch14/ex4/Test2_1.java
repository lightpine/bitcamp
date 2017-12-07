// 데이터 프로세싱 스트림 클래스 사용법 - ObjectInputStream 사용하기
// 
package bitcamp.java100.ch14.ex4;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test2_1 {
    public static void main(String[] args) throws Exception {
        
        // 다음 데이터를 출력해보자!
        // 조건: 국,영,수 각각의 만점은 1000점이다.
        
        ObjectInputStream in = new ObjectInputStream(
                                    new FileInputStream("test1.dat"));
        
        Score2 s = (Score2)in.readObject();
        
        
        in.close();
        
        System.out.println(s);
    }
}











