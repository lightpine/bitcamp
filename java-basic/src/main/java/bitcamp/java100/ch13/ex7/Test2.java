// 예외처리 문법 정리 : Throw를 이용하여 예외 던지기!
package bitcamp.java100.ch13.ex7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Test2 {

    static void m1(int i) throws SQLException, Exception,
        IOException,FileNotFoundException {
        
        switch(i) {
        case 1 : throw new Exception();
        case 2 : throw new SQLException();
        case 3 : throw new IOException();
        case 4 : throw new FileNotFoundException();
        
        }
    }
    
    public static void main(String[] args) 
            throws IOException, Exception { // 예외처리를 JVM에게 떠넘기는건 바람직하지 않다.
                                            // JVM은 예외가 발생하면 즉시 프로그램을 종료하기 때문이다.
        
        try {
            m1(2);
        } catch (FileNotFoundException e) {
        } catch (SQLException e) {
        } catch (IOException e) {
        } catch (Exception e) {
        }
        
        try {
            m1(1);
        } catch (Exception e) {
        }
        
        try {
            m1(3);
        }catch (SQLException e) {
        }catch (FileNotFoundException e) {
        }
    }
}
