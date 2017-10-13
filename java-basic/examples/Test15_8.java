// 논리 연산자

package bitcamp.java100;

public class Test15_8{
    
    public static void main(String[] args){

        System.out.printf("true && true ? %b\n", true && true);
        System.out.printf("true && false ? %b\n", true && false);
        System.out.printf("false && true ? %b\n", false && true);
        System.out.printf("false && false ? %b\n", false && false);

        System.out.printf("true || true ? %b\n", true || true);
        System.out.printf("true || false ? %b\n", true || false);
        System.out.printf("false || true ? %b\n", false || true);
        System.out.printf("false || false ? %b\n", false || false);

        System.out.printf("true & true ? %b\n", true & true);
        System.out.printf("true & false ? %b\n", true & false);
        System.out.printf("false & true ? %b\n", false & true);
        System.out.printf("false & false ? %b\n", false & false);

        System.out.printf("true | true ? %b\n", true | true);
        System.out.printf("true | false ? %b\n", true | false);
        System.out.printf("false | true ? %b\n", false | true);
        System.out.printf("false | false ? %b\n", false | false);

        boolean b1 = false;
        boolean result = (false && (b1 = true));
        System.out.printf("b1 = %b , result = %b\n", b1, result);

        // & 1개는 혼자쓰이니 뒤에 작업까지 꾸역꾸역 연산한다.
        b1 = false;
        result = false & (b1 = true);
        System.out.printf("b1 = %b , result = %b\n", b1, result);
        
        b1 = false;
        result = true || (b1 = true);
        System.out.printf("b1 = %b , result = %b\n", b1, result);
        
        b1 = false;
        result = true | (b1 = true);
        System.out.printf("b1 = %b , result = %b\n", b1, result);

    }
}