
public class App2 {
    static void compute(Score score) {
        for (int sub : score.subjects) {
            score.sum += sub;
        }
        score.aver = score.sum / 3f;
    }
    static void init(Score score, String name, int kor, int eng, int math) {

        score.name = name;
        score.subjects[0] = kor;
        score.subjects[1] = eng;
        score.subjects[2] = math;
        compute(score);
    }

    static void print(Score score) {
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
                score.name,
                score.subjects[0],
                score.subjects[1],
                score.subjects[2], 
                score.sum,
                score.aver);
    }
    public static void main(String[] args) {


        Score[] scores = {new Score(), new Score(), new Score(), new Score()};
        
        init (scores[0], "홍길동", 100, 90, 80);
        init (scores[1], "임꺽정", 80, 80, 80);
        init (scores[2], "유관순", 100, 100, 100);
        init (scores[3], "이순신", 100, 90, 100);
        
        //: 학생 성적을 출력한다.
        for (Score s : scores) {
            print(s);
            
        }
        
        
    }
}




