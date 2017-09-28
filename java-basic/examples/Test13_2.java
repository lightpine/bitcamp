package bitcamp.java100;



public class Test13_2{
    
    public static void main(String[] args){
    //배열의 시작 주소를 저장할 변수를 준비한다.
        
        int[] arr1; // 자바에서는 이 표기법을 주로 사용한다.
        int arr2[]; // c 언어 표기법

        //자바에선 임의의 주소 값을 저장할 수 없다.

        //arr1 = 100;
        //arr2 = 100;

    // c/c++ 
        //int scores[7];  <- 자바에선 불가능

        arr1 = new int[3];
        arr2 = new int[4];

        arr1[0] = 100;
        arr1[1] = 90;
        arr1[2] = 80;
        
        System.out.printf("%d,%d,%d\n",arr1[0],arr1[1],arr1[2]);

        arr2[0] = 100;
        arr2[1] = 200;
        arr2[2] = 300;
        arr2[3] = 400;

        System.out.printf("%d,%d,%d,%d\n",arr2[0],arr2[1],arr2[2],arr2[3]);
    }
    
    

}