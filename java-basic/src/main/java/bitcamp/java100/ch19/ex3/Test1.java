// 애노테이션의 프로퍼티 값 조회하기
package bitcamp.java100.ch19.ex3;


public class Test1 {

    public static void main(String[] args) {
        
        MyAnnotation1 anno = MyClass2.class.getAnnotation(MyAnnotation1.class);
        
        System.out.println(anno.name());
        System.out.println(anno.age());
        
    }

}
