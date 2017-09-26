package bitcamp.java100;

public class Test11_7{
    
    public static void main(String[] args)
    {
        //양의 정수값을 메모리에 저장하는 방법
        // 100 => 0000 0000 0000 0000 0000 0000 0110 0100
        System.out.println(100);
        System.out.println(Integer.toBinaryString(100));

        //음의 정수값을 메모리에 저장하는 방법
        // -100 => 1111 1111 1111 1111 1111 1111 1001 1100
        System.out.println(-100);
        System.out.println(Integer.toBinaryString(-100));
    }        
    

}