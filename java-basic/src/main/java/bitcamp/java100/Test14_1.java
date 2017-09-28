// 사용자 정의 데이터 타입 만들기

package bitcamp.java100;

public class Test14_1{
    
    public static void main(String[] args){

        class Score{

            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float avr;

        }
        
        Score r1 = new Score();

        r1.name = "홍길동";
        r1.kor = 100;
        r1.eng = 40;
        r1.math = 70;
        r1.sum = r1.kor + r1.eng + r1.math;
        r1.avr = r1.sum / 3.0f;

        System.out.printf("%4s %4d %4d %4d %4d %6.1f\n",r1.name, r1.kor, r1.eng, r1.math, r1.sum, r1.avr);


    }
}