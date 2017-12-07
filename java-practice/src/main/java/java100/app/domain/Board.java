package java100.app.domain;
import java.sql.Date;
import java.util.Scanner;

import java100.app.Controller.CSVFormatException;


public class Board {

    protected int no;
    protected String title;
    protected String content;
    protected Date day;
    protected int viewCount;
    

    public Board() {}
    public Board(int no, String title, String content) {

        this.no = no;
        this.title = title;
        this.content = content;
    }
    
    public Board (String csv) throws CSVFormatException {
        String[] rec = csv.split(",");
        if (rec.length != 5)
            throw new CSVFormatException("CSV 데이터 항목의 개수가 올바르지 않습니다.");

        try {
            this.no = Integer.parseInt(rec[0]);
            this.title = rec[1];
            this.content = rec[2];
            this.day = Date.valueOf(rec[3]);
            this.viewCount = Integer.parseInt(rec[4]);
            
        } catch (Exception e) {
            throw new CSVFormatException("CSV 데이터 항목의 형식이 올바르지 않습니다.");
        }

    }
    
    public String toCSVString() {
        return String.format("%d, %s, %s, %s, %d",
                this.getNo(),
                this.getTitle(),
                this.getContent(),
                this.getDay().toString(),
                this.getViewCount()
                );
    }
    
    @Override
    public String toString() {
        return "Board [no=" + no + ", title=" + title + ", content=" + content + ", day=" + day + ", viewCount="
                + viewCount + "]";
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
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Date getDay() {
        return day;
    }
    public void setDay(Date day) {
        this.day = day;
    }
    public int getViewCount() {
        return viewCount;
    }
    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }
}