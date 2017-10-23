// ## import - 클래스가 어떤 패키지에 있는지 컴파일러에게 알리는 방법

package bitcamp.java100;

import java.util.*;


// java.lang패키지에 들어있는 클래스들은 기본으로 해당 패키지를 찾는다. import를 따로 선언하지 않아도 된다.
// 그 하위 패키지는 해당되지 않는다.
// ex) java.lang.reflect, java.lang.annotation, java.lang.inovoke
//import java.lang.String;

public class Test19_2{
    
    public static void main(String[] args){

        ArrayList<String> list = new ArrayList<>(); // OK!
        
        list.add("홍길동");
        
        
        
     }
}
