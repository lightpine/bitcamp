// ## 유틸리티 문자열 리터럴(literal) String class

package bitcamp.java100;

public class Test18_2{
    
    public static void main(String[] args){
        String s1;
        
        s1 ="ABC가각간";
        
        String s2 = "ABC가각간";
        
        // 자바에서는 리터럴을 String레퍼런스에 넣으면 
        // 자동으로 new String() 명령으로 바꾼다.
        // s1은 레퍼런스이기 때문에 절대 값이 저장될 수 없다.
        
        if (s1 == s2) {
            System.out.println("s1 == s2");
            
            // 리터럴은 1byte, 2byte(short)는 없다.
            
            // 암시적으로 String 인스턴스를 만들때는 (constants)String pool이라는 별도의 영역에
            // 인스턴스가 생성된다.
            // constants pool에서는 중복을 허용하지 않는다.
            
        }
        
     }
}
