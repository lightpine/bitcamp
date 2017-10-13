
public class App {

    public static void main(String[] args) {
        //:학생의 이름과 성적을 저장하는 
        class Score {
            
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float aver;
            
        }
        //: 학생의 성적을 저장할 메모리를 준비한다.
        Score s1 = new Score();
        //: new로 인스턴스 하면 모든 초기값은 0으로 초기화 된다. boolean의 경우 false가 된다.
        
        s1.name = "홍길동";
        s1.kor = 100;
        s1.eng = 90;
        s1.math = 80;
        s1.sum = s1.kor + s1.eng + s1.math;
        s1.aver = s1.sum / 3f;
        
        Score s2 = new Score();
        s2.name = "임꺽정";
        s2.kor = 80;
        s2.eng = 80;
        s2.math = 80;
        s2.sum = s2.kor + s2.eng + s2.math;
        s2.aver = s2.sum / 3f;
        
        Score s3 = new Score();
        s3.name = "유관순";
        s3.kor = 100;
        s3.eng = 100;
        s3.math = 100;
        s3.sum = s3.kor + s3.eng + s3.math;
        s3.aver = s3.sum / 3f;
        
       //: 출력
            System.out.printf("이름 :%-4s 국어 :%4d, 영어 :%4d, 수학 :%4d, 총점 :%4d, 평균 :%6.1f\n",
                    s1.name,s1.kor,s1.eng, s1.math, s1.sum,s1.aver);
            System.out.printf("이름 :%-4s 국어 :%4d, 영어 :%4d, 수학 :%4d, 총점 :%4d, 평균 :%6.1f\n",
                    s2.name,s2.kor,s2.eng, s2.math, s2.sum,s2.aver);
            System.out.printf("이름 :%-4s 국어 :%4d, 영어 :%4d, 수학 :%4d, 총점 :%4d, 평균 :%6.1f\n",
                    s3.name,s3.kor,s3.eng, s3.math, s3.sum,s3.aver);
            
        
    
    }      
}
