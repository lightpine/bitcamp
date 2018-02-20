package test.domain;

public class UploadFile {
    int no;
    String filename;
    int libraryNo;
    
    public UploadFile() {}
    
    public UploadFile(String filename) {
        this(0, filename);
    }
    
    public UploadFile(int no, String filename) {
        this.no = no;
        this.filename = filename;
    }
    
    
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getFilename() {
        return filename;
    }
    public void setFilename(String filename) {
        System.out.println(filename);
        this.filename = filename;
    }

    public int getLibraryNo() {
        return libraryNo;
    }

    public void setLibraryNo(int libraryNo) {
        this.libraryNo = libraryNo;
    }
    
}
