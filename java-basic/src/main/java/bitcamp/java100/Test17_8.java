// ## 메서드

package bitcamp.java100;

public class Test17_8{
   
    static class Member{
        String name;
        int age;
        boolean working;
        float score;
        char level;
    }
    
    //: 타입이 다른 여러개의 값을 반환하는 방법 (컬렉션)
    static Member m1() {
        Member ref = new Member(); 
        ref.name = "홍길동";
        ref.age = 20;
        ref.working = true;
        ref.score = 4.12f;
        ref.level = 'M';
        
        return ref;
        
    }
     
     public static void main(String[] args) {
         
         Member mem = m1();
         
         System.out.println(mem.name);
         System.out.println(mem.age);
         System.out.println(mem.working);
         System.out.println(mem.score);
         System.out.println(mem.level);
     }
     
     
        
}

