// ## 클래스 메서드

package bitcamp.java100;

public class Test17_18{
    
    static class my{
        int value;
        
        static void print(my ref) {
            System.out.println(ref.value);
            //System.out.println(this.value); // 컴파일 오류!
            //클래스 메서드는 this라는 내장 변수가 없다.
            
        }
    }
    public static void main(String[] args){
        my r1 = new my();
        my r2 = new my();
        my r3 = new my();
        
        r1.value = 100;
        r2.value = 200;
        r3.value = 300;
        
        my.print(r1);
        my.print(r2);
        my.print(r3);
        
        r1.print(r1);
        //클래스 메서드는 this라는 내장 변수가 없기 떄문에
        //메서드 앞에 지정한 인스턴스 주소는 그냥 버려진다.
        //즉 아무런 영향을 끼치지 않는다.
        //결론 클래스 메서드는 클래스 이름으로 호출하라!
        //레퍼런스로 호출할 수 있더라도 클래스 이름으로 호출하여
        //해당 메서드가 클래스 메서드임을 명확히 하는게 소스코드 해석하기 쉽다.
        //이클립스에도 클래스 메서드를 레퍼런스 변수로 호출하면 경고메시지를 띄운다.
     }
}
