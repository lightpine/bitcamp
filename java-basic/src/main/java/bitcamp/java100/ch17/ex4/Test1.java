// insert문 실행 후 auto_increment 컬럼 값 다루기
package bitcamp.java100.ch17.ex4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test1 {

    public static void main(String[] args) throws Exception {
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb?useUnicode=true&characterEncoding=utf-8",
                "study", "1111");
        
        PreparedStatement pstmt = con.prepareStatement("insert into jdbc_test(title,conts,regdt) values(?,?,now())");
        
        pstmt.setString(1, "제목이래요");
        pstmt.setString(2, "내용이래요...");
        
        pstmt.executeUpdate();
        
        System.out.println("실행 완료!");
        
        pstmt.close();
        con.close();
    }

}
