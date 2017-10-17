package bitcamp.java100.Test17_17.step5;

public class Rect {

        int width;
        int height;
        
        static float area (Rect r) { //평방미터
            return (r.width * r.height) / 10000f;
        }
        static float pyeong(Rect r) { //평
            return (r.width * r.height) / 10000f / 3.3f;
        }

  }
