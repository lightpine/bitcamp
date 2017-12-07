package java100.app.util;
import java.util.Scanner;

public class Prompts {
    static Scanner scan = new Scanner(System.in);
    
    public static int inputInt(String message, Object... values ) {
        System.out.printf(message, values);
        return Integer.parseInt(scan.nextLine());
    }
    
    public static String inputString(String message, Object... values) {
        System.out.printf(message, values);
        return scan.nextLine();
    }
    
    @Deprecated
    public static String input(String message) {
        System.out.print(message);
        return scan.nextLine();
    }
    
    public static boolean confirm2(String message) {

        System.out.print(message);
        String response = scan.nextLine().toLowerCase();

        if (response.equals("n") || response.equals("no") || response.equals(" "))
            return false;
        return true;
    }

    public static boolean confirm(String message) {

        System.out.print(message);
        String response = scan.nextLine().toLowerCase();

        if (response.equals("y") || response.equals("yes") || response.equals(" "))
            return true;
        return false;
    }
}
