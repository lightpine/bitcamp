// finally보다 자원을 해제시키는 더 쉬운 방법
package bitcamp.java100.ch13.ex3;

public class Test3 {

    public static void main(String[] args) {
        class MyClass{}
        
        class MyClass2 implements AutoCloseable{
            @Override
            public void close() throws Exception {
                System.out.println("close() 호출되었음!");
            }
        }
        // try-with-resources
        
        try (
                
                //MyClass obj = new MyClass();
                MyClass2 obj2 = new MyClass2();
        ){
            System.out.println("try블록 실행");
            int r = 20 / 0;
                
        } catch(Exception e){
            System.out.println("catch블록 실행");
        } 
    }
}
