// 비트 연산자 클래스를 이용한 응용 

package bitcamp.java100;

public class Test15_11_2{
    
    public static void main(String[] args){
        class privilege{
        
            boolean isDirectory ;
            boolean ownerRead ;
            boolean ownerWrite ;
            boolean ownerExe ;
            boolean groupRead ;
            boolean groupWrite ;
            boolean groupExe ;
            boolean otherRead ;
            boolean otherWrite ;
            boolean otherExe ;
            
        }
        
        privilege p1 = new privilege();
        
        p1.isDirectory = false;
        p1.ownerRead = true;
        p1.ownerWrite = true;
        p1.ownerExe = true;
        p1.groupRead = true;
        p1.groupWrite = false;
        p1.groupExe = true;
        p1.otherRead = true;
        p1.otherWrite = false;
        p1.otherExe = false;
        
        System.out.print(p1.isDirectory ? "d" : "-");
        System.out.print(p1.ownerRead ? "r" : "-");
        System.out.print(p1.ownerWrite ? "w" : "-");
        System.out.print(p1.ownerExe ? "x" : "-");
        System.out.print(p1.groupRead ? "r" : "-");
        System.out.print(p1.groupWrite ? "w" : "-");
        System.out.print(p1.groupExe ? "x" : "-");
        System.out.print(p1.otherRead ? "r" : "-");
        System.out.print(p1.otherWrite ? "w" : "-");
        System.out.print(p1.otherExe ? "x" : "-");
        System.out.println();
        
    }
}