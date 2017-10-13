
public class App {

    public static void main(String[] args) {
        //:학생의 이름과 성적을 저장하는 클래스 생
        class Score {
            
            String name;
            int[] subjects = new int[3];
            int sum;
            float aver;
            
        }
        //: 학생의 성적을 저장할 메모리를 준비한다.
        /*
        Score[] scores = new Score[3];
        scores[0] = new Score();
        scores[1] = new Score();
        scores[2] = new Score();
        */
        Score[] scores = {new Score(), new Score(), new Score(),};
        
        
       
        //: new로 인스턴스 하면 모든 초기값은 0으로 초기화 된다. boolean의 경우 false가 된다.
        scores[0].name = "홍길동";
        scores[0].subjects[0] = 100;
        scores[0].subjects[1] = 90;
        scores[0].subjects[2] = 80;
        for (int sub : scores[0].subjects) {
            scores[0].sum += sub;
        }
        
        scores[0].aver = scores[0].sum / 3f;
        
        
        scores[1].name = "임꺽정";
        scores[1].subjects[0] = 80;
        scores[1].subjects[1] = 80;
        scores[1].subjects[2] = 80;
        for (int sub : scores[1].subjects) {
            scores[1].sum += sub;
        }
        scores[1].aver = scores[1].sum / 3f;
        
       
        scores[2].name = "유관순";
        scores[2].subjects[0] = 100;
        scores[2].subjects[1] = 100;
        scores[2].subjects[2] = 100;
        for (int sub : scores[2].subjects) {
            scores[2].sum += sub;
        }
        scores[2].aver = scores[2].sum / 3f;
        
        
       //: 출력
        for (Score s : scores ) {
            System.out.printf("이름 :%-4s 국어 :%4d, 영어 :%4d, 수학 :%4d, 총점 :%4d, 평균 :%6.1f\n",
                    s.name,s.subjects[0],s.subjects[1], s.subjects[2], s.sum,s.aver);
            
        }
    
    }      
}
