//## 인스턴스(클래스 설계도에 따라 만든 메모리)를 다루는 메서드

package bitcamp.java100.Test17_17.step4;

public class Test{

  public static void main(String[] args) { // 진입점 = entry point!
      //면적을 구하는 예제
      Rect rect;
      rect = new Rect();
      
      rect.width = 390;
      rect.height = 420;
      
      System.out.println(area(rect));
      System.out.println(pyeong(rect));
      
  }
  static float area (Rect r) { //평방미터
      return (r.width * r.height) / 10000f;
  }
  static float pyeong(Rect r) { //평
      return (r.width * r.height) / 10000f / 3.3f;
  }

}



