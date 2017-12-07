package bitcamp.java100.ch19.ex1;

@MyAnnotation
//@MyAnnotation // 중복 불가!
public class MyClass {
    
    @MyAnnotation
    public int a;
    
    @MyAnnotation
    public void m() {
        
//        @MyAnnotation // 일반 문장에는 붙을 수 없다. 오류!!
        System.out.println("Hello!!!");
        
    }
    
    // 파라미터 선언부에도 붙일 수 있다!.
    public void m2(@MyAnnotation int a, @MyAnnotation String b) {
        
        // 로컬 선언부에도 붙일 수 있다!
        // 즉 선언부에는 모두 붙일 수 있다!
        @MyAnnotation
        int x = 10;
    }
}
