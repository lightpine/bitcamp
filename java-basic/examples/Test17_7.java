// ## 메서드
package bitcamp.java100;

public class Test17_7{
   
    //: 타입이 다른 여러개의 값을 반환하는 방법 (컬렉션)
    static java.util.ArrayList m1() {
        java.util.ArrayList list = new java.util.ArrayList();
        
        list.add("홍길동");
        list.add(20);
        list.add(false);
        list.add(4.12f);
        list.add('M');
        
        return list;
        
    }
     
     public static void main(String[] args) {
         
         java.util.ArrayList a = m1();
         
         for (Object v : a) {
             System.out.println(v);
         }
         
     }
     
     
        
}

