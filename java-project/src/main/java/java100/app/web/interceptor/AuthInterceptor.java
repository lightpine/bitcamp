package java100.app.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;


public class AuthInterceptor implements HandlerInterceptor{

    @Override
    public boolean preHandle(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler) throws Exception {

        HttpSession session = request.getSession();

        // 로그인 정보가 없으면 로그인 폼으로 보낸다.
        if (session.getAttribute("signinUser") == null) {
            response.sendRedirect(
                    request.getServletContext().getContextPath() +
                    "/app/auth/signin");
            return false; 
            // 로그인된 상태가 아니라면 다음 인터셉터의 실행을 모두 멈추고 
            // 즉시 로그인 폼으로 간다.
        }


        return true;
    }

}
