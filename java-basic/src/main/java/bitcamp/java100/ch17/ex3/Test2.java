// prepardStatement 사용
package bitcamp.java100.ch17.ex3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.print("변경할 게시물 번호? ");
        String no = scan.nextLine();
        
        System.out.print("제목? ");
        String title = scan.nextLine();

        System.out.print("내용? ");
        String conts = scan.nextLine();        

        scan.close();

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb?useUnicode=true&characterEncoding=utf-8",
                "study", "1111");
        
        PreparedStatement pstmt = con.prepareStatement("update jdbc_test set title=?, conts=? where no=?");
        
        pstmt.setString(1, title);
        pstmt.setString(2, conts);
        pstmt.setString(3, no);
        
        pstmt.executeUpdate();

        System.out.println("변경 완료!");

        pstmt.close();
        con.close();
    }


}
