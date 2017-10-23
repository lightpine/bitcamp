// ## 래퍼(wrapper) - 오토박싱 & 언박싱


package bitcamp.java100;

public class Test20_3{
    
    public static void main(String[] args){
        
        int i = 100;
        
        // 오토 박싱(auto-Boxing)
        
        Integer r1 = 100; // => new Integer(100);
        Integer r2 = new Integer(300);
        
        // 오토 언박싱(auto-unBoxing)
        
        int i2 = r2; // OK! => r2.intvalue();
        
        
        
        
     }
}
