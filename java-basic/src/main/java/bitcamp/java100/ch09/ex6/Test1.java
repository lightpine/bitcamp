// 컬렉션 API - ArrayList
// 자바에서 제공하는 컬렉션 클래
package bitcamp.java100.ch09.ex6;

public class Test1 {
    public static void main(String[] args) {
         Stack contacts = new Stack();
         contacts.push(new Contact("홍길동", "hong@test.com", "1111-1111"));
         contacts.push(new Contact("임꺽정", "leem@test.com", "1111-1112"));
         contacts.push(new Contact("유관순", "you@test.com", "1111-1113"));
         
         //contacts.push(new String("안중근"));
         //contacts.push(new Boolean(true));
         
         //Contact c = contacts.pop(); // 컴파일 오류!
         Contact c = (Contact)contacts.pop();
         
         BookStack bookStack = new BookStack();
         bookStack.push(new Book());
         bookStack.push(new Book());
         
         // bookStack.push(new String()); // 컴파일 오류!
         // bookStack.push(new Integer()); // 컴파일 오류!

         Book b1 = bookStack.pop();
         Book b2 = bookStack.pop();
         
         ScoreStack scoreStack = new ScoreStack();
         
         scoreStack.push(new Score());
         scoreStack.push(new Score());
         
         //scoreStack.push(new String());
         //scoreStack.push(new Integer());
         
         Score s1 = scoreStack.pop();
         Score s2 = scoreStack.pop();
         
         ContactStack contactStack = new ContactStack();
         
         contactStack.push(new Contact());
         contactStack.push(new Contact());
         
         //contactStack.push(new String());
         //contactStack.push(new Integer());
         
         Contact c1 = contactStack.pop();
         Contact c2 = contactStack.pop();
         
         
         
         
         
         
    }

}
