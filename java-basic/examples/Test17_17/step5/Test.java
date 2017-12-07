//## 인스턴스(클래스 설계도에 따라 만든 메모리)를 다루는 메서드

package bitcamp.java100.Test17_17.step5;

public class Test{

  public static void main(String[] args) { // 진입점 = entry point!
      //면적을 구하는 예제
      Rect rect;
      rect = new Rect();
      
      rect.width = 390;
      rect.height = 420;
      
      System.out.println(Rect.area(rect));
      System.out.println(Rect.pyeong(rect));
      
  }

}



