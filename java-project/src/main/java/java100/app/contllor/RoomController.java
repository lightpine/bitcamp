package java100.app.contllor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import java100.app.domain.Room;
import java100.app.util.Prompts;

public class RoomController extends ArrayList<Room> implements Controller {
    
    Scanner keyScan = new Scanner(System.in);
    
    @Override
    public void execute() {
        loop:
            while(true) {
                System.out.print("강의실관리> ");
                String input = keyScan.nextLine();
                try {
                switch (input) {
                case "add":    this.doAdd(); break;
                case "list":   this.dolist(); break;
                case "delete": this.dodelete(); break;
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
        System.out.println("강의실 등록");
            
            Room room = new Room();
            
            room.setName(Prompts.inputString("강의실 이름? "));
            
            if (find(room.getName()) != null) {
                System.out.printf("이미 등록된 강의실 입니다.");
                return;
            }
            
            room.setLoication(Prompts.inputString("장소? "));
            room.setCapacity(Prompts.inputInt("수용인원? "));
            this.add(room);
    }
    
     private void dolist() {
        
        System.out.println("강의실 목록");
        Iterator<Room> iterator = this.iterator();
        while (iterator.hasNext()) {
            Room room = iterator.next();
            System.out.printf("%s, %s, %d\n",  
                    room.getLoication(), 
                    room.getName(),
                    room.getCapacity());
        }
    }
     
   
     private void dodelete() {
        System.out.println("강의실 삭제");
        String roomName = Prompts.inputString("강의실 이름? ");
        
        Room room = find(roomName);
        
        if (room == null) {
            System.out.printf("'%s' 갈의실 정보가 없습니다.\n", roomName);
            return;
        }
        if(Prompts.confirm2("정말 삭제하시겠습니까?(y/N)")) {
            this.remove(room);
            System.out.println("삭제하였습니다.");
        }else
            System.out.println("삭제 취소하였습니다.");
    }
    
     private Room find(String roomName) {
         Iterator<Room> iterator = this.iterator();
         while (iterator.hasNext()) {
             Room room = iterator.next();
             if(room.getName().equals(roomName)) {
                 return room;
             }
         }
         return null;
     }
}
