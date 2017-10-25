package bitcamp.java100.ch06.ex5;

import java.util.Scanner;

//관련 기능을 보다 쉽게 관리ㅎ라 수 있도록 별도의 클래스로 분류한다.
public class Score1 {
    
    static String name;
    static int kor;
    static int eng;
    static int math;
    static int sum;
    static float aver;
    
    static void inputScore(){ 
        
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("이름 :");
        name = keyScan.nextLine();
        System.out.print("국어 점수 :");
        kor = keyScan.nextInt();
        System.out.print("영어 점수 :");
        eng = keyScan.nextInt();
        System.out.print("수학 점수 :");
        math = keyScan.nextInt();
        
        //keyScan.close();    // 스캐너는 사용 후 닫아야한다.
                            // 즉 스캐너가 사용한 공용 자원(키보드)을 해제해야 한다.
                              // 만약 계속 사용할 것이라면 닫으면 안된다.
    }
    
    static void computeScore() {
        sum = kor + eng + math;
        aver = sum / 3f;
    }
    
    static void printScore() {
        System.out.printf("%s, %d, %d, %d, %d, %.2f\n", name, kor, eng, math, sum, aver);
    }
}
