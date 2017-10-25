// 클래스 멤버와 인스턴스 멤버의 활용 II

package bitcamp.java100.ch06.ex5;

import java.util.Scanner;
// 로컬 변수 사용
public class Test1 {

    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("이름 :");
        String name;
        int kor;
        int eng;
        int math;
        int sum;
        float aver;
        
        name = keyScan.nextLine();
        
        System.out.print("국어 점수 :");
        kor = keyScan.nextInt();
        
        System.out.print("영어 점수 :");
        eng = keyScan.nextInt();
        
        System.out.print("수학 점수 :");
        math = keyScan.nextInt();
        
        sum = kor + eng + math;
        aver = sum / 3f;
        
        System.out.printf("%s, %d, %d, %d, %d, %.2f\n", name, kor, eng, math, sum, aver);
    }

}
