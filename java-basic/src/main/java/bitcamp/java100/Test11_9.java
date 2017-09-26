// 자바에서 값 표현하기 - 부동 소수점을 메모리에 저장하는 방법

package bitcamp.java100;

public class Test11_9 {

    public static void main(String[] args) {
        //부동 소수점의 값 크기
        System.out.println(98765.123456789); //8byte

        System.out.println(98765.123456789f); //4byte

        //부동소수점을 메모리에 저장할 때
        System.out.println(12.375);    
        System.out.println(12.117); //무한수 
        System.out.println(214500/1.1); //부동소수점의 값이 완전히 2진수로 바뀌지 못하는 문제 때문에 소수점 이하의 값이 이상하게 출력 
        

    }

}

// 부동 소수점을 메모리에 저장
// - 2진수로 표현이 가능해야만 메모리에 저장할 수 있다.
// - 이 조건은 어떤 데이터에 대해서도 동일하다.
// 즉 음성,화면, 촉각, 미각의 값을 메모리에 저장하고 싶다면, 2진수로 표현이 가능해야 한다.
// IEEE-754 -> 부동소수점을 2진수로 변환(표현)