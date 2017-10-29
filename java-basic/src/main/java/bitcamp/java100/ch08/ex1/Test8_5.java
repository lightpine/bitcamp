// 캡슐화의 존재 이유 - 더미 셋터 겟
package bitcamp.java100.ch08.ex1;

class Score5{
    
    // 캡슐화를 통해 외부 접근을 막지 않아도 되는 필드에 대해서도 
    // 객체 사용의 일관성을 위해 셋터와 겟터를 만드는 것이 좋다.
    // 다음 name 필드가 대표적이다.
    private String name;
    
    private int kor;
    private int eng;
    private int math;
    private int sum;
    private float aver;
    
    // 대신 sum과 aver의 값을 설정한 메서드을 만든다.
    // 이 메서드를 공개해야 한다.
    
    // 메서드는 보통 외부에서 사용할 수 있도록 공개하는데.
    // 다음 메서드처럼 내부에서만 사용하는 메서드가 있다.
    // 이런경우 굳이 공개할 필요가 없다.
    // 객체지향의 핵심은 관견된 여러 기능들을
    // 한 클래스에 묶어 놓고 (캡슐에 넣고, 즉 캡슐화시키고),
    // 외부에서 사용할 수 있도록 일부 기능만 노풀하는 것이 중요하다.
    // 그것이 캡슐화의 핵심이다.
    
    private void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
    
    // 또한 sum과 aver의 값을 꺼낼수 있도록 공개 메서드를 추가한다.
    // 특히 sum과 aver는 셋터는 없고 겟터만 있다.
    // 이런경우 read only property 라고 부른다.
    
    public int getSum() {
        return this.sum;
    }

    public int getKor() {
        return kor;
        
    }

    public void setKor(int kor) {
        this.kor = kor;
        this.compute();
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
        this.compute();
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
        this.compute();
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setAver(float aver) {
        this.aver = aver;
    }

    public float getAver() {
        return this.aver;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
    

public class Test8_5 {
    public static void main(String[] args) {
        Score5 s = new Score5();
        s.setName("홍길동");
        s.setKor(100);
        s.setEng(90);
        s.setMath(80);
        
        System.out.printf("%s, %d, %d, %d, %d, %.2f\n",
                s.getName(), s.getKor(), s.getEng(), s.getMath(), s.getSum(), s.getAver());
        
        // 언제든지 한 과묵의 점수를 바꾸더라도 자동으로 합계와 평균이 다시 계산되다.
        s.setEng(50);
        
        System.out.printf("%s, %d, %d, %d, %d, %.2f\n",
                s.getName(), s.getKor(), s.getEng(), s.getMath(), s.getSum(), s.getAver());
        
    }

}


