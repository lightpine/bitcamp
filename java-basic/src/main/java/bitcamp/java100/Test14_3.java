// 사용자 정의 데이터 타입 만들기

package bitcamp.java100;

public class Test14_3{
    
    public static void main(String[] args){

        class Student{

            String name;
            String addr;
            String license;
            String phonNum;
            String eMAil;
            int age;
            boolean gen;
            String registDay;
        }


        Student s1 = new Student();

        s1.name = "홍길동";
        s1.addr = "서울 특별시 강남";
        s1.license = "정보처리기사";
        s1.phonNum = "010-123-1234";
        s1.eMAil = "bitcamp@naver.com";
        s1.age = 25;
        s1.gen = false;
        s1.registDay = "2017_09_28";
        
        String gen;
        
        if (s1.gen == true){
            gen = "남자";
        }
        else
            gen = "여자";
        
        System.out.printf("이름 :%-5s\n주소 : %8s\n자격증 : %8s\n전화번호 : %8s\ne-mail : %8s\n나이 : %3d\n성별 : %s\n등록일 : %s\n",s1.name, s1.addr, s1.license,s1.phonNum,s1.eMAil,s1.age,gen,s1.registDay);



    }
}