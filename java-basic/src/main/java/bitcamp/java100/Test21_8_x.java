// ## Scanner - 연습 II

package bitcamp.java100;

import java.io.Console;

public class Test21_8_x{
    static void print(Man man) {
        System.out.printf("%s     %s  %s\n",
                man.name, man.tell, man.email);
    }
    static void init(Man man, String name, String tell, String email) {
        man.name = name;
        man.tell = tell;
        man.email = email;
    }
     
     
    public static void main(String[] args){
        
        Console console = System.console();
        
        if (console == null) {
            
            System.err.println("콘솔을 지원하지 않습니다."); // err = 에러메시지를 띄울때 사용한다.
            
            System.exit(1); // JVM을 종료한다.
        }
        
        
        Man[] m = {new Man(),new Man(),new Man(),new Man()};
        
        
        String check;
       
        int j = 0;

        Label1:
        while(true){
            
            while(true) {
                String n = console.readLine("이름? ");
                String t = console.readLine("전화? ");
                String e = console.readLine("이메일? ");
                check = console.readLine("저장하시겠습니까?(y/n)");
        
        
                if(check.equals("y")) {
            
                    init(m[j],n,t,e);
                    j++;    
                    System.out.println("저장하였습니다."); //반복되는 부분
                    break;
                }else 
                    System.out.println("저장 취소하였습니다.");
                    break;
                }
        
            check = console.readLine("계속입력하시겠습니까?(y/n)");
                    if (check.equals("y")) {
                        continue;
                    }else {
                        break;
                    }
                }
            
        System.out.println("------------------------");
                
            for (int i = 0; i < j; i++) {
                print(m[i]);
                }
               
                System.out.println(">");
        
       }
}
       


         
         