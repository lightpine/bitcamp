package bitcamp.java100.ch06.ex1;

// 생성자에서 다른 생성자 호출하
public class Score7 {
    // 메모리 설계 명령
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    //기본 생성자를 호출하면 다음과 같이 인스턴스 메모리를 기본 값으로 채운다.
    Score7(){
        this("홍길동");
        /*
        this.name = "홍길동";
        this.kor = 50;
        this.eng = 50;
        this.math = 50;
        
        this.compute();
        */
    }
    Score7(String name){
        // 다음과 같이 인스턴스 변수를 초기화 시키는 코드가 다른 생성자와 중복되는 경우,
        // 다른 생성자를 호출하는 것으로 대채할 편리한 방법이 있다.
        // 단 다음과 같이 다른 생성자를 호출하는 명령어 앞에 다른 명령러가 오면 안된다.
        
        //System.out.println(Score7(String));// 컴파일 오류
        this(name,50, 50, 50);
        /*
        this.name = name;
        this.kor = 50;
        this.eng = 50;
        this.math = 50;
        
        this.compute();
        */
    }
    Score7(String name, int kor, int eng, int math){
        
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        
        this.compute();
    }
    
    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    
     //this(); // 컴파일 오류!
    }
    
    
}
