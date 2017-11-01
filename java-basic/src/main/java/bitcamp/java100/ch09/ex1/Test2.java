// 컬렉션(collection) API - 배열 사용하기 II
// 다른 프로젝트에서도 사용 할 수 있도록 별도의 클래스로 분류해 보자!
package bitcamp.java100.ch09.ex1;

public class Test2 {
    

    public static void main(String[] args) {
        
        Array list = new Array();
        // 값을 저장한다.
        // 값을 저장한 후 cursor를 이동하여 다음 위치를 가르키게 한다.
        list.add(new String("홍길동"));
        list.add(new Integer(100));
        list.add(80); // new Integer(80); => 오토박싱
        list.add(70);
        list.add(250);
        list.add(250 / 3f);
        list.add("임꺽정");
        list.add(80);
        list.add(80); // new Integer(80); => 오토박싱
        list.add(80);
        list.add(240);
        list.add(240 / 3f);
        
        
        
        
        // 값을 출력한다.
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d : %s\n",i, list.get(i));
        }
        System.out.println("---------------------------");
        list.insert(6, "유관순");
        
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d : %s\n",i, list.get(i));
        }
        System.out.println("---------------------------");
        
        System.out.println(list.remove(11));
        System.out.println(list.remove(10));
        
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d : %s\n",i, list.get(i));
        }
        
        System.out.println("---------------------------");
        
    }

}
