// 연산자 - 정수의 기본 연산단위는 int 이다.
// byte, short의 연산결과 int

package bitcamp.java100;

public class Test15_2{
    
    public static void main(String[] args){

        byte b1 = 10;
        byte b2 = 20;
        //byte b3 = 10 - 20;
        //byte b3 = b1 - b2; 컴파일 오류!

        short s1 = 10;
        short s2 = 20;
        //short s3 = s1 + s2; // s1 + s2 = int 컴파일 오류!
        
        int r1 = s1 + s2;
        long r2 = s1 + s2;



    }
}