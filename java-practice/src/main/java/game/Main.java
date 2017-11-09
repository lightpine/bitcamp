package game;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Character> list = new ArrayList<>();
    static Job job;
    public static void main(String[] args) {
       
        System.out.println("java Rpg!");
        System.out.println("케릭터 생성!");
        System.out.println("아이디를 입력하세요!");
        Character character = new Character();
        character.id = scan.nextLine();
        System.out.printf("%s 님 환영합니다!", character.id);
        System.out.println("직업을 선택해 주세요~");
        System.out.println("1. 전사, 2. 마법사, 3. 도적, 4. 궁수, 5.성직자");
        
        System.out.println(list.get(0));
    }

}
