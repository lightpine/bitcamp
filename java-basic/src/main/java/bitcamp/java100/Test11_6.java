package bitcamp.java100;

public class Test11_6{
    
    public static void main(String[] args)
    {
        // 정수의 값은 기본으로 4bity 
        // -2**31 ~ +2**31 = -21_4748_3648 ~21_4748_3647
        System.out.println(-21_4748_3648);
        System.out.println(21_4748_3647);


        //System.out.println(-21_4748_3649);
        //System.out.println(21_4748_3648);

        System.out.println(-21_4748_3649L); // 8bity 정수값
        System.out.println(21_4748_3648l);

        System.out.println(10);     // 4bity
        System.out.println(10L);    // 8bity

        System.out.println(-922_3372_0368_5477_5808L);  // 4bity
        System.out.println(922_3372_0368_5477_5807L);   // 8bity

    }        
    

}