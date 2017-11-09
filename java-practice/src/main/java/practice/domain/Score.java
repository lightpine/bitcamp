package practice.domain;
import practice.controller.CSVFormatException;

//: ## 캡슐화 적용
//: 학생의 성적을 저장할 때 사용할 사용자 정의 데이터 타입을 만든다. 
//: > '사용자 정의 데이터 타입'은 데이터를 저장할 *메모리를 설계*하는 것이다.
//: 모든 필드에 프로텍티브로 접근제어를 선언하라
//: 
public class Score {  
    
    protected String name;
    protected int kor;
    protected int eng;
    protected int math;
    protected int sum;
    protected float aver;

    //: ### 생성자
    //: > 다른 패키지에서도 호출할 수 있도록 public으로 공개한다.
    public Score(String csv) throws CSVFormatException {
        String[] rec = csv.split(",");
        
        if (rec.length < 4) // 데이터의 개수가 올바르지 않다면 이 데이터는 건너 뛴다. 
            throw new CSVFormatException(
                    "CSV 데이터 항목의 개수 올바르지 않습니다.");
        
        try {
            
            this.name = rec[0];
            this.kor  = Integer.parseInt(rec[1]);
            this.eng  = Integer.parseInt(rec[2]);
            this.math = Integer.parseInt(rec[3]);
            this.compute();
            
        } catch (Exception e) {
            
            throw new CSVFormatException(
                    "CSV 데이터 항목의 형식이 올바르지 않습니다.");
        }
    }
    
    public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng; 
        this.math = math;
        
        this.compute();
    }
    
    public Score() {
        
    }
    
    @Override
    public String toString() {
        return "Score [name= " + name + ", kor= " + kor + ", eng= " + eng + ", math= " + math + ", sum= " + sum + ", aver= "
                + aver + "]";
    }
    
    public String toCSVString() {
        return String.format("%s,%d,%d,%d,%d,%.1f",
                this.getName(),
                this.getKor(),
                this.getEng(),
                this.getMath(),
                this.getSum(),
                this.getAver());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getSum() {
        return sum;
    }

    public float getAver() {
        return aver;
    }

    //: > 내부에서만 사용할 메서드이기 때문에 공개하지 않는다.
    private void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
    

    
}
