// 트랜잭션을 이용하여 여러 SQL문의 실행을 한 묶음으로 다루기
package bitcamp.java100.ch17.ex5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/"
                + "studydb?useUnicode=true&characterEncoding=utf-8",
                "study", "1111");

        PreparedStatement pstmt = con.prepareStatement("insert into jdbc_test(title,conts,regdt)"
                                                    + " values(?,?,now())");

        while (true) {
            System.out.print("제목? ");
            String title = scan.nextLine();

            System.out.print("내용? ");
            String conts = scan.nextLine();

            pstmt.setString(1, title);
            pstmt.setString(2, conts);

            pstmt.executeUpdate();
            System.out.println("입력 완료!");

            System.out.print("계속 입력하시겠습니까? (y/n)");
            String str = scan.nextLine().toLowerCase();
            if (!str.equals("y"))
                break;
        }

        pstmt.close();
        con.close();
        scan.close();
    }

}
