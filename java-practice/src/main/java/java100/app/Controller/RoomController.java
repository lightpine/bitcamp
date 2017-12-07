package java100.app.Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import java100.app.domain.Room;
import java100.app.util.Prompts;

public class RoomController extends ArrayList<Room> implements Controller{
    
private String dataFilePath;
    
    public RoomController(String dataFilePath) {
        this.dataFilePath = dataFilePath;
        this.init();
    }
    
    // ArrayList에 보관된 데이터를 score.csv 파일에 저장한다.
    // 저장하는 형식은 CSV(Comma Separated Value) 방식을 사용한다.
    // 예) 홍길동,100,100,100,300,100.0
    @Override
    public void destroy() {
        
        try (PrintWriter out = new PrintWriter(
                new BufferedWriter(
                new FileWriter(this.dataFilePath)))) {
            for (Room room : this) {
                out.write(room.toCSVString() + "\n");
            }
            
        } catch (IOException e) {
            e.printStackTrace();
            
        }
    }
    
    // CSV 형식으로 저장된 파일에서 성적 데이터를 읽어 
    // ArrayList에 보관한다.
    @Override
    public void init() {
        
        try (
                BufferedReader in = new BufferedReader(
                        new FileReader(this.dataFilePath));) {
            
            String csv = null;
            while ((csv = in.readLine()) != null) {
                try {
                    this.add(new Room(csv));
                } catch (CSVFormatException e) {
                    System.err.println("CSV 데이터 형식 오류!");
                    e.printStackTrace();
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    Scanner scan = new Scanner(System.in);
    
    public void excute() {
        loop:
            while (true) {
                System.out.print("강의실관리> ");
                String menu = scan.nextLine();

                switch(menu) {
                case "add":  this.doAdd(); break;
                case "list": this.doList(); break;
                case "delete":this.doDelete(); break;
                case "main": break loop;
                default : System.out.println("해당 명령이 없습니다.");
                }
            }
    }

    private void doDelete() {
        System.out.println("[강의실 삭제]");
        String roomName = Prompts.inputString("강의실 이름? ");

        Room room = findByName(roomName);

        if (room == null) {
            System.out.printf("%s란 강의실이 없습니다.",roomName);
        } 

        if (!Prompts.confirm2("정말 삭제하시겠습니까? (y/N)")) {
            return;
        } else {
            this.remove(room);
            System.out.println("삭제하였습니다.");
        }
    }

    private void doList() {
        System.out.println("[강의실 정보]");

        Iterator<Room> iterator = this.iterator();

        while (iterator.hasNext()) {
            Room room = iterator.next();
            System.out.printf("%4s, %-4s, %4s\n",
                    room.getLocation(),
                    room.getName(),
                    room.getCapacity());

        }
    }

    public void doAdd() {
        System.out.println("[강의실 등록]");
        Room room = new Room();
        
        room.setName(Prompts.inputString("이름? "));
        if (findByName(room.getName()) != null) {
            System.out.println("이미 등록된 강의실 입니다.");
        }

        room.setLocation(Prompts.inputString("장소? "));
        room.setCapacity(Prompts.inputInt("인원수? "));

            this.add(room);
    }

    private Room findByName(String name) {
        Iterator<Room> iterator = this.iterator();
        while(iterator.hasNext()) {
            Room room = iterator.next();
            if (room.getName().equals(name)) {
                return room;
            }
        }
        return null;
    }


}
