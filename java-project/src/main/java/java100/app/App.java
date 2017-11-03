package java100.app;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    static Scanner keyScan = new Scanner(System.in);

    public static void main(String[] args) {
        ScoreController scorecontrol = new ScoreController();
        
        loop:
            while(true) {
                System.out.print("성적관리> ");
                String input = keyScan.nextLine();
                
                switch (input) {
                case "add":    scorecontrol.doAdd(); break;
                case "list":   scorecontrol.dolist(); break;
                case "view":   scorecontrol.doView(); break;
                case "delete": scorecontrol.dodelete(); break;
                case "update": scorecontrol.doUpdate(); break;
                case "quit":   doQuit(); break loop;
                default: doError();
                }
                System.out.println();
            }
    }    
    
    private static void doError() {
        System.out.println("실행할 수 없는 명령입니다.");
    }

    private static void doQuit() {
        System.out.println("프로그램을 종료합니다.");
    }

    

}

