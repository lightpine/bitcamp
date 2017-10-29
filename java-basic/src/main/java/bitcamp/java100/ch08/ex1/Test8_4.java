// 캡슐화의 존재 이유 - 메서드를 private로?
package bitcamp.java100.ch08.ex1;

class Score4{
    
    // 클래스에 선언된 스태틱 변수 또는 인스턴스 변수를 필드라고 부른다.
    String name;
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
    
}
    

public class Test8_4 {
    public static void main(String[] args) {
        Score4 s = new Score4();
        s.name = "홍길동";
        
        // 변수에 값을 직접 넣지 않고 메서드를 통해 넣는다면,
        // 그 메서드 내부에서 계산 작없을 수행할 수 있다.
        // 이것이 셋터를 만드는 이유이다.
        
        s.setKor(100);
        s.setEng(90);
        s.setMath(80);

        // 셋터를 호출하여 값을 저장할 때 내부에서 compute를 자동으로 호출한다.
        // 그러나 다음과 같이 명시적으로 호출해도 오류는 아니다.
        // 그런데 왜? 쓸데없이 호출하는가? 
        // 이런 경우 쓸데없이 호출하지 않도록 막는것이 좋다.
        // 외부의 노출을 최소화 시키는 것이 소스코드를 유지보수하기 쉽게 만든다.
        //s.compute();
        
        System.out.printf("%s, %d, %d, %d, %d, %.2f\n",
                s.name, s.getKor(), s.getEng(), s.getMath(), s.getSum(), s.getAver());
        
        // 언제든지 한 과묵의 점수를 바꾸더라도 자동으로 합계와 평균이 다시 계산되다.
        s.setEng(50);
        
        System.out.printf("%s, %d, %d, %d, %d, %.2f\n",
                s.name, s.getKor(), s.getEng(), s.getMath(), s.getSum(), s.getAver());
        
    }

}


