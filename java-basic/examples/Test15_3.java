// 연산자 - 정수의 기본 연산단위는 int 이다.
// byte, short의 연산결과 int

package bitcamp.java100;

public class Test15_3{
    
    public static void main(String[] args){

        byte b1 = 20, b2 = 22;
        short s1 = 30, s2 = 33;
        int i1 = 40, i2 = 44;
        long l1 = 50, l2 = 55;
        float f1 = 3.14f, f2 = 45.32f;
        double d1 = 4567.8988, d2 = 9876.5432;

        int r1 = b1 + s1;
        r1 = b1 + i1; //
        r1 = i1 + s1; //short는 int로 자동 변환됨. 오해말라! 진짜 바뀌는게 아니라 임시 int메모리에 저장되는것을 줄여말한것.

        //r1 = i1 + l1; // 계산 결과는 long 타입이다. 컴파일 오류!
        //r1 = b1 + l1; //컴파일 오류!
        //r1 = s1 + l1; //컴파일 오류!

        long r2 = i1 + l1; // ok
        r2 = b1 + l1; // ok
        r2 = s2 + l1; // ok

        //long r3 = b1 + f1; // 계산 결과는 float이다. //컴파일 오류!
        //r3 = s1 + f1; //컴파일 오류!
        //r3 = i1 + f1; //컴파일 오류!
        //r3 = l1 + f1; //컴파일 오류!
        
        float r4 = b1 + f1;
        r4 = s1 + f1;
        r4 = i1 + f1;
        r4 = l1 + f1;// 이걸 쓰고 싶으면 계산 결과가 값이 짤리지 않을거란 확신이 있을때 사용하라.
        //주의 형변환시 플롯의 범의를 넘을 수 있다 넘어가면 값 짤린다는걸 명심해라!

        //float r5 = f1 + d1; // f1의 값이 임시 double 메모리에 저장됨. 그런 후 계산 당연히 계산 결과는 double // 컴파일 오류

        double r6 = f1 + d1; // ok
        r6 = b1 + d1;
        r6 = s1 + d1;
        r6 = i1 + d1;
        r6 = l1 + d1;




        

        

    }
}