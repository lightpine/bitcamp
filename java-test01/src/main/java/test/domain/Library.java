package test.domain;

import java.sql.Date;
import java.util.List;

public class Library {
    
    int no;
    String title;
    String publisher;
    Date createDate;
    int price;
    String explanation;
    List<UploadFile> files;
    
    public Library() {}
    
    public Library(int no, String title, String publisher,
            int price, String explanation) {
        this.no = no;
        this.title = title;
        this.publisher = publisher;
        this.price = price;
        this.explanation = explanation;
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public List<UploadFile> getFiles() {
        return files;
    }

    public void setFiles(List<UploadFile> files) {
        this.files = files;
    }
    
    

}
