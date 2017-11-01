package bitcamp.java100.ch09.ex7;

import java.util.HashSet;

public class Test4 {
    
    public static void main(String[] args) {
        
        HashSet<String> set = new HashSet<>();
        
        // 강조!
        // hashset은
        // 해시값(hashCode)
        String s1 = "홍길동";
        String s2 = "임꺽정";
        String s3 = "유관순";
        
        set.add(s1);
        set.add(s2);
        set.add(s3);
        
        String s4 = new String("홍길동");
        String s5 = new String("홍길동");
        
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s4 == s5);
        
        
        System.out.println(s1.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s5.hashCode());
        
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));
        System.out.println(s4.equals(s5));
        
        set.add(s4); // s1과 같은 객체로 판단 저장 안함!
        set.add(s5); // s1과 같은 객체로 판단 저장 안함!
        
        System.out.println(set.size());
        
        String[] arr = new String[set.size()];
        set.toArray(arr);
        
        for (String s : arr) {
            System.out.printf("%s ", s);
        }
        System.out.println();
    }
}
