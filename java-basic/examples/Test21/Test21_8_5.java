// ## Scanner - 연습 II

package bitcamp.java100.Test21;

import java.io.Console;
//6단계 : 코드를 기능별로 분리하여 메서드 안에 묶어두기.

import bitcamp.java100.Test21.Test21_8_4.Contact;


public class Test21_8_5{
    // Contact 값을 저장할 레퍼런스 배열을 만든다.
    static Contact[] contacts = new Contact[100];
    // 값이 저장될 위치 (Index)
    static int cursor = 0;
    // 콘솔 객체를 준비한다.
    static  Console console;
    
    static class Contact{
        String name;
        String email;
        String tell;
    }
    
    static void printContacts(){
     // 배열에 저장된 값을 출력한다.
        for (int i = 0; i < cursor; i++) {
            System.out.printf("%s,%s,%s\n",
                    contacts[i].name,
                    contacts[i].email,
                    contacts[i].tell);
        }
    }
    static boolean confirm(String message) {
        String input = console.readLine(message +"(y/n)");
        if(!(input.toLowerCase().equals("y") ||
          input.toLowerCase().equals("yes")))
            return true;
        return false;
    }
    static Contact inputContact() {
        Contact contact = new Contact();
        //사용자가 입력한 데이터를 Contact 인스턴스(객)에 저장된다.
        contact.name = console.readLine("이름 : ");
        contact.email = console.readLine("이메일 : ");
        contact.tell = console.readLine("전화 : ");
        
        return contact;
    }
        
    public static void main(String[] args){
        
         console = System.console();
        
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다."); // err = 에러메시지를 띄울때 사용한다.
            System.exit(1); // JVM을 종료한다.
        }
        

        while(cursor < contacts.length) {
            
            Contact contact = inputContact();
            
            if(confirm("저장하시겠습니까?")) {
                contacts[cursor] = contact;
                cursor++;
            }
            
            if(!confirm("계속 입력하시겠습니까?"))
                break;
        }
        
        printContacts();
        
    }
}
       


         
         