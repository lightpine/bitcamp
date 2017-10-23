package bitcamp.java100.Test21.ex8;

public class ContactArray {
    // Contact 값을 저장할 레퍼런스 배열을 만든다.
    static Contact[] contacts = new Contact[2];
    // 값이 저장될 위치 (Index)
    static int cursor = 0;
    
    static void add(Contact contact) {
        if(cursor >= contacts.length)
            throw new RuntimeException("Max Index over");
        
        contacts[cursor] = contact;
        cursor++;
    }
    static Contact get(int index) {
        if (index < 0 || index >= cursor)
            throw new RuntimeException("유효하지 않은 인덱스");
        
        return contacts[index];
    }
    static int size() {
        return cursor;
    }

}
