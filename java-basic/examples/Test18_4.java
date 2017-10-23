// ## String 인스턴스의 내용 비교 (equals)

package bitcamp.java100;

public class Test18_4{
    
    public static void main(String[] args){
        String s1 = "ABC가각간";
        String s2 = new String("ABC가각간");
        
        // 주소값 비교
        if (s1 != s2)System.out.println("s1 != s2");
        
        // 내용물이 같은지 비교
        if (s1.equals(s2)) System.out.println("s1과 s2의 내용물이 같다.");
        
        
     }
}
