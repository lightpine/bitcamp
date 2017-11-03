package java100.app;

import java.util.ArrayList;
import java.util.Scanner;

public class App3 {
    static boolean confirm(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.print(message);
        String response = scan.nextLine().toLowerCase();
        if (response.equals("y") || response.equals("yes") || response.equals(""))
            return true;
        return false;
        
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Score> list = new ArrayList<>();
        
        loop:
        while(true) {
            System.out.print("성적관리>");
            String input = scan.nextLine();
            System.out.println();
            
            switch (input) {
            
                case "add":
                    while (true) {
                        Score score = new Score();
                        score.add();
                        list.add(score);
                        
                        if (!confirm("계속하시겠습니까?(Y/n)")) {
                            break;
                        }
                    }
                    break;
                case "list":
                    break;
                case "view":
                    break;
                case "delete":
                    break;
                case "update":
                    break;
                case "quit":
                    break loop;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            
            }
        }
        
    }
}
