package java100.app;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

import java100.app.Controller.BoardController;
import java100.app.Controller.Controller;
import java100.app.Controller.MemberController;
import java100.app.Controller.Request;
import java100.app.Controller.Response;
import java100.app.Controller.RoomController;
import java100.app.Controller.ScoreController;

public class App {
    ServerSocket ss;
    Scanner scan = new Scanner(System.in);
    HashMap<String, Controller> controllerMap = new HashMap<>();
    
    

    void init() {
        
        ScoreController scorecontroller = new ScoreController();
        scorecontroller.init();
        controllerMap.put("/score", scorecontroller);
        /*
        controllerMap.put("/member", new MemberController("./data/member.csv"));
        controllerMap.put("/board", new BoardController("./data/board.csv"));
        controllerMap.put("/room", new RoomController("./data/room.csv"));
        */
    }
    
    private void save() {
        Collection<Controller> controllers = controllerMap.values();
        for (Controller controller : controllers) {
            controller.destroy();
        }
    }


    void service () throws Exception{
        ss = new ServerSocket(9999);
        System.out.println("서버 실행");
        
        while (true) {
            new HttpAgent(ss.accept()).start();
        }
    }

    private void request(String command, PrintWriter out) {
        String menuName = command;

        int i = command.indexOf("/", 1);
        if (i != -1) {
            menuName = command.substring(0, i);
        }

        Controller controller = controllerMap.get(menuName);
        
        if (controller == null) {
            out.println("해당 명령을 지원하지 않습니다.");
            return;
        }
        
        Request request = new Request(command);
        
        Response response = new Response();
        response.setWriter(out);
        
        controller.execute(request, response);
        
        
    }

    private void hello(String command, PrintWriter out) {
        out.println("안녕하세요. 성적관리 시스템입니다.");
        out.println("[성적관리 명령들]");
        out.println("목록보기: /score/list");
        out.println("상세보기: /score/view?name=이름");
        out.println("등록: /score/add?name=이름&kor=점수&eng=점수&math=점수");
        out.println("변경: /score/update?name=이름&kor=점수&eng=점수&math=점수");
        out.println("삭제: /score/delete?name=이름");
        out.println("[회원]");
        out.println("[게시판]");
        out.println("[강의실]");        
    }

    public static void main(String[] args) throws Exception {

        App app = new App();
        app.init();
        app.service();

    }

    class HttpAgent extends Thread{
        Socket socker;

        public HttpAgent(Socket socket) {
            this.socker = socket;
        }

        @Override
        public void run() {
            try (Socket socket = this.socker;
                    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter out = new PrintWriter(new BufferedOutputStream(socket.getOutputStream()));
                    ){

                    String command = in.readLine().split(" ")[1];
                    
                    String header = null;
                    while (true) {
                        header = in.readLine();
                        if (header.equals(""))
                            break;
                    }
                    
                    out.println("HTTP/1.1 200 OK");
                    
                    out.println("Content-Type:text/plain;charset=UTF-8");
                    
                    out.println();
                    
                    
                    if (command.equals("/")) {
                        hello(command, out);
                    } else {
                        request(command, out);
                        save();
                    }
                    out.println();
                    out.flush();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}















