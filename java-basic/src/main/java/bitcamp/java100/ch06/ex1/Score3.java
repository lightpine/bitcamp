package bitcamp.java100.ch06.ex1;
// 아주 특별한 인스턴스 메소드 "생성자(constructor)"
public class Score3 {
    // 메모리 설계 명령
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    // 인스턴스를 만들때 반드시 호출해야 하는 메서드
    // 호출하지 않으면 컴파일 오류이다.
    // 보통 인스턴스의 메모리를 초기화시키는 코드를 둔다
    // 그래서 "생성자(constructor)" 라 부른다.
    // 즉 new명령과 함께 호출 해야 한다. 나중에 따로 호출할 수 없다.
    // 그래서 인스턴스마다 딱 1번만 호출된다.
    // new명령과 함께 사용해야 하기 때문에
    // 따로 값을 리턴 할 수 없다.
    // 그래서 리턴 타입을 지정하지 못한다.
    // 다른 메서드와 구분되어야 하기 때문에 반드시 클래스 이름과 같아야 한다.
    // 호출 방법
    // new 생성자명();
    
    Score3(){
        System.out.println("Score3() 호출됨");
        this.name = "홍길동";
        this.kor = 50;
        this.eng = 50;
        this.math = 50;
        
        this.compute();
        
        }
    
    // 메서드 선언
    
    // 메서드는 메모리를 다루는 명령어이기 때문에 메서드의 이름은 동사로 시작한다.
    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
        
        
        
    }
    
}
