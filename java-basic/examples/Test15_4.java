// 암시적 형변환으로 해결이 안되는 경우 계산방법은?

package bitcamp.java100;

public class Test15_4{
    
    public static void main(String[] args){

        float f1 = 3.141592f, f2 = 5432.123f ;
        int i1 = 7654321;
        System.out.printf("f1 = %f i1 = %d\n", f1, i1);
        
        double r1 = f1 + i1; // 7654324.141592
        System.out.println(r1);

        r1 = (double) f1 + (double) i1; // 명시정 형변환
        System.out.println(r1);

        r1 = (double) f1 + i1; // 명시적 + 암시적 형변환의 조합
        System.out.println(r1);
        
        r1 = f1 + (double) i1; // 뒤집어도 가능하다.
        System.out.println(r1);
    }
}