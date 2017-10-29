package java100.app;
import java.util.Scanner;

//: ## 캡슐화 적용
//: 학생의 성적을 저장할 때 사용할 사용자 정의 데이터 타입을 만든다. 
//: > '사용자 정의 데이터 타입'은 데이터를 저장할 *메모리를 설계*하는 것이다.
//: 모든 필드에 프로텍티브로 접근제어를 선언하라
//: 
public class Score {
    
    protected String name;
    protected int[] subjects; // 배열 변수는 주소가 지정되어있어야만 쓸수 있다.
    protected int sum;
    protected float aver;
    
    // public으로 공개한다.
   
    public Score(){ // 기본 생성자를 사용하면 인스턴스 변수에 배열이 있나 확인해봐
        this.subjects = new int[3];
    } 
    
    public Score(String name, int kor, int eng, int math){
        
        this.name = name;
        this.subjects = new int[]{kor, eng, math};
        
        this.compute();
        
    }
    
    protected void compute() {
        for (int sub : this.subjects) {
            this.sum += sub;
        }
        this.aver = (float)this.sum / this.subjects.length;
    }
    
    public void print() {
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
                this.name, 
                this.subjects[0], 
                this.subjects[1], 
                this.subjects[2], 
                this.sum, 
                this.aver);
    }
    public void input(){ 
        Scanner keyScan = new Scanner(System.in);
        int cursor = 0;
        
        System.out.print("이름 :");
        this.name = keyScan.nextLine();
        
        //score.subjects = new int[3]; // 여기서 배열을 지정해주지 않으면 있지도 않은 배열을 찾으란 말이된다.
        
        System.out.print("국어 점수 :");
        this.subjects[0] = keyScan.nextInt();
        System.out.print("영어 점수 :");
        this.subjects[1] = keyScan.nextInt();
        System.out.print("수학 점수 :");
        this.subjects[2] = keyScan.nextInt();
        
        this.compute();
    }
    
    
}