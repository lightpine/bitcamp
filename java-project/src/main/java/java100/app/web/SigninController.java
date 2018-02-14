package java100.app.web;

import java.util.Map;

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

import java100.app.domain.Member;
import java100.app.service.FacebookService;
import java100.app.service.MemberService;

@Controller
@RequestMapping("/auth")
@SessionAttributes("signinUser")
public class SigninController {
    
    @Autowired MemberService memberService;
    @Autowired FacebookService facebookService;
    
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
        
        Member member = memberService.get(email, password);
        
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
    
    @RequestMapping(value="facebookLogin")
    public String facebookLogin(
            String accessToken,
            HttpServletResponse response,
            HttpSession session,
            Model model) {

        try {
            @SuppressWarnings("rawtypes")
            Map result = facebookService.me(accessToken, Map.class);
            
            Member member = memberService.get((String)result.get("email"));
            
            if (member == null) {
                member = new Member();
                member.setName((String)result.get("name"));
                member.setEmail((String)result.get("email"));
                member.setPassword("1111");
                memberService.add(member);
            }
            
            model.addAttribute("signinUser", member);
            return "redirect:../score/list";
           
        } catch (Exception e) {
            // 엑세스토큰 무효하다면 예외 발생
            return "auth/signinfail";
        }
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
