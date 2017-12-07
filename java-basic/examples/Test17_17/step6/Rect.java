package bitcamp.java100.Test17_17.step6;

public class Rect {

        int width;
        int height;
        
        //인스턴스 메서드 만들기 - static 이 붙지 않은 메서드(데이타만 다루는 전용 메서드)
        float area () { //평방미터
            return (this.width * this.height) / 10000f;
        }
        float pyeong() { //평
            return (this.width * this.height) / 10000f / 3.3f;
        }

  }
