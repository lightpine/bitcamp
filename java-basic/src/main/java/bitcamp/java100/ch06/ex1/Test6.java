// 클래스 - 클래스 문법의 용도 - 사용자 정의 데이터 타입 만들기

package bitcamp.java100.ch06.ex1;

// 여러개의 생성자 중에서 한개 선택하기
public class Test6 {

    
    public static void main(String[] args) {

        // 학생의 성적 정보를 저장할 변수를 준비하라
        Score5 score;
        //생성자가 여러개일 경우 파라미터로 호출할 생성자를 결정한다.
        score = new Score5();
        
        score = new Score5("임꺽정", 100,100,100);
        
        score = new Score5("유관순");
        
        //당연히 주어진 파라미터 값을 받는 생성자를 찾을 수 없을 때는 컴파일 오류
        //score = new Score5(100,100,100);
        
        
    }

}
