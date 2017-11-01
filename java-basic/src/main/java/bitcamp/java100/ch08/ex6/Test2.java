// hashCode 오버라이딩 후
// hashCode의 리턴 값은 hashSet이나 hashMap에서 객체를 저장할 때
// eqauls외에 이 메서드의 리턴값을 비교하여 같은 객체인지 검사한다.
// eqauls의 리턴 값이 같더라고 hashCode의 리턴값이 다르면 다른객체로 취급한다.

package bitcamp.java100.ch08.ex6;

import java.util.ArrayList;
import java.util.HashSet;

public class Test2 {
    
    public static void main(String[] args) {
        Score s1 = new Score(1, "홍길동", 100, 100, 100);
        Score s2 = new Score(1, "홍길동", 100, 100, 100);
        
        HashSet set = new HashSet();
        set.add(s1);
        set.add(s2); // s1과 s2는 다른 객체로 보기 때문에 s2도 저장된다.
        // 판단 기준이 뭐라고?
        // equals의 리턴값이 true이고 hashCode의 리턴값이 같을경우
        // 비록 인스턴스가 다르더라도 같은 객체로 본다.
        
        System.out.println(set.size());
        System.out.println("----------------------------------------");
        
        Score2 s3 = new Score2(1, "홍길동", 100, 100, 100);
        Score2 s4 = new Score2(1, "홍길동", 100, 100, 100);
        
        HashSet set2 = new HashSet();
        set2.add(s3);
        set2.add(s4); // s3와 s4가 비록 인스턴스가 다르지만 같은 객체로 취급하기 떄문에
        // s4는 저장되지 않는다.
        // 판단기준이 뭐라고?
        // Score2클래스는 equals의 리턴값이 같은 뿐만아니라
        // hashcode도 같은 내용을 가진 객체에 대해 같은 해시값을 리턴하도록
        // 재정의 하였기 때문에 s3와 s4가 같은 객체라고 같주한다.
        // 
        
        System.out.println(set2.size());
        System.out.printf("s3.equals(s4) = %b\n", s3.equals(s4));
        System.out.printf("s3.HashCode = %d\n", s3.hashCode());
        System.out.printf("s4.HashCode = %d\n", s4.hashCode());
        System.out.println("----------------------------------------");
        
        // 결론 
        // 인스턴스가 다르더라도 내용이 같은 경우 같은 객체로 다루고 싶다면
        // 큭히 HashSet이나 HashMap 등에서 다룰 때는,
        // equals와 HashCode를 모두 오버라이딩 하라.
        // 이런 이유로
        // 이클립스에서는 자동 오버라이딩 메뉴에서
        // equals와 hashcode 두개를 모두 오버라이딩 하는 메뉴를 재공한다.
           }

}
