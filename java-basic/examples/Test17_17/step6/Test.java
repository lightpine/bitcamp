//## 인스턴스(클래스 설계도에 따라 만든 메모리)를 다루는 메서드

package bitcamp.java100.Test17_17.step6;

public class Test{

  public static void main(String[] args) { // 진입점 = entry point!
      //면적을 구하는 예제
      Rect r;
      r = new Rect();
      
      r.width = 390;
      r.height = 420;
      
      // 인스턴스 전용 메서드 사용 할때 파라미터가 아닌 메서드 앞에 인스턴스 주소를 지정해야 한다.
      
      System.out.println(r.area());
      System.out.println(r.pyeong());
      
  }
  

}



