package bitcamp.java100;

public class Test13_4{
    
    public static void main(String[] args){
    //배열의 시작 주소를 저장할 변수를 준비한다.
        
        int[] arr1= new int[3]; // 자바에서는 이 표기법을 주로 사용한다.
    
    //배열 생성과 동시에 값 초기화

        int[] arr2= new int[] {100, 90, 80};
        
        int[] arr3;
        arr3 = new int[] {90, 80, 70};

    //new int[]를 선언 하지 않아도 레퍼런스의 타입을 보면 int 배열을 생성해야 한다는 것을 추측할 수 있기 때문에 생략을 허락한다.

        int[] arr4 = {100, 200, 300};

    //선언과 동시에 초기화 안하면 컴파일 오류!

        /*int[] arr5;
        arr5 = {100, 200, 300}; <- 컴파일 오류! */




    }
}