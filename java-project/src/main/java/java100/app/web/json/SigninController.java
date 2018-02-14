package java100.app.web.json;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import java100.app.domain.Member;
import java100.app.service.FacebookService;
import java100.app.service.MemberService;

@RestController
@RequestMapping("/auth")
@SessionAttributes("signinUser")
public class SigninController {
    
    @Autowired MemberService memberService;
    @Autowired FacebookService facebookService;
    
    @RequestMapping(value="signin", method=RequestMethod.POST)
    public Object signin(
            String email,
            String password,
            boolean saveEmail,
            HttpServletResponse response,
            HttpSession session,
            Model model
            ) {
        
        Member member = memberService.get(email, password);
        
        if (saveEmail) {
            
            Cookie cookie = new Cookie("email", email);
            cookie.setMaxAge(60 * 60 * 24 * 30);
            response.addCookie(cookie);
        } else {
            Cookie cookie = new Cookie("email", "");
            cookie.setMaxAge(0);
            response.addCookie(cookie);
        }
        
        HashMap<String, Object> result = new HashMap<>();
        
        if (member == null) {
            model.addAttribute("signinUser", null);
            
            result.put("status", "fail");
        } else {
            model.addAttribute("signinUser", member);
            result.put("status", "success");
        }
        return result;
    }
    
    @RequestMapping(value="facebookLogin")
    public Object facebookLogin(
            String accessToken,
            HttpSession session,
            Model model) {
        
        try {
            @SuppressWarnings("rawtypes")
            Map userInfo = facebookService.me(accessToken, Map.class);
            
            Member member = memberService.get((String)userInfo.get("email"));
            
            if (member == null) {
                member = new Member();
                member.setName((String)userInfo.get("name"));
                member.setEmail((String)userInfo.get("email"));
                member.setPassword("1111");
                memberService.add(member);
            }
            
            model.addAttribute("signinUser", member);
            
            HashMap<String, Object> result = new HashMap<>();
            result.put("status", "success");
            return result;
            
        } catch (Exception e) {
            HashMap<String, Object> result = new HashMap<>();
            result.put("status", "fail");
            return result;
        }
    }
    
    @RequestMapping("signout")
    public Object signout(HttpSession session, SessionStatus status) {
        // @SessionAttribute에서 관리하는 세션 데이터를 모두 제거한다.,
        status.setComplete();
        
        // HttpSession 객체를 무효화시킨다.
        session.invalidate();
        
        HashMap<String,Object> result = new HashMap<>();
        result.put("status", "success");
        return result;
    }
    
    @RequestMapping("signinUser")
    public Object signinUser(HttpSession session) {
        
        Member member = (Member)session.getAttribute("signinUser");
        
        HashMap<String,Object> result = new HashMap<>();
        
        if (member != null) {
            result.put("status", "success");
            result.put("member", member);
        } else {
            result.put("status", "fail");
        }
            
        return result;
    }
    
}
