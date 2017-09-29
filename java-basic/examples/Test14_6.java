// 배열과 객체


package bitcamp.java100;

public class Test14_6{
    
    public static void main(String[] args){

        class Score{
            
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float avr;
            
            //오퍼레이터(operatior) = 메서드(method) = 메세지(messege) = 펑션(function)(과거)
            void compute(){
                sum = kor + eng + math;
                avr = sum / 3.0f;
            }
        }
     
        Score[] scores = new Score[3];
        // !!!!!!!!!!!!객체들의 배열을 만드는 문법은 자바에 존재하지 않는다!!!!!!!!!!!!
        scores[0] = new Score();
        scores[1] = new Score();
        scores[2] = new Score();

        scores[0].name = "홍길동";
        scores[0].kor = 80;
        scores[0].eng = 80;
        scores[0].math = 80;
        scores[0].compute();

        scores[1].name = "임꺽정";
        scores[1].kor = 90;
        scores[1].eng = 90;
        scores[1].math = 90;
        scores[1].compute();

        scores[2].name = "유관순";
        scores[2].kor = 100;
        scores[2].eng = 100;
        scores[2].math = 100;
        scores[2].compute();

        for(int i = 0; i < scores.length ; i ++){

            System.out.printf("s2 = %-4s,%4d,%4d,%4d,%4d,%6.2f\n",scores[i].name,scores[i].kor,scores[i].eng,scores[i].math,scores[i].sum,scores[i].avr);
        }

    }
}