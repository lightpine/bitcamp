// 역활 : Box를 이용하여 여러개의 값을 보관하고 꺼내는 일
// 값을 저장할 때 상자를 박스에 보관한다.
// 체인처럼 box와 box사이에 주소를 이용하여 연결을 관리한다.
//
package bitcamp.java100.ch09.ex5;


public class Queue {
    
    private class Box {
        Object value;
        Box next;
        
        public Box() {}
        
        public Box(Object value) {
            this.value = value;
        }
    }
    
    Box head;
    Box tail;
    int len;
    
    public void add(Object value) {
        
        Box box = new Box(value);
        
        if (tail != null)
            tail.next = box;
        tail = box;
        
        
        len++;
        
        if (head == null) 
            head = box;
    }
    
    public Object poll() {
        
        if (len == 0) {
            return null;
        }
        
        Box box = head;
        
        head = head.next;
        
        len--;
        
        return box.value;
    }
}
