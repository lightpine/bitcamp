// ## 인스턴스(클래스 설계도에 따라 만든 메모리)를 다루는 메서드

package bitcamp.java100.Test17_17.step1;


public class Test{

     public static void main(String[] args) { // 진입점 = entry point!
         //면적을 구하는 예제
         int width = 390; // 단위 : cm
         int height = 420; // 단위 : cm
         
         float area = (width * height) / 10000f;
         System.out.println(area);
         
         float pyeong = area / 3.3f;
         System.out.println(pyeong);
     }
     
}

