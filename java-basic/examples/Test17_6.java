// ## 메서드

package bitcamp.java100;

public class Test17_6{
   
    //: 여러개의 값을 반환하는 방법 (배)
    static int[] m1() { //원시타입을 제외한 나머지는 모두 주소값을 리턴한다.
        int[] values = {100, 90, 80};
        
        int[] values2;
        //valuse2 = {100, 90, 80};
        values2 = new int[] {100, 90, 80};
        
        //return {100, 90, 80}; // 컴파일 오류!
        return new int[] {100, 90, 80};
        
    }
     
     public static void main(String[] args) {
         
         int[] arr = m1();
         for (int i : arr) {
             System.out.println(i);
         }
         
         
     }
        
}

