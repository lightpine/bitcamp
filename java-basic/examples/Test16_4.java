//반복문 while 

package bitcamp.java100;

public class Test16_4{
    
    public static void main(String[] args){
        
        int i = 0;
        while (i < 5) 
            System.out.println(i++);
        
        System.out.println("-----------------------------------------------");
        
        i = 0;
        while (i < 5) {
            System.out.print("=> ");
            System.out.println(i);
            i++;
        }
        
        System.out.println("-----------------------------------------------");
        
        i = 1;
        while (i <= 5) {
            int count = 1;
            while (count <= i) {
                System.out.print("*");
                count++;
            }
            System.out.println();
            i++;
        }
        
        System.out.println("-----------------------------------------------");
        
        i = 1;
        while (i <= 5) { // 5번 반복
            int count = 5 - i;
            while (count > 0) {
                System.out.print(" ");
                count--;
            }
            count = 1;
            while (count <= i) {
                System.out.print("*");
                count++;
            }
            
            System.out.println();
            i++;
        }
        
        System.out.println("-----------------------------------------------");
        
        i = 1;
        while (i <= 5) { 
            int count = (5 - i) / 2;
            while (count > 0) {
                System.out.print(" ");
                count--;
            }
            count = 1;
            while (count <= i) {
                System.out.print("*");
                count++;
            }
            
            System.out.println();
            i += 2;
        }
        
        System.out.println("-----------------------------------------------");
        
        i = 5;
        while (i >= 0) { 
            int count = (5 - i) / 2;
            while (count > 0) {
                System.out.print(" ");
                count--;
            }
            count = 1;
            while (count <= i) {
                System.out.print("*");
                count++;
            }
            
            System.out.println();
            i -= 2;
        }
        
        System.out.println("-----------------------------------------------");
        
        i = 0;
        while (i < 5) { 
            if (i == 3) {
                break;

            } 
            System.out.println(i);
            i++;
            
        }
        
        System.out.println("-----------------------------------------------");
        
        i = 0;
        while (i < 5) { 
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
        
        System.out.println("-----------------------------------------------");
        
        i = 1;
        label1 :{
        while (i <= 10) { 
            int count = 1;
            while (count <= i) {
                System.out.print("*");
                if(count == 5) {
                    break label1;
                }
                count++;
            }
            System.out.println();
            i++;
        }
      }
        System.out.println();
        System.out.println("-----------------------------------------------");
        
        
        i = 1;
        label1 :
        while (i <= 10) { 
            int count = 1;
            while (count <= i) {
                System.out.print("*");
                if(count == 5) {
                    break label1;
                }
                count++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
        System.out.println("-----------------------------------------------");
        
        int g1 = 2, g2 = 1;
        
        while (g1 <= 9) {
            while (g2 <= 9) {
                
                System.out.printf("%d %c %d %c %d\n",g1,'*',g2,'=',g1*g2);
                g2++;
            }
            g1++;
        }
        
        System.out.println("-----------------------------------------------");
        
        i = 5234884;
        while(i > 0) {
            
            System.out.printf("%d ",i % 10);
            i /= 10;
            
            
        }
        System.out.println();
        System.out.println("-----------------------------------------------");
        
        i = 4885323;
        int[] arr = new int[10];
        // 자바에서는 new로 만든 메모리는 0으로 무조건 초기화 된다.
        
        while(i > 0) {
            arr[i % 10]++;
            
            i /= 10;
        }
        
        int x = 0;
        while (x < arr.length) {
            
           System.out.printf("%d = %d\n", x, arr[x]);
           x++;
        }
        
        System.out.println("-----------------------------------------------");
        
        i = 1;
        while (i <= 5) {
            int count = 5;
            while (count >= i) {
                System.out.print("*");
                count--;
            }
            System.out.println();
            i++;
        }
        
        
        
    }
}
