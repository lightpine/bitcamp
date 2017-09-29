// 객체와 레퍼런스

package bitcamp.java100;

public class Test14_4{
    
    public static void main(String[] args){

        class Score{
            
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float avr;
            
        }
        // 현업에서 부르는 다양한 방법
        //
        // 스코어 설계도에 따라 만든 메모리에 주소를 담는 변수
        // 스코어 설계도에 따라 만든 메모리의 레퍼런스
        // 스코어 클래스에 따라 만든 메모리의 레퍼런스
        // 스코어 설계도에 따라 만든 객체의 레퍼런스
        // 스코어 설계도에 따라 만든 인스턴스의 레퍼런스
        // 스코어 클래스의 객체 레퍼런스
        // 스코어 클래스 인스턴스 레퍼런스
        // 스코어 객체의 레퍼런스
        // 스코어 인스턴스
        // 스코어 객체

        Score s1 = new Score();
        // 레퍼런스를 통해 인스턴스의 내부 메모리에 값 저장
        // 이때 인스턴스의 내부 메모리를 '필드'라 한다.
        s1.name = "홍길동";
        s1.kor = 100;
        s1.eng = 100;
        s1.math = 100;
        s1.sum = s1.kor + s1.eng + s1.math;
        s1.avr = s1.sum / 3.0f;

        System.out.printf("%s,%d,%d,%d,%d,%.2f\n",s1.name,s1.kor,s1.eng,s1.math,s1.sum,s1.avr);

        Score s2 = s1;

        s1 = new Score();

        s1.name = "임꺽정";
        s1.kor = 90;
        s1.eng = 90;
        s1.math = 97;
        s1.sum = s1.kor + s1.eng + s1.math;
        s1.avr = s1.sum / 3.0f;

        System.out.printf("s1 = %-4s,%4d,%4d,%4d,%4d,%6.2f\n",s1.name,s1.kor,s1.eng,s1.math,s1.sum,s1.avr);

        System.out.printf("s2 = %-4s,%4d,%4d,%4d,%4d,%6.2f\n",s2.name,s2.kor,s2.eng,s2.math,s2.sum,s2.avr);

    }
}