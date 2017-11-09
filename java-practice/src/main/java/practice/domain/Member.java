package practice.domain;
import practice.controller.CSVFormatException;

//: ## 캡슐화 적용
//: 학생의 성적을 저장할 때 사용할 사용자 정의 데이터 타입을 만든다. 
//: > '사용자 정의 데이터 타입'은 데이터를 저장할 *메모리를 설계*하는 것이다.
//: 모든 필드에 프로텍티브로 접근제어를 선언하라
//: 
public class Member {  
    
    protected String name;
    protected String email; 
    protected String pwd;

    public Member() {}
    public Member(String name, String email, String pwd) {
        this.name = name;
        this.email = email; 
        this.pwd = pwd;
    }
    
    
    @Override
    public String toString() {
        return "Member [name=" + name + ", email=" + email + ", pwd=" + pwd + "]";
    }
    
    public Member (String csv) throws CSVFormatException{
        String[] rec = csv.split(",");
        
        if (rec.length != 3) // 데이터의 개수가 올바르지 않다면 이 데이터는 건너 뛴다. 
            throw new CSVFormatException(
                    "CSV 데이터 항목의 개수 올바르지 않습니다.");
        
            this.name = rec[0];
            this.email = (rec[1]);
            this.pwd  = (rec[2]);
            
    }
    
    public String toCSVString() {
        return String.format("%s,%s,%s",
                this.getName(),
                this.getEmail(),
                this.getPwd());
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
