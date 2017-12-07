// ## Scanner - 연습 II

package bitcamp.java100.Test21;

import java.io.Console;
//5단계 : 연락처 데이터를 저장할 새로운 데이터 타입을 만든다.
public class Test21_8_4{
    static class Contact{
        String name;
        String email;
        String tell;
        
    }
   
     
    public static void main(String[] args){
        
        
        Console console = System.console();
        
        if (console == null) {
            
            System.err.println("콘솔을 지원하지 않습니다."); // err = 에러메시지를 띄울때 사용한다.
            
            System.exit(1); // JVM을 종료한다.
        }
        
        // Contact 값을 저장할 레퍼런스 배열을 만든다.
        
        Contact[] contacts = new Contact[100];
        
        // 값이 저장될 위치 (Index)
        int cursor = 0;
        
        // 배열의 개수만큼 입력 받는다.
        
        while(cursor < contacts.length) {
            Contact contact = new Contact();
            
            //사용자가 입력한 데이터를 Contact 인스턴스(객)에 저장된다.
            contact.name = console.readLine("이름 : ");
            contact.email = console.readLine("이메일 : ");
            contact.tell = console.readLine("전화 : ");
            
            String response = console.readLine("저장하시겠습니까?(y/n)");
                    if(response.toLowerCase().equals("y") ||
                            response.toLowerCase().equals("yes")) {
                        //이름 이메일 전화 데이터가 들어있는 인스턴스 주소를 배열에 저장
                        contacts[cursor] = contact;
                        cursor++;
            }
            response = console.readLine("계속 입력하시겠습니까?(y/n)");
            if(!(response.toLowerCase().equals("y") ||
                    response.toLowerCase().equals("yes")))
                break;
        }
        
        
        // 배열에 저장된 값을 출력한다.
        
        for (int i = 0; i < cursor; i++) {
            
            System.out.printf("%s,%s,%s\n",
                    contacts[i].name,
                    contacts[i].email,
                    contacts[i].tell);
        }
        
        
    }
}
       


         
         