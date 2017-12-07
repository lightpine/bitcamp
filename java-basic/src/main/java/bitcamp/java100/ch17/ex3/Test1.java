// Statement의 문제점
package bitcamp.java100.ch17.ex3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Test1 {

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

        Statement stmt = con.createStatement();

        stmt.executeUpdate("update jdbc_test set title ='" + title
                + "', conts = '" + conts
                + "' where no=" + no);


        System.out.println("변경 완료!");

        stmt.close();
        con.close();
    }


}
