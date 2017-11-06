package java100.app.contllor;

import java.sql.Date;
import java.util.Iterator;

import java100.app.domain.Board;
import java100.app.util.Prompts;

public class BoardController extends GenericController<Board> {
    
    @Override
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
    
    private void doAdd() {
        System.out.println("게시물 등록");
            
            Board board = new Board();
            
            board.setNo(Prompts.inputInt("번호? "));
            
            if (findByNo(board.getNo()) != null) {
                System.out.printf("이미 등록된 번호 입니다.");
                return;
            }
            
            board.setTitle(Prompts.inputString("제목? "));
            board.setMain(Prompts.inputString("내용? "));
            board.setDay(new Date(System.currentTimeMillis()));
            
            list.add(board);
    }
    
     private void dolist() {
        
        System.out.println("게시물 목록");
        Iterator<Board> iterator = list.iterator();
        while (iterator.hasNext()) {
            Board board = iterator.next();
            System.out.printf("%d, %s, %s, %d\n",  
                    board.getNo(), 
                    board.getTitle(),
                    board.getMain().toString(),
                    board.getViewer());
        }
    }
     
     private void doView() {
         System.out.println("게시물 정보");
         int no = Prompts.inputInt("번호? ");
         
         Board board = findByNo(no);
         
         if (board == null) {
             System.out.printf("'%d'번 게시물이 없습니다.\n", no);
             return;
         }
         board.setViewer(board.getViewer() + 1);
         System.out.printf("제목 : %s\n내용 : %s\n등록일 : %s\n조회수 : %d\n",  
                 board.getTitle(), board.getMain(), board.getDay(), board.getViewer()); 
     }
     
     
     private void doUpdate() {
        int no = Prompts.inputInt("번호? ");
        
        Board board = findByNo(no);
        
        if (board == null) {
            System.out.printf("'%d' 게시물이 없습니다.\n", no);
            return;
        }
        
        String title = Prompts.inputString("제목?(%s)", board.getTitle());
        
        if (title.isEmpty()) {
            title = board.getTitle();
        }
        
        String main = Prompts.inputString("내용?");
        
        if (Prompts.confirm2("변경 하시겠습니까?(Y/n)")) {
            board.setTitle(title);
            board.setMain(main);
            board.setDay(new Date(System.currentTimeMillis()));
            System.out.println("변경되었습니다.");
        } else
            System.out.println("변경이 취소되었습니다.");
     }
        
     private void dodelete() {
        System.out.println("게시물 삭제");
        int no = Prompts.inputInt("번호? ");
        
        Board board = findByNo(no);
        
        if (board == null) {
            System.out.printf("'%s' 게시물이 없습니다.\n", no);
            return;
        }
        if(Prompts.confirm2("정말 삭제하시겠습니까?(y/N)")) {
            list.remove(board);
            System.out.println("삭제하였습니다.");
        }
        System.out.println("삭제 취소하였습니다.");
    }
    
     private Board findByNo(int no) {
         Iterator<Board> iterator = list.iterator();
         while (iterator.hasNext()) {
             Board board = iterator.next();
             if(board.getNo() == no) {
                 return board;
             }
         }
         return null;
     }
}
