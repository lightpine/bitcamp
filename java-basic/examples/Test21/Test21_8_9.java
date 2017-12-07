// ## Scanner - 연습 II

package bitcamp.java100.Test21;

import java.io.Console;
//6단계 : 코드를 기능별로 분리하여 메서드 안에 묶어두기.

import bitcamp.java100.Test21.Test21_8_4.Contact;


// 10단계 : Contact배열을 다루는 메서드를 별도의 분류한다.
//          class를 메서드를 분류하는 데 사용하는 전형적인 예.
public class Test21_8_9{

    static  Console console;
    
    static void printContacts(){
     // 배열에 저장된 값을 출력한다.
        for (int i = 0; i < ContactArray.size(); i++) {
            Contact contact = ContactArray.get(i);
            System.out.printf("%s,%s,%s\n",
                    contact.name,
                    contact.email,
                    contact.tell);
        }
    }
    static boolean confirm(String message) {
        String input = console.readLine(message +"(y/n)");
        if(input.toLowerCase().equals("y") ||
           input.toLowerCase().equals("yes"))
            return true;
        return false;
    }
    static Contact inputContact() {
        Contact contact = new Contact();
        //사용자가 입력한 데이터를 Contact 인스턴스(객체)에 저장된다.
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
        

        while(true) {
            
            Contact contact = inputContact();
            
            if(confirm("저장하시겠습니까?")) {
                try {
                    ContactArray.add(contact);
                }catch (RuntimeException e) {
                    System.err.println("최대 저장 개수를 초과하였습니다!");
                    break;
                }
            }
            
            if(!confirm("계속 입력하시겠습니까?"))
                break;
        }
        
        printContacts();
        
    }
}
       


         
         