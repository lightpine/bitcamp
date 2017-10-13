// 연산자 - 산술연산자 사용법

package bitcamp.java100;

public class Test15_1{
    
    public static void main(String[] args){


        System.out.printf("10 + 20 = %d\n", 10 + 20);
        System.out.printf("10 - 20 = %d\n", 10 - 20);
        System.out.printf("10 * 20 = %d\n", 10 * 20);
        //System.out.printf("5 / 2 = %f\n", 5 / 2); //컴파일 오류!
        System.out.printf("5 / 2 = %d\n", 5 / 2); // 나눗셈 결과는 int!
        System.out.printf("10 %% 20 = %d\n", 10 % 20);
    }
}