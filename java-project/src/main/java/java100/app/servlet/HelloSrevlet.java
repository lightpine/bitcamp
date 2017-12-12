package java100.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// RoomController는 ArrayList를 상속 받은 서브 클래스이기도 하지만,
@SuppressWarnings("serial")
// Controller라는 규칙을 따르는 클래스이기도 하다!
@WebServlet("/hello/*")
public class HelloSrevlet extends HttpServlet {
    
    
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException{

            response.setContentType("text/plain;charset=UTF-8");
            
            switch (request.getPathInfo()) {
            case "/hi": this.doHi(request, response); break;
            case "/hi2": this.doHi2(request, response); break;
            default: 
                response.getWriter().println("해당 명령이 없습니다.");
            }
    }
    
    private void doHi(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        out.println("[하이루~~~~]");
    }
        
    
    private void doHi2(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        out.println("오호라~..... 안녕!");
    } 
}










