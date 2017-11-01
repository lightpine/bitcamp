// 역활 : Box를 이용하여 여러개의 값을 보관하고 꺼내는 일
// 값을 저장할 때 상자를 박스에 보관한다.
// 체인처럼 box와 box사이에 주소를 이용하여 연결을 관리한다.
//
package bitcamp.java100.ch09.ex2;


public class LinkedList {
    Box head;
    Box tail;
    
    int len;
    
    public void add(Object value) {
        Box box = new Box(); // 200
        
        box.value = value;
        
        if (tail == null) {
            head = box;
            tail = box;
            
        }else {
            tail.next = box;
            tail = box;
        }
        len++;
    }
        
        public int size() {
            return len;
            
        }
        public Object get(int index) {
            if (index < 0 || index >= len)
                return null;
            
            Box box = head;
            for (int count = 1; count <= index; count++) {
                box = box.next;
            }
            
            return box.value;
        }
        public void insert(int index, Object value) {
            if (index < 0 || index >= len)
                return;
            
            len++;
            
            Box insertBox = new Box();
            insertBox.value = value;
            
            if (index == 0) {
                insertBox.next = head;
                head = insertBox;
                return;
            }
            
            Box movingBox = head;
            
            for (int i = 0; i < index-1; i++) {
                 movingBox = movingBox.next;
            }
            
            insertBox.next = movingBox.next;
            movingBox.next = insertBox;
            
            
            
            
            
        }
        
        public Object remove(int index) {
            
            if (index < 0 || index >= len)
                return null;
            len--;
            Box removedBox;
            if (index == 0) {
                removedBox = head;
                head = head.next;
                return removedBox.value;
            }
            Box movingBox = head;
            
            for (int i = 0; i < index-1; i++) {
                 movingBox = movingBox.next;
            }
            removedBox = movingBox.next; 
            movingBox.next = movingBox.next.next;
            
            if (index == len - 1) {
                tail = movingBox;
            }
            
            
            return removedBox.value;
            
            
            
        }
        
}
