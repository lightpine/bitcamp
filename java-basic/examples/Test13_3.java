package bitcamp.java100;



public class Test13_3{
    
    public static void main(String[] args){
    //배열의 시작 주소를 저장할 변수를 준비한다.
        
        int[] arr1; // 자바에서는 이 표기법을 주로 사용한다.
        
        arr1 = new int[3];

        System.out.println(arr1.length);

        arr1[0] = 100;
        arr1[2] = 90;
        arr1[3] = 80;

        //arr1[-1] = 200;
        //arr1[3] = 300;
        
    }
}