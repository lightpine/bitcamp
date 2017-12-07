// DBMS에 연결하기 II - DriverMAnager를 이용하여 DBMS와 연결하기 
package bitcamp.java100.ch17.ex1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test3 {

    public static void main(String[] args) throws Exception {
        
        java.sql.Driver driver = new com.mysql.jdbc.Driver();
        
        DriverManager.registerDriver(driver);
        
        /*
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        System.out.println("연결 되었음!");
        */
        
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb",
                "study", "1111");
        System.out.println("연결 되었음!");
        
        con.close();
    }

}
