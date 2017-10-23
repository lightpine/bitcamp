package bitcamp.java100;

public class Man {

        
        String name;
        String tell;
        String email;
        
        static void print(String name,String tell,String email) {
            System.out.printf("%s     %s  %s\n",
                 this.name, this.tell, this.email);
            
        }
        static String init(Man man, String name, String tell, String email) {
                String mem;
                
                man.name = name;
                man.tell = tell;
                man.email = email;
                
                return mem;
        }


}
