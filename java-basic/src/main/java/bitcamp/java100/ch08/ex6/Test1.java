// hashCode 오버라이딩 전
// hashCode의 리턴 값은 hashSet이나 hashMap에서 객체를 저장할 때
// eqauls외에 이 메서드의 리턴값을 비교하여 같은 객체인지 검사한다.
// eqauls의 리턴 값이 같더라고 hashCode의 리턴값이 다르면 다른객체로 취급한다.

package bitcamp.java100.ch08.ex6;

import java.util.ArrayList;
import java.util.HashSet;

public class Test1 {
    
    public static void main(String[] args) {
        Score s1 = new Score(1, "홍길동", 100, 100, 100);
        Score s2 = new Score(1, "홍길동", 100, 100, 100);
        
        ArrayList list = new ArrayList();
        // ArrayList는 객체의 주소들을 보관한다.
        // 같은 객체를 중복해서 보관한다.
        
        list.add(s1);
        list.add(s1);
        
        System.out.println(list.size());
        System.out.println(list.get(0).toString());
        System.out.println(list.get(1).toString());
        
        System.out.println("----------------------------------------");
        
        
        
        
        
        HashSet set = new HashSet();
        // hashset은 Arraylist처럼 객체의 주소를 보관하는 
        // 용도로 사용하는 클래스이다.
        // 단 다른점은 같은 객체를 중복해 저장하지 않는다.
        
        // 같은 객체로 보는 기준은 무엇인가?
        // 인스턴스 주고가 같을 경우.
        // equals로 비교했을때 리턴값이 true이고
        // hash값이 같을 경우.
        set.add(s1);
        set.add(s1);
        
        System.out.println(set.size());
        // hashset에 저장된 개수를 출력해 보면 1이 나온다.
        // 왜? s1객체가 중복 저장되지 않기 때문이다.
        // 그러면 인스턴스는 다르지만 같은 값을 갖는 객체인경우?
        
        System.out.println("----------------------------------------");
        set.add(s2);
        
        System.out.println(set.size());
        // 같은 값을 가지고 있다고 해서 같은 객체가 아니다.
        // hashset 이 같은 객체라고 판단하는 기준은
        // 위와같이 정말 같은 인스턴스 이거나 즉 주소가 같거나
        // eqauls의 리턴값이 true이고 hashcode의 리턴값이 같을경우에
        // 같은 객체로 판단한다.
        
        // Score클래스는 eqauls를 오버라이딩하여
        // name과 kor,eng,math의 값이 같을 경우 true를 리턴하게 했다.
        // 하지만 
        
        System.out.println("----------------------------------------");
        System.out.printf("s1.equals(s2) = %b\n", s1.equals(s2));
        System.out.printf("s1.HashCode = %d\n", s1.hashCode());
        System.out.printf("s1.HashCode = %d\n", s2.hashCode());
           }

}
