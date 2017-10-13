// ## 메서드

package bitcamp.java100;

public class Test17_1{
    
    static class Score{
        String name;
        int kor;
        int eng;
        int math;
        int sum;
        float aver;
        
    }
    public static void main(String[] args){
        
        
        Score s1 = new Score();
        
        s1.name = "홍길동";
        s1.kor = 90;
        s1.eng = 100;
        s1.math = 100;
        s1.sum = s1.kor + s1.eng + s1.math;
        s1.aver = s1.sum / 3f;
        
        Score s2 = new Score();
        
        s2.name = "임꺽정";
        s2.kor = 100;
        s2.eng = 70;
        s2.math = 50;
        s2.sum = s2.kor + s2.eng + s2.math;
        s2.aver = s2.sum / 3f;
        
        //: 위와같이 메모리를 만들고 그 메모리에 값을 넣는 코드가 반복되면 별도의 블록으로 묶에놓고 필요할 때마다 사용
        Score s3 = createScore("유관순", 100, 100, 100);
        Score s4 = createScore("안중근", 90, 90, 90);
        Score s5 = createScore("홍길동", 80, 80, 80);
        
       
    }
    
    static Score createScore(String name, int kor, int eng, int math) {
        //: 메모리 준비
        Score s = new Score();
        
        //: 메모리에 데이터 넣기
        s.name = name;
        s.kor = kor;
        s.eng = eng;
        s.math = math;
        s.sum = kor + eng + math;
        s.aver = s.sum / 3f;
        
        //: 메모리 주소 리턴하기
        return s;
        
     }
}
