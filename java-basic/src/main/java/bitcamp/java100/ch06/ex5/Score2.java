package bitcamp.java100.ch06.ex5;

import java.util.Scanner;

//관련 기능을 보다 쉽게 관리ㅎ라 수 있도록 별도의 클래스로 분류한다.
public class Score2 {
    
    //여러 사람의 성적을 개별적으로 관리하고 싶다면 
    // 성적 데이터를 저장할 데이터를 인스턴스 변수로 만들라.
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    void input(){ 
        
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("이름 :");
        this.name = keyScan.nextLine();
        System.out.print("국어 점수 :");
        this.kor = keyScan.nextInt();
        System.out.print("영어 점수 :");
        this.eng = keyScan.nextInt();
        System.out.print("수학 점수 :");
        this.math = keyScan.nextInt();
        
        this.compute();
        //keyScan.close();    // 스캐너는 사용 후 닫아야한다.
                            // 즉 스캐너가 사용한 공용 자원(키보드)을 해제해야 한다.
                              // 만약 계속 사용할 것이라면 닫으면 안된다.
    }
    
    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
    
    void print() {
        System.out.printf("%s, %d, %d, %d, %d, %.2f\n", 
                this.name,
                this.kor,
                this.eng,
                this.math,
                this.sum,
                this.aver);
    }
}
