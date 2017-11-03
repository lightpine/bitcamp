package java100.app;
import java.util.ArrayList;
import java.util.Scanner;

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
    
    public void print() {
        System.out.printf("이름 : %s\n이메일 : %s\n",  
                this.name, 
                this.email);
    }
    
    public void add() {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("이름? ");
        String name = keyScan.nextLine();
        this.name = name;
        
        System.out.print("이메일? ");
        String email = keyScan.nextLine();
        this.email = email;
        
        System.out.print("암호? ");
        String pwd = keyScan.nextLine();
        this.pwd = pwd;
    }
    
    public void update() {
        Scanner scan = new Scanner(System.in);
        
        System.out.printf("이름?(%s)", this.name);
        String name = scan.nextLine();
        if (name.isEmpty()) {
            name = this.name;
        }
        System.out.printf("암호?(%s)", this.pwd);
        String pwd = scan.nextLine();
        if (pwd.isEmpty()) {
            pwd = this.pwd;
        }
       
        if (Prompts.confirm2("변경 하시겠습니까?(Y/n)")) {
            this.name = name;
            this.pwd = pwd;
            System.out.println("변경되었습니다.");
        }else
            System.out.println("변경이 취소되었습니다.");
    }
    
    public void printDeteil() {
        System.out.printf("이름 : %s\n이메일 : %s\n암호 : %s\n",  
                this.name, this.email, this.pwd); 
    }
    
    
}
