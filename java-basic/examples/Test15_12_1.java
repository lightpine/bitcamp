// 비트 이동 연산자 

package bitcamp.java100;

public class Test15_12_1{
    
    public static void main(String[] args){
        
        int v = 87; //0b 0000_0000_0000_0000_0000_0000_0101_0111
        
        System.out.println(v >> 1); // x0000_0000_0000_0000_0000_0000_0010_1011 / 1
        System.out.println(v >> 2); // xx000_0000_0000_0000_0000_0000_0001_0101 / 11
        System.out.println(v >> 3); // xxx00_0000_0000_0000_0000_0000_0000_1010 / 111
        System.out.println(v >> 4); // xxxx_0000_0000_0000_0000_0000_0000_0101 / 0111
        
        //음수는 소수점 반올림 현상이 일어난다.
        
        v = -87;
        
        System.out.println(v >> 1); 
        System.out.println(v >> 2); 
        System.out.println(v >> 3); 
        System.out.println(v >> 4); 
        
        v = 87;
        
        System.out.println(v >>> 1); 
        System.out.println(v >>> 2); 
        System.out.println(v >>> 3); 
        System.out.println(v >>> 4); 
        
        //음수는 양수로 바뀐다.
        v = -87;
        
        System.out.println(v >>> 1); 
        System.out.println(v >>> 2); 
        System.out.println(v >>> 3); 
        System.out.println(v >>> 4);
        
        v = 5;  //0000_0000_0000_0000_0000_0000_0000_0101
        
        System.out.println(v << 1); //0000_0000_0000_0000_0000_0000_0000_101x
        System.out.println(v << 2); //0000_0000_0000_0000_0000_0000_0001_01xx
        System.out.println(v << 3); //0000_0000_0000_0000_0000_0000_0010_1xxx
        System.out.println(v << 4); //0000_0000_0000_0000_0000_0000_0101_xxxx
        
        v = -5;
        
        System.out.println(v << 1); 
        System.out.println(v << 2); 
        System.out.println(v << 3); 
        System.out.println(v << 4); 
        
        for (int i = 0; i < 40 ; i++ ) {
            System.out.printf("%32s, %d\n",Integer.toBinaryString(v << i), v << i);
        
    }
   }
}
    
    