package bitcamp.java100;

public class Test12_7{
    
    public static void main(String[] args){
        
        float f1;
        f1 =9876567f;
        System.out.println(f1);

        //컴파일 오류가 발생하지 않는다.
        f1 = 9876543456789L; // 8byte 정수를 4byte 메모리에 저장.
        System.out.println(f1); //9.8765436E12 = 9876543600000
        

        //f1 = 9876543.4567; //컴파일 오류!

        f1 = 9876543.4567f;
        System.out.println(f1);
        
        //long 값을 부동소수점 메모리에 저장할 때 는 값이 짤리는것을 각오해야 한다.

        
    }        
    

}