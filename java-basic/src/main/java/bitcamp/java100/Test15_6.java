// 연산자 우선순위

package bitcamp.java100;

public class Test15_6{
    
    public static void main(String[] args){

        int r = 2 + 3 * 4;
        System.out.println(r);

        int r1 = 2 + 3 * 4 - 6 / 3 + 7;
        System.out.println(r1);

        r = (2 + 3) * 4;
        System.out.println(r);
    }
}