package bitcamp.java100.ch06.ex1;
// 파라미터가 있는 "생성자(constructor)"
public class Score4 {
    // 메모리 설계 명령
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    //생성자가 호출될 때 파라미터 값을 받을 수 있다.
    
    Score4(String name, int kor, int eng, int math){
        
        System.out.println("Score4() 호출됨!");
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        
        this.compute();
        
        }
    
    // 메서드 선언
    
    // 메서드는 메모리를 다루는 명령어이기 때문에 메서드의 이름은 동사로 시작한다.
    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
        
        
        
    }
    
}
