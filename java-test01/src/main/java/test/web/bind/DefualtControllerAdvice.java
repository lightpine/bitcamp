package test.web.bind;

import java.text.ParseException;
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
//        System.out.println("DefualtControllerAdviceinitBinder()");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        
        binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(dateFormat, false));

        
        @SuppressWarnings("serial")
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd") {
            @Override
            public Date parse(String source) throws ParseException {
                java.util.Date date = super.parse(source);
                return new java.sql.Date(date.getTime());
            }
        };
        dateFormat2.setLenient(false);
        
        binder.registerCustomEditor(java.sql.Date.class, new CustomDateEditor(dateFormat2, false));
    }
}
