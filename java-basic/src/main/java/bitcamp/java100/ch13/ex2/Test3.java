// 예외의 종류 : RuntimeException 계열 예외
//              Errer 계열의 예외
package bitcamp.java100.ch13.ex2;

import java.io.FileReader;

public class Test3 {

    public static void main(String[] args) {
        
        //FileReader in = new FileReader("okok.txt");
        
        try {
            FileReader in = new FileReader("./build.gradle");
            System.out.println("File 읽기 준비 완료");
        }catch (Exception e) {
            System.out.println("FileReader 객체 준비 중 오류 발생!");
        }
    }
}
