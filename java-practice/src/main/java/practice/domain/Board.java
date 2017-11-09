package practice.domain;

import java.sql.Date;

import practice.controller.CSVFormatException;

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
    
    public Board (String csv) throws CSVFormatException{
        String[] rec = csv.split(",");
        
        if (rec.length != 5) // 데이터의 개수가 올바르지 않다면 이 데이터는 건너 뛴다. 
            throw new CSVFormatException(
                    "CSV 데이터 항목의 개수 올바르지 않습니다.");
        try {
            this.no = Integer.parseInt(rec[0]);
            this.title = rec[1];
            this.main  = rec[2];
            this.day  = Date.valueOf(rec[3]);
            this.viewer  = Integer.parseInt(rec[4]);
        } catch (Exception e) {
            throw new CSVFormatException(
                    "CSV 데이터 항목의 개수 올바르지 않습니다.");
        }
            
    }
    
    @Override
    public String toString() {
        return "Board [no=" + no + ", title=" + title + ", main=" + main + ", day=" + day + ", viewer=" + viewer + "]";
    }
    
    public String toCSVString() {
        return String.format("%d,%s,%s,%s,%d",
                this.getNo(),
                this.getTitle(),
                this.getMain(),
                this.getDay().toString(),
                this.getViewer());
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



    

    
    

