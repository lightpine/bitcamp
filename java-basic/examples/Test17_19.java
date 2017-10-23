// ## 인스턴스 메서드

package bitcamp.java100;

public class Test17_19{
    
    static class my{
        int value;
        
        void print() {
            System.out.println(this.value);
        }
    }
    public static void main(String[] args){
        my r1 = new my();
        my r2 = new my();
        my r3 = new my();
        
        r1.value = 100;
        r2.value = 200;
        r3.value = 300;
        
        // my.print(); //컴파일 오류!
        
        r1.print();
        r2.print();
        r3.print();
        
        // 주의사항1 인스턴스 주소 없이 메서드 호출하면 안된다.
        // 실행할때 뜨는 오류 runtimeException!!!!!!!!!!!
        my m4 = null;
        m4.print();
        
        // 2
        // 인스턴스 메서드가 소속된 클래스와 다른타입의 인스턴스 메서드를 호출할  안된다.
        String s1 = "hello";
        //s1.print(); // 컴파일 오류!
        //객체지향 분석, 설계(OOA/D)에서는 메서드를 "operator"라고 부른다.
        
     }
}
