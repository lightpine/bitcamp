// 캡슐화의 존재 이유 - 접근 제한 하기 

package bitcamp.java100.ch08.ex1;

class Score3{
    
    // 클래스에 선언된 스태틱 변수 또는 인스턴스 변수를 필드라고 부른다.
    String name;
    private int kor;
    private int eng;
    private int math;
    private int sum;
    private float aver;
    
    //대신 sum과 aver의 값을 설정한 메서드을 만든다.
    // 미 에서느를 공개해야 한다.
    
    public void compute() {
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
    
    
}
    

public class Test8_3 {
    public static void main(String[] args) {
        Score3 s = new Score3();
        s.name = "홍길동";
        
        // 변수에 값을 직접 넣지 않고 메서드를 통해 넣는다면,
        // 그 메서드 내부에서 계산 작없을 수행할 수 있다.
        // 이것이 셋터를 만드는 이유이다.
        
        s.setKor(100);
        s.setEng(90);
        s.setMath(80);
        
        // 셋터를 통해 국,영,수 점수를 저장할 때마다 자동으로 계산되기 때문에
        // compute()을 따로 호출할 필요가 없다.
        // s.compute();
        
        System.out.printf("%s, %d, %d, %d, %d, %.2f\n",
                s.name, s.getKor(), s.getEng(), s.getMath(), s.getSum(), s.getAver());
        
        // 언제든지 한 과묵의 점수를 바꾸더라도 자동으로 합계와 평균이 다시 계산되다.
        s.setEng(50);
        
        System.out.printf("%s, %d, %d, %d, %d, %.2f\n",
                s.name, s.getKor(), s.getEng(), s.getMath(), s.getSum(), s.getAver());
        
    }

}


