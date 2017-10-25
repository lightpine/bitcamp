import java.util.Scanner;

public class App {

    static boolean confirm(String message) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print(message);
        while(keyScan.hasNextLine()) break;
        String response = keyScan.nextLine().toLowerCase();
        if (response.equals("y") || response.equals("yse")) 
            return true;
        return false;
    }
    
    public static void main(String[] args) {
        ScoreDao sdo = new ScoreDao();
        
        while(true) {
            Score score = new Score();
            score.input();
            
            if (!confirm("저장하시겠습니까? (y/n)"))
                break;
            
            sdo.add(score);
            
            if (!confirm("계속하시겠습니까? (y/n)"))
                break;
        }
        
        for (int i = 0; i < sdo.size(); i++){
            sdo.get(i).print();
        }
        
    }    
}
