package java100.app.web;

import java.util.HashMap;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import java100.app.dao.MemberDao;
import java100.app.domain.Member;

@Controller
@RequestMapping("/auth")
@SessionAttributes("signinUser")
public class SigninController {
    
    @Autowired MemberDao memberDao;
    
    @RequestMapping(value="signin", method=RequestMethod.GET)
    public String from(Model model) {
        model.addAttribute("menuVisible", false);
        return "auth/signinform";
    }
    
    @RequestMapping(value="signin", method=RequestMethod.POST)
    public String signin(
            String email,
            String password,
            String saveEmail,
            HttpServletResponse response,
            Model model
            ) {
        
        HashMap<String, Object> params = new HashMap<>();
        
        params.put("email", email);
        params.put("password", password);
        
        Member member = memberDao.findByEmailAndPassword(params);
        
        if (saveEmail != null) {
            
            Cookie cookie = new Cookie("email", email);
            cookie.setMaxAge(60 * 60 * 24 * 30);
            response.addCookie(cookie);
        } else {
            Cookie cookie = new Cookie("email", "");
            cookie.setMaxAge(0);
            response.addCookie(cookie);
        }
        
        if (member == null) {
            model.addAttribute("signinUser", null);
            model.addAttribute("menuVisible", false);
            return "auth/signinfail";
        }
        model.addAttribute("signinUser", member);
        return "redirect:../score/list";
    }
    
    @RequestMapping("signout")
    public String signout(HttpSession session, SessionStatus status) {
        // @SessionAttribute에서 관리하는 세션 데이터를 모두 제거한다.,
        status.setComplete();
        
        // HttpSession 객체를 무효화시킨다.
        session.invalidate();
        
        return "redirect:signin";
    }
    
}
