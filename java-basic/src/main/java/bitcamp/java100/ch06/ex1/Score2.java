package bitcamp.java100.ch06.ex1;
// 새 데이터를 생
public class Score2 {
    // 메서드에 선언하는 변수를 "로컬 변수"라 한다.
    // 메서드의 로컬 변수는 언제, 어디에 생성되는가?
    // 메서드가 호출될 때! "스택" 영역에 생성된다.
    
    // 클래스에 선언된 변수는 언제,어디에 생성되는가?
    // 필드 선언(인스턴스 변수 선언)
    // 인스턴스의 각 항목을 더 일반적인 용어로 "필드"라고 부른다.
    // 메모리 설계 명령
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    
    //메서드 선언
    // 새 데이터를 다루는 코드를 별도의 메서드로 정의해 준다.
    // 메서드가 하는 일이 기존에 연산자들 처럼 메모리의 데이터를 다루기 때문에
    // 이렇게 인스천스 데이터를 다루는 메서드를 "연산자(operatet)"
    
    // 메서드는 메모리를 다루는 명령어이기 때문에 메서드의 이름은 동사로 시작한다.
    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
        // 인스턴스의 변수를 다루려면 그 인스턴스의 주소를 알아야한다.
        // 인스턴스 메서드를 호출 할 떄는 항상 다음과 같이 인스턴스 주소를 준다.
        //   인스턴스 주소.메서드명();
        // 이렇게 넘겨받은 인스턴스 주소를 저장하는 변수가 this이다.
        // this변수는 모든 인스턴스 메서드에 내장되어 있다.
        // 그리고 이 변수에 인스턴스 주소가 저장되어 있다.
        
        
        
        
        
        
    }
    
}