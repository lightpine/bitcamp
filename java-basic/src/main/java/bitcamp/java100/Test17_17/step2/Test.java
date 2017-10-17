// ## 인스턴스(클래스 설계도에 따라 만든 메모리)를 다루는 메서드

package bitcamp.java100.Test17_17.step2;


public class Test{

     public static void main(String[] args) { // 진입점 = entry point!
         //면적을 구하는 예제
         int width = 390; // 단위 : cm
         int height = 420; // 단위 : cm
         
         System.out.println(area(width,height));
         System.out.println(pyeong(width,height));
         
     }
     static float area (int width,int height) { //평방미터
         return (width * height) / 10000f;
     }
     static float pyeong(int width, int height) { //평
         return (width * height) / 10000f / 3.3f;
     }
}
