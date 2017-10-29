package bitcamp.java100.ch06.ex1;

// 인스턴스 초기화 문장
public class Score10 extends Score5 {
    // 메모리 설계 명령(필드 선언)
    // 변수 선언에 값을 할당하는 문장이 있으면,
    // 변수를 생성한 후에 바로 실행한다.
    
    
    String name = "이름없음";
    int kor = 10;
    int eng = 10;
    int math;
    int sum;
    float aver;
    double divied;

    //인스턴스 블록
    {
        this.name = "홍길동";
        this.kor = 20;
    }
    //생성자
    Score10(){

        this.name = "임꺽정";
        
        compute();
    }
    
    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    
    }
    
    // 인스턴스 생성 과정
    // new Score10();
    
    // 설계도에 따라 힙에 변수를 만든다.
    //  name = null 즉 레퍼런스는 주수없음을 의미하는 null이 저장된다. 결국 0이다
    //  kor = 0
    //  eng = 0
    //  math = 0
    //  sum = 0
    //  aver = 0.0
    
    // 초기화 할당문 실행
    //  name = "이름없음"
    //  kor = 10
    //  eng = 10
    //  math = 0
    //  sum = 0
    //  aver = 0.0
    
    // 초기화 할당문 실행
    //  name = "홍길동"
    //  kor = 20
    //  eng = 10
    //  math = 0
    //  sum = 0
    //  aver = 0.0
    // 초기화 할당문 실행
    
    //  name = "임꺽정"
    //  kor = 20
    //  eng = 10
    //  math = 0
    //  sum = 0
    //  aver = 0.0
}
