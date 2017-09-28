package bitcamp.java100;

public class Test12_9{
    
    public static void main(String[] args){
        
        char c1;    //short와 다른점은 0~65535까지 저장한다는 것이다.

        c1 = 44032; // 유니코드값 10진수 표현
        char c2;
        
        c2 = 0xAC00;    // 16진수로 표현해도 된다.
        
        System.out.println(c1);
        System.out.println(c2);

        char n1 = 0xCD5C, n2 =0xBA85, n3 = 0xC1A1;
        System.out.printf("%c %c %c\n", n1, n2, n3);

        // 자바에서 유니코드값 찾는것을 도와주는 연산자.
        n1 = '催';   //해당 글자의 유니코드 값을 리턴한다.
        n2 = '明';
        n3 = '送';
        System.out.printf("%c %c %c\n", n1, n2, n3);

        char x = '7', y = '9';

        int num,num2;
        num = x - '0';
        num2 = y - '0';

        System.out.println(num);
        System.out.println(num2);
    }        
    

}