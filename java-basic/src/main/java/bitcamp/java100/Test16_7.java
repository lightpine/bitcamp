//반복문 for

package bitcamp.java100;

public class Test16_7{
    
    public static void main(String[] args){
        
        // 처음부터 끝까지 반복할 때는 이 방법이 좋다!!!
        
        String[] names = {"홍길동","임꺽정","안중근","유관순","윤봉길"};
        
       for (String n : names ) {
           System.out.println(n);
       }
       
       System.out.println("------------------------------------------------------------------------------");
       
       int[] kor = {100, 90, 80, 70, 60,50};
       
       for (int score : kor) {
           System.out.println(score);
       }
       
       System.out.println("------------------------------------------------------------------------------");
       /* 컴파일 오류!
       int s = 0;
       for (s : kor) {
           System.out.println(score);
       }
       */
       java.util.ArrayList<String> list = new java.util.ArrayList<>();
       list.add("홍길동");
       list.add("임꺽정");
       list.add("유관순");
       list.add("안중근");
       list.add("윤봉길");
       list.add("홍길동");
       list.add("임꺽정");
      
       for (String n : list) {
           System.out.println(n);
       }
       
       System.out.println("------------------------------------------------------------------------------");
       
       //set은 집합의 성질을 가지며 중복값을 가지지 않는다.
       //들어간 순서대로 뽑을 수 없다.
       //출력은 헤시코드 순서대로 나온다.
       //
       java.util.HashSet<String> set = new java.util.HashSet<>();
       set.add("홍길동");
       set.add("임꺽정");
       set.add("유관순");
       set.add("안중근");
       set.add("윤봉길");
       set.add("홍길동");
       set.add("임꺽정");
      
       
       for (String n : set) {
           System.out.println(n);
       }
       
    }
}
