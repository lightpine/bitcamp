// 클래스 멤버와 인스턴스 멤버의 활용 II

package bitcamp.java100.ch06.ex5;

import java.util.Scanner;
// 여러개의 성적 데이터를 다룰 때 문제점
//  성적 데이터를 다루는 변수는 스태틱이기 떄문에 1명의 정보만 저장할 수 있다.
//  여러명의 성적을 다루려면 순차적으로 처리해야한다.
//  절대 동시에 여러명의 데이터를 보관할 수 없다.

public class Test4 {
    
    static boolean confirm(String message) {
        Scanner keyScan = new Scanner(System.in);
        System.out.println(message);
        while(keyScan.hasNextLine()) break;
        String response = keyScan.nextLine().toLowerCase();
        if (response.equals("y") || response.equals("yse")) 
            return true;
        return false;
    }
    
    public static void main(String[] args) {
        
        while (true) {
        Score1.inputScore();
        Score1.computeScore();
        Score1.printScore();
        
        if(!confirm("계속하시겠습니까?"))
            break;
        
        }
        
    }

}
