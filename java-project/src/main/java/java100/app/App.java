package java100.app;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

import java100.app.contllor.BoardController;
import java100.app.contllor.Controller;
import java100.app.contllor.MemberController;
import java100.app.contllor.RoomController;
import java100.app.contllor.ScoreController;

/**
 * @author lightpine
 *  
 * date : 2017_11_06_mon
 * 
 * 리팩토링 정리가 끝난 후 모습
 * 
 * generalization을 통해 execute및 공통 소스를 뽑아내어
 * 클래스를 만들고 상속을 받아 더욱 쉽게 사용
 *
 */
public class App {
    
    static Scanner keyScan = new Scanner(System.in);
    static HashMap<String,Controller> controllerMap = new HashMap<>();
    
    public static void main(String[] args) { 
        controllerMap.put("1", new ScoreController("./data/score.csv"));
        controllerMap.put("2", new MemberController("./data/member.csv"));
        controllerMap.put("3", new BoardController("./data/board.csv"));
        
        controllerMap.put("4", new RoomController("./data/room.csv")); // 컴파일 오류!
        
        
        //controllerMap.put("4", new GenericController<Room>()); 추상클래스를 직접 인스턴스 하면 안된다
        // 쓰지 말라고 만들어 놓은건 쓰지 말자!
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
        System.out.println("4강의실");
    }

    private static void dogo(String menuNo) {
        
        Controller controller = controllerMap.get(menuNo);
        
        if (controller == null) {
            System.out.println("해당 번호의 메뉴가 없습니다.");
        }
        
        controller.execute();
        
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
        Collection<Controller> controls = controllerMap.values();
        
        for (Controller control : controls) {
            control.destroy(); // 각 컨트롤러에게 마무리 기회를 준다.
        }
        
        System.out.println("프로그램을 종료합니다.");
        
    }
    
   
}

