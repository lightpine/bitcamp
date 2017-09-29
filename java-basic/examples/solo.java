package bitcamp.java100;

public class solo{

    
    public static void main(String[] args){
        
        class Member{
            String name;
            String tel;
            String addre;
            String postAdders;
            String gender;
            int    age;
            float  height;
            float  weight;
    
        }

        Member[] mem = new Member[3];
       

        mem[0] = new Member(); 
        mem[1] = new Member();  
        mem[2] = new Member(); 
        //mem[3] = new Member();
        //mem[4] = new Member();


        mem[0].name = "홍길동";
        mem[0].tel = "010-1234-5678";
        mem[0].age = 30;
        mem[0].height = 176.6f;
        mem[0].weight = 72.5f;

        mem[1].name = "임꺽정";
        mem[1].tel = "010-1234-1234";
        mem[1].age = 45;
        mem[1].height = 196.6f;
        mem[1].weight = 90.8f;

        mem[2].name = "유관순";
        mem[2].tel = "010-9876-5432";
        mem[2].age = 18;
        mem[2].height = 154.8f;
        mem[2].weight = 43.2f;



        for (int i = 0; i < mem.length ; i++){

            System.out.printf("성명 : %4s\n전화번호 : %13s\n나이 : %3d\n키 : %4.2f\n몸무게 : %4.2f\n\n", mem[i].name, mem[i].tel, mem[i].age, mem[i].height, mem[i].weight);
        }


    }
}