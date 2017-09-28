package bitcamp.java100;



public class Test13_1{
    
    public static void main(String[] args){
        // 배열 사용 전
        // 국어, 영어, 수학, 사회, 과학, 도덕, 중국어 점수를 저장할 변수를 만들라.
        int kor, eng, math, soc, sci, eth, chi;
        
        kor = 100;
        eng = 100;
        math = 100;
        soc = 100;
        sci = 100;
        eth = 100;
        chi = 100;

        System.out.println(kor);
        System.out.println(eng);
        System.out.println(math);
        System.out.println(soc);
        System.out.println(sci);
        System.out.println(eth);
        System.out.println(chi);

        // 배열 사용후
        int[] scorce = new int[7];

        scorce[0] = 100;
        scorce[1] = 100;
        scorce[2] = 100;
        scorce[3] = 100;
        scorce[4] = 100;
        scorce[5] = 100;
        scorce[6] = 100;

        /*
        String[] s = new String[7];
        s[0] = "kor";
        s[1] = "eng";
        s[2] = "math";
        s[3] = "soc";
        s[4] = "sic";
        s[5] = "eth";
        s[6] = "chi";
        */

        for (int i = 0; i < 7; i++){

            //System.out.println("%-5s = %d\n",s[i],scorce[i]);
            System.out.println(scorce[i]);
            
        }
    }        
    

}