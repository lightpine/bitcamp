package bitcamp.java100.ch09.ex7;

import java.util.HashSet;

public class Test5 {
    
    static class Contact{
        String name;
        String email;
        String tel;
        
        Contact(String name, String email, String tel){
            
            this.name = name;
            this.email = email;
            this.tel = tel;
        }
        
    }
    public static void main(String[] args) {
        
        HashSet<Contact> set = new HashSet<>();
        
        Contact c1 =new Contact("홍길동", "hong@test.com", "1111-1111");
        Contact c2 =new Contact("홍길동", "hong@test.com", "1111-1111");
        Contact c3 =new Contact("홍길동", "hong@test.com", "1111-1111");
        
        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
        System.out.println(c2 == c3);
        
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c2.equals(c2));

        
        
        set.add(c1);
        set.add(c2);
        set.add(c3);
        set.add(c3);
        
        
        System.out.println(set.size());
        
        Contact[] arr = new Contact[set.size()];
        set.toArray(arr);
        
        for (Contact c : arr) {
            System.out.printf("%s, %s, %s\n", c.name, c.email, c.tel);
        }
        
        // HashSet이 중복 데이터임을 판단하는 기준
        // HashSet은 중복 집합의 기능을 구현한 것이기 때문에 중복 데이터를 저장하지 않는다.
        // 중복 데이터의 기준은?
        // hashCode의 리턴값이 같다!
        // equals로 비교 했을때 리턴값이 true이다.
        // 그러나 Object로부터 그냥 상속받은 hashCode는 
        // 인스턴스가 다르면 무조건 다른 해시 값을 리턴한다.
        // 또한 Object로부터 그냥 상속밭은 equals는 
        // 인스턴스가 다르면 무조건 false를 리턴한다.
        // 그래서 
        // HashSet에 보관할 객체는 반드시 Object의 이들 메서드를 반드시 재정의 해야 한다.
        
        
    }
}
