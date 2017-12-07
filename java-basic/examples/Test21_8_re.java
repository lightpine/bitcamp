// ## Scanner - 연습 II


package bitcamp.java100;

import java.io.Console;
import java.util.ArrayList;

public class Test21_8_re{

    
    
    public static void main(String[] args){
        
        Console console =  System.console();
        if(console == null) {
            System.out.println("콘솔을 지원하지 않습니다.");
            System.exit(1);
        }
        String[] name = new String[3];
        String[] tel = new String[3];
        String[] email = new String[3];
        
        int counnter = 0;
        
        while(counnter < name.length) {
            
            name[counnter] = console.readLine("이름 : ");
            tel[counnter] = console.readLine("전화번호 : ");
            email[counnter] = console.readLine("이메일 : ");
            counnter++;
            String response = console.readLine("계속 입력하시겠습니까?(y/n)");
            if (!(response.toLowerCase().equals("y") ||
                  response.toLowerCase().equals("yes")))
                break;
            
        }
       for(int i = 0; i < counnter; i++) {
            
            System.out.println(name[i]);
            System.out.println(tel[i]);
            System.out.println(email[i]);
           
        }
        
        
     

       }
}
       


         
         