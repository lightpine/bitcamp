package java100.app;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App2 {
    static Scanner keyScan = new Scanner(System.in);
    static ScoreController scorecontrollre = new ScoreController();
    static MemberController memberController = new MemberController();
    static BoardController boardController = new BoardController();
    
    public static void main(String[] args) {
        loop:
        while(true) {
            System.out.print("명령> ");
            String[] menu = keyScan.nextLine().toLowerCase().split(" ");
            
            try {
                switch (menu[0]) {
                case "menu": domenu(); break;
                case "help": doHelp(); break;
                case "quit": doQuit(); break loop;
                case "go"  : dogo(menu[1]); break;
                default    : doError();
                    
                }
            }catch (Exception e) {
                System.out.println("명령 처리 중 오류발생!");
            }
            System.out.println();
        }
        
    }
    
    private static void domenu() {
        System.out.println("1성적관리");
        System.out.println("2회원관리");
        System.out.println("3게시판");
    }

    private static void dogo(String menuNo) {
        switch(menuNo){
        case "1": scorecontrollre.execute();
            break;
        case "2": memberController.execute();
            break;
        case "3": boardController.execute();
            break;
        default:
            System.out.println("해당 번호의 메뉴가 없습니다.");
            
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

