package java100.app.web.bind;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice
public class DefualtControllerAdvice {
    
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        //System.out.println("DefualtControllerAdviceinitBinder()");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
}
