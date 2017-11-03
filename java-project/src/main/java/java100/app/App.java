package java100.app;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    static Scanner keyScan = new Scanner(System.in);
    static ScoreController scorecontrol = new ScoreController();

    public static void main(String[] args) {
        loop:
        while(true) {
            System.out.print("명령> ");
            String menu = keyScan.nextLine();
            System.out.println();
            
                switch (menu) {
                case "menu": domenu(); break;
                case "help": doHelp(); break;
                case "quit": doQuit(); break loop;
                default: doError();
                    
                }
            System.out.println();
        }
        
        
    }    
    
    private static void domenu() {
        
        System.out.println("1성적관리");
        System.out.println("2회원관리");
        System.out.println("3게시판");
        System.out.println();
        System.out.print("명령> ");
        System.out.println();
        
        String menuNum = keyScan.nextLine();
        switch (menuNum) {
        case "go 1": doScore(); break;
        case "go 2": doMember();
            break;
        case "go 3":
            break;
        }
        
    }


    private static void doScore() {
        
        loop2:
            while(true) {
                System.out.print("성적관리> ");
                String input = keyScan.nextLine();
                
                switch (input) {
                case "add":    scorecontrol.doAdd(); break;
                case "list":   scorecontrol.dolist(); break;
                case "view":   scorecontrol.doView(); break;
                case "delete": scorecontrol.dodelete(); break;
                case "update": scorecontrol.doUpdate(); break;
                case "quit":   doQuit(); break loop2;
                default: doError();
                }
                System.out.println();
            }
        
    }

    private static void doHelp() {
        
        System.out.println("[명령]");
        System.out.println("menu        - 메뉴 목록 출력합니다.");
        System.out.println("go 번호     - 메뉴로 이동합니다.");
        System.out.println("quit        - 프로그램을 종료합니다.");
        
    }

    private static void doError() {
        System.out.println("실행할 수 없는 명령입니다.");
    }

    private static void doQuit() {
        System.out.println("프로그램을 종료합니다.");
    }

    

}

