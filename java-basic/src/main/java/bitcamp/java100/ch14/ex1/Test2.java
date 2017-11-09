// File System 다루기 : File 클래스
package bitcamp.java100.ch14.ex1;

import java.io.File;

public class Test2 {

    public static void main(String[] args) throws Exception{
        
        File file = new File("ok.txt");
        
        System.out.println("파일생성 = " + file.createNewFile());
        
        System.out.println("파일삭제 = " + file.delete());
        
        File file2 = new File("dir1");
        
        System.out.println("디렉토리 생성 = " + file2.mkdir());
        
        System.out.println("디렉토리 삭제 = " + file2.delete());
        
        
        
    }
}
