// ## 래퍼(wrapper)


package bitcamp.java100;

public class Test20_1{
    
    public static void main(String[] args){
        
        
        
        int i = 10;
        
        // int 래퍼(wrapper) 클래스
        // primitive 값을 객체로 다루기 위해 제공되는 클래스이다.
        // 각가의 primitive 타입에 대한 크랠스가 있다.
        // ex) 
        // byte     = java.lang.Byte
        // short    = java.lang.Short
        // int      = java.lang.Integrt
        // long     = java.lang.Long
        // float    = java.lang.Float
        // double   = java.lang.Double
        // boolean  = java.lang.Boolean
        // char     = java.lang.Charactor
        
        Integer i2 = new Integer(10);
        
        
        // intvalue
        int i3 = i2.intValue();
        
        //floatValue
        
        float f1 = i2.floatValue();
        
        // Integer 클래스에는 int로 저장할 수 있는 최소 최대 값을 알려주는 변수가 있다.
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        
        //Integer 클래스에는 문자열을 해석하여 in로 변화해주는 메서드도 있다.
        int value = Integer.parseInt("2345");
        System.out.println(value + 100);
        
        //또한 int 값을 10진수, 2진수, 8진수, 16진수로 표현된 문자열로 바꾸는 메서드도 있다.
        System.out.println(Integer.toBinaryString(44036));
        System.out.println(Integer.toOctalString(44036));
        System.out.println(Integer.toHexString(44032));
        
        
        
     }
}
