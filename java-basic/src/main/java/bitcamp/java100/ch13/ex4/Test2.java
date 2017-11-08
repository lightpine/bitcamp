// 명시적으로 ExceptionErrer를 던지면 좋은점
package bitcamp.java100.ch13.ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    
    static class Score{
        String name;
        int kor;
        int eng;
        int math;
        int sum;
        float aver;
    }
    
    static ArrayList<Score> list = new ArrayList<>();
    static Scanner keyScan = new Scanner(System.in);
    
    static void input() throws Exception{
        Score score = new Score();
        
        System.out.print("이름? ");
        score.name = keyScan.nextLine();
        
        try {   // 입력 받을때 예외가 발생하면 exception을 떤지겠다!
            
            System.out.print("국어? ");
            score.kor = Integer.parseInt(keyScan.nextLine());
            
            System.out.print("영어? ");
            score.eng = Integer.parseInt(keyScan.nextLine());
            
            System.out.print("수학? ");
            score.math = Integer.parseInt(keyScan.nextLine());
            
        }catch (RuntimeException e) {
            
            throw new Exception("입력이 잘못되었습니다.!");
        }
        
        score.sum = score.kor + score.eng + score.math;
        score.aver = score.sum / 3f;
        
        list.add(score);
    }
    
    static void print() {
        for (Score s: list) {
            System.out.printf("%s, %d, %d, %d, %d, %.2f\n",
                    s.name,
                    s.kor,
                    s.eng,
                    s.math,
                    s.sum,
                    s.aver);
        }
    }
    
    public static void main(String[] args) {
        while (true) {
            
            try { // 메서드를 사용할 때 예외처리를 반드시 하도록 한다!
                
                input();
                
            }catch (Exception e) {
                
                System.out.println("입력중 오류가 발생하였습니다.");
            }
            
            System.out.print("계속하시겠습니까? (Y/n)");
            String str = keyScan.nextLine().toLowerCase();
            
            if (str.equals("") || str.equals("y") || str.equals("yes")) {
                continue;
            }
            
            break;
        }
        
        System.out.println("-----------------------------------------");
        
        print();
    }
}
