package bitcamp.java100.ch10.ex1.other;

public class Test2 {
    // static  nested class.
    static class A{}
    // non-static nested class - inner class
    class B{}
    
    // 익명 클래스
    Object obj = new Object() {
        String name;
        public void m1() {}
    };
    
    
    public static void main(String[] args) {
        // 특정 메서드에서만 사용하도록 매소드 생성
        class C{}
                
        // 익명 클래스
        // 메서드 안에서도 정의할 수 있다.
        Object obj2 = new Object() {
            String name;
            public void m1() {}
        };
    }

}
