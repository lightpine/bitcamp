package bitcamp.java100.ch08.ex3;

import java.util.Scanner;

public class Prompts {
    static Scanner keyScan; // 스태틱 변수와 스태틱 블록의 활용!
    
    static {
        keyScan = new Scanner(System.in);
    }
    
    static boolean confirm(String message) {
        System.out.print(message);
        String response = keyScan.nextLine().toLowerCase();
        if (response.equals("y") || response.equals("yse")) 
            return true;
        return false;
    }
    
    static String inputString(String message) {
        System.out.print(message);
        return keyScan.nextLine();
    }
    static int inputInt(String message) {
        System.out.print(message);
        return Integer.parseInt(keyScan.nextLine());
    }

}
