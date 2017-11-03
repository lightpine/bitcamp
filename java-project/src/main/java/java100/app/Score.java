package java100.app;
import java.util.Arrays;
import java.util.Scanner;

//: ## 캡슐화 적용
//: 학생의 성적을 저장할 때 사용할 사용자 정의 데이터 타입을 만든다. 
//: > '사용자 정의 데이터 타입'은 데이터를 저장할 *메모리를 설계*하는 것이다.
//: 모든 필드에 프로텍티브로 접근제어를 선언하라
//: 
public class Score {  
    
    protected String name;
    protected int[] subjects; 
    protected int sum;
    protected float aver;

    //: ### 생성자
    //: > 다른 패키지에서도 호출할 수 있도록 public으로 공개한다.
    public Score() {
        this.subjects = new int[3];
    }
    
    public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.subjects = new int[]{kor, eng, math};
        
        this.compute();
    }
    
    @Override
    public String toString() {
        return "Score [name=" + name + ", subjects=" + Arrays.toString(subjects) + ", sum=" + sum + ", aver=" + aver
                + "]";
    }

    //: > 내부에서만 사용할 메서드이기 때문에 공개하지 않는다.
    private void compute() {
        int sum = 0;
        for (int sub : this.subjects) {
            sum += sub;
        } 
        this.sum = sum;
        this.aver = (float)this.sum / this.subjects.length;
    }
    
    //: > 전체 공개할 메서드는 public으로 선언한다. 
    public void print() {
        System.out.printf("%-4s, %4d, %6.1f\n",  
                this.name, 
                this.sum, 
                this.aver);
    }
    
    public void add() {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("이름?");
        this.name = keyScan.nextLine();
        
        System.out.print("국어?");
        this.subjects[0] = keyScan.nextInt();
        
        System.out.print("영어?");
        this.subjects[1] = keyScan.nextInt();
        
        System.out.print("수학?");
        this.subjects[2] = keyScan.nextInt();
        
        this.compute();
    }
    
    public void update() {
        Scanner scan = new Scanner(System.in);
        
        System.out.printf("국어?(%d)", this.subjects[0]);
        int kor = this.subjects[0];
        try {
        kor = Integer.parseInt(scan.nextLine());
        }catch (Exception e) {};
        
        
        System.out.printf("영어?(%d)", this.subjects[1]);
        int eng = this.subjects[1];
        try {
        eng = Integer.parseInt(scan.nextLine());
        }catch (Exception e) {};
        
        System.out.printf("수학?(%d)", this.subjects[2]);
        int math = this.subjects[2];
        try {
        math = Integer.parseInt(scan.nextLine());
        }catch (Exception e) {};
        
        if (confirm2("변경 하시겠습니까?(Y/n)")) {
            this.subjects[0] = kor;
            this.subjects[1] = eng;
            this.subjects[2] = math;
            this.compute();
            System.out.println("변경되었습니다.");
        }else
            System.out.println("변경이 취소되었습니다.");
    }
    
    public void printDeteil() {
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
                this.name, 
                this.subjects[0], 
                this.subjects[1], 
                this.subjects[2], 
                this.sum, 
                this.aver);
    }
    static boolean confirm2(String message) {
        
        Scanner keyScan = new Scanner(System.in);
        System.out.print(message);
        String response = keyScan.nextLine().toLowerCase();
        
        if (response.equals("n") || response.equals("no") || response.equals(""))
            return false;
        return true;
    }
    
}
