// 인터페이스의 구현체를 만드는 개발자 입장

package bitcamp.java100.ch12.ex2;

import java.util.Iterator;

public class Array {
    private Object[] arr = new Object[10000];
    private int cursor = 0;
    
    public void add(Object obj) {
        if (cursor == arr.length) 
            return;
        arr[cursor++] = obj;
    }
    
    public int size() {
        return cursor;
    }
    
    public Object get(int index) {
        if (index < 0 || index >= cursor) 
            return null;
        return arr[index];
    }
    
    public Object remove(int index) {
        if (index < 0 || index >= cursor)
            return null;
        Object removedValue = arr[index];
        
        for (int i = index; i < cursor - 1; i++) {
            arr[i] = arr[i + 1];
        }
        cursor--;
        
        return removedValue;
    }
    public void insert(int index, Object value) {
        if (cursor == arr.length) 
            return;
        
        if (index < 0 || index >= cursor)
            return;
        
        Object insert = value;
        
        for (int i = cursor - 1; i >= index; i--) {
            arr[i+1] = arr[i];
        }
        arr[index] = value;
        
        cursor++;
    }
    
    public Iterator iterator() {
        return new MyIterator();
        
    }
    class MyIterator implements Iterator<Object>{ // 이것 전체가 하나의 인스턴스 멤버로 생각해야 한다.
        int index;
        
        @Override
        public boolean hasNext() {
            if (index < cursor)
                return true;
            return false;
        }
        
        @Override
        public Object next() {
            return arr[index++];
        }
        
    }
    
}
