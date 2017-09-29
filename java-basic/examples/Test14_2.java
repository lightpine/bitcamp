// 사용자 정의 데이터 타입 만들기

package bitcamp.java100;

public class Test14_2{
    
    public static void main(String[] args){

        class Booker{

            String bookName;
            String name;
            String press;
            int page;
            double num;
        }

        Booker book = new Booker();
        book.bookName = "자바100기";
        book.name = "엄기준";
        book.press = "비트캠프";
        book.page = 56324;
        book.num = 5.7;

        System.out.printf("책 이름 : %-5s, 저자 : %3s,출판사 : %3s, 페이지 : %3d,가격 : %3.2f\n",book.bookName, book.name, book.press, book.page, book.num);




    }
}