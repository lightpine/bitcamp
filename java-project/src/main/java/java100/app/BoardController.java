package java100.app;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BoardController extends Board{
    
    
    private ArrayList<Board> list = new ArrayList<>();
    static Scanner keyScan = new Scanner(System.in);
    
    public void execute() {
        loop:
            while(true) {
                System.out.print("게시판> ");
                String input = keyScan.nextLine();
                try {
                switch (input) {
                case "add":    this.doAdd(); break;
                case "list":   this.dolist(); break;
                case "view":   this.doView(); break;
                case "delete": this.dodelete(); break;
                case "update": this.doUpdate(); break;
                case "main":   break loop;
                default: 
                    System.out.println("해당 명령이 없습니다.");
                }
                }catch (Exception e) {;
                e.printStackTrace();
                }
                System.out.println();
            }
         
     }
    
     private void doUpdate() {
        int no = Integer.parseInt(Prompts.input("번호? "));
        
        Board board = null;
        Iterator<Board> iterator = list.iterator();
        while (iterator.hasNext()) {
            Board temp = iterator.next();
            if(temp.no == no) {
                board = temp;
                break;
            }
        }
        if (board == null) {
            System.out.printf("'%d' 게시물이 없습니다.\n", no);
        }else {
            update();
            
        }
        
    }

     private void dodelete() {
        System.out.println("게시물 삭제");
        int no = Integer.parseInt(Prompts.input("번호? "));
        
        Board board = null;
        Iterator<Board> iterator = list.iterator();
        while (iterator.hasNext()) {
            Board temp = iterator.next();
            if(temp.no == no) {
                board = temp;
                break;
            }
        }
        if (board == null) {
            System.out.printf("'%s' 게시물이 없습니다.\n", no);
        } else {
            if(Prompts.confirm2("정말 삭제하시겠습니까?(y/N)")) {
                list.remove(board);
                System.out.println("삭제하였습니다.");
            }else {
                System.out.println("삭제 취소하였습니다.");
            }
        }
        
        
    }

     private void doView() {
        System.out.println("게시물 정보");
        int no = Integer.parseInt(Prompts.input("번호? "));
        
        Board board = null;
        Iterator<Board> iterator = list.iterator();
        while (iterator.hasNext()) {
            Board temp = iterator.next();
            if(temp.no == getNo()) {
                board = temp;
                break;
            }
        }
        if (board == null) {
            System.out.printf("'%d'번 게시물이 없습니다.\n", no);
        }else {
            board.viewer++;
            printDeteil();
        }
        
    }

     private void dolist() {
        
        System.out.println("게시물 목록");
        Iterator<Board> iterator = list.iterator();
        while (iterator.hasNext()) {
            print(iterator.next());
        }
    }

     private void doAdd() {
        System.out.println("게시물 등록");
            
            Board board = new Board();
            add();
            boolean isExist = false;
            Iterator<Board> iterator = list.iterator();
            while (iterator.hasNext()) {
                if(iterator.next().no == board.no) {
                    isExist = true;
                    break;
                }
            }
            if (isExist) {
                System.out.printf("이미 등록된 번호 입니다.");
            }else {
                list.add(board);
                
            }
    }
     public void print(Board board) {
         System.out.printf("%d, %s, %s, %d\n",  
                 getNo(), 
                 getTitle(),
                 getDay().toString(),
                 getViewer());
     }
     
     public void add() {
         Scanner keyScan = new Scanner(System.in);
         
         
         System.out.printf("번호? ");
         int no = Integer.parseInt(keyScan.nextLine());
         setNo(no);
         
         System.out.print("제목? ");
         String title = keyScan.nextLine();
         setTitle(title);
         
         System.out.print("내용? ");
         String main = keyScan.nextLine();
         setMain(main);
         
         setDay(new Date(System.currentTimeMillis()));
         
     }
     
     public void update() {
         Scanner scan = new Scanner(System.in);
         
         System.out.printf("제목?(%s)", getTitle());
         String title = scan.nextLine();
         if (title.isEmpty()) {
             title = getTitle();
         }
         System.out.printf("내용?(%s)", getMain());
         String main = scan.nextLine();
        
         if (Prompts.confirm2("변경 하시겠습니까?(Y/n)")) {
             setTitle(title);
             setMain(main);
             setDay(new Date(System.currentTimeMillis()));
             System.out.println("변경되었습니다.");
         }else
             System.out.println("변경이 취소되었습니다.");
     }
     
     public void printDeteil() {
         
         System.out.printf("제목 : %s\n내용 : %s\n등록일 : %s\n조회수 : %d\n",  
                 getTitle(), getMain(), getDay(), getViewer()); 
     }
}

