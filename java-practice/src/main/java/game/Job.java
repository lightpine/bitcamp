package game;
import java.util.Scanner;

public class Job extends Character{
    
    
    
    
    public int selectJob() {
        Scanner scan = new Scanner(System.in);
        int select = scan.nextInt();
        switch (select) {
        case 1 : 
            System.out.println("검사를 선택하셨습니다.");
            this.str += 5; // 10
            this.in -= 2;  // 3
            this.rux += 2; // 7
            // 초기스텟 총합 25 max
            this.job = select;
            break;
        case 2: 
            System.out.println("마법사를 선택하셨습니다.");
            this.str -= 2; // 3
            this.in += 5;  // 10
            this.dex += 1; // 6
            this.rux += 1; // 6
            this.job = select;
            break;
        case 3: 
            System.out.println("도적을 선택하셨습니다.");
            this.str += 2; // 7
            this.in -= 2;  // 3
            this.dex += 2; // 7
            this.rux += 4; // 9
            break;
        case 4: 
            System.out.println("궁수 선택하셨습니다.");
            this.str += 1; // 6
            this.in -= 1;  // 4
            this.dex += 5; // 10
            break;
        case 5: 
            System.out.println("성직자를 선택하셨습니다.");
            this.str -= 1; // 4
            this.in += 4;  // 9
            this.dex += 4; // 9
            this.rux -= 2; // 3
            break;
        }
            
        return select;
    }
    
    
    
    

}
