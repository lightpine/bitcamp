package java100.app;

import java.sql.Date;
import java.util.Scanner;

//: ## 캡슐화 적용
//: 학생의 성적을 저장할 때 사용할 사용자 정의 데이터 타입을 만든다. 
//: > '사용자 정의 데이터 타입'은 데이터를 저장할 *메모리를 설계*하는 것이다.
//: 모든 필드에 프로텍티브로 접근제어를 선언하라
//: 
public class Board {  
    
    protected int no;
    protected String title; 
    protected String main;
    protected Date day;
    protected int viewer;
    

    public Board() {}
    
    @Override
    public String toString() {
        return "Board [no=" + no + ", title=" + title + ", main=" + main + ", day=" + day + ", viewer=" + viewer + "]";
    }
    

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public int getViewer() {
        return viewer;
    }

    public void setViewer(int viewer) {
        this.viewer = viewer;
    }

    

    
    
}
