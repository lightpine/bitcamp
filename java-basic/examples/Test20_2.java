// ## 래퍼(wrapper) - 래퍼 객체의 활용


package bitcamp.java100;

import java.io.File;

public class Test20_2{
    //String 객체(String 클래스의 설계도에 따라 만든 메모리 즉 인스턴스의 주소)를 파라미터로 받는다.
    static void print1(String value) {
        System.out.println(value);
    }
    //int (타입의 메모리) 값을 파라미터로 받는다.
    static void print2(int value) {
        System.out.println(value);
    }
    //float (타입의 메모리) 값을 파라미터로 받는다.
    static void print3(float value) {
        System.out.println(value);
    }
    static void print4(Object value) {
        // Object의 레퍼런스는 자바의 모든 (클래스의/타입의) 객체(의 주소)를 저장할 수 있다. 
        System.out.println(value);
    }
    public static void main(String[] args){
        //래퍼 클래스 사용 전
        print1("문자열");
        print2(300);
        print3(3.14f);
        
        String v1 = "홍길동";
        StringBuffer v2 = new StringBuffer("임꺽정");
        File v3 = new File(".");
        
        print4(v1); // Ok
        print4(v2); // Ok
        print4(v3); // Ok
        
        print1(v1); // OK
        //print1(v2); // 컴파일 오류!
        //print1(v3); // 컴파일 오류!
        
        // 원래는 Object value 레퍼런스의 변수에 객체 주소를 넘겨야 하지만,
        // 컴파일러가 자동으로 오토 박싱을 수행하는 덕분에
        // 개발자가 primitive 타입의 값을 객체로 적접 전환할 필요가 없다.
        
        print4(new Integer(100));
        print4(new Float(3.14f));
        print4(new Boolean(true)); 
        
        // 오토박싱 수행
        
        print4(100);  //new Integer(100)
        print4(3.14f);//new Float(3.14f)
        print4(true); //new Boolean(true)
        
        
     }
}
