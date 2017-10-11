// 비트 이동 연산자 응용

package bitcamp.java100;

public class Test15_12_2{
    
    public static void main(String[] args){
        // 문제 : 인트 메모리에 들어있는 값을 1바이트씩 앞에서 부터 출력하라.
        int v = 1234567890;
        
        //전체 바이트를 16진수로 출력!
        System.out.println(Integer.toHexString(v));
        
        //바이트 값을 꺼내려면 맨 끝으로 바이트를 위치시켜야 한다.
        System.out.println(Integer.toHexString(v >> 24));
        
        //맨 끝바이트만 출력하고 싶다면 앞의 바이트는 필터로 막아야 한다.
        // 필터로 막기 위해 000000FF 값으로 & 연산을 수행한 것이다.
        System.out.println(Integer.toHexString((v >> 16) & 0xFF));
        System.out.println(Integer.toHexString((v >> 8) & 0xFF));
        System.out.println(Integer.toHexString(v & 0xFF));
   }
}
    
    