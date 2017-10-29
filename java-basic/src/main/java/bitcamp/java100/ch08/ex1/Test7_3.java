// 캡슐화의 존재 이유 - 필드와 프로퍼티, 그리고 셋터/겟터

package bitcamp.java100.ch08.ex1;

// Gym회원을 추상화 해보자
class Member3{
    
    // 클래스에 선언된 스태틱 변수 또는 인스턴스 변수를 필드라고 부른다.
    // 
    private String name;
    private int age;
    private float weight;
    private float height;

    // 셋터
    // 필드의 값을 설정하는 setxxx() 메서드이다.
    
    public void setName(String name) {
        this.name = name;
    }
    
    // 겟터
    // 필드의 값을 꺼내는 getxxx() 메서드이다.
    public String getName() {
        return this.name;
    }
    // 셋터 겟터를 다른말로 프로퍼티 라고 부른다.
    // 셋터 겟터가 모두 있는 경우 read/write 프로퍼티이다.
    // 셋터만 있는 경우 write only 프로퍼티 이다.
    // 겟터만 있는 경우 read only 프로퍼티이다.

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    
    // 절대 주의!
    // 필드는 프로퍼티가 아니다!
    // 프로퍼티는 셋터 겟터 메서드 이다!
    
    // 실무에서 대부분의 셋터와 겟터는 다음과 같이 그냥 값을 넣고 빼는 역할만 한다.
    // 그러다 보니,
    // 변수를 사용하여 값을 넣고 빼나
    // 메서드를 사용하여 값을 넣고 빼나 결과적으로 같은 상황이 된다.
    // 즉 캡슐화의 중요한 목적인 무효한 값을 거르는 작업을 하지 않는다.
    // 왜 쓰잘데기 없이 메서드를 만들었는지 의문이 든다.
    // - 향후 있을지도 모를 확장을 대비하기 위함으라고 위로해본다.
    // 그래서 일부 개발자들은 겟터 셋터의 무용론을 주장하며
    // 직접 변수를 사용하도록 권고하기도 한다.
    // 
    // 이렇게 영혼없이 셋커 겟터를 만들다 보니 
    // 필드수가 많은 경우 굉장히 번거롭다.
    // 가능한 IDE도구의 도움을 받으라.
    
}
    

public class Test7_3 {
    public static void main(String[] args) {
        
        Member3 m = new Member3();
        
        // Member2의 모든 필드는 private로 제한되었기 때문데
        // 레퍼런스를 사용하여 직접 접근할 수 없다.
        /*
        m.name = "홍길동";
        m.age = 20;
        m.weight = 900.7f;
        m.height = 16.0f;
        */
        
        // 대신 Member2에서 제공해주는 메서드를 이용한다.
        m.setName("홍길동");
        m.setAge(300);
        m.setWeight(500);
        m.setHeight(-200);
        
        System.out.printf("%s, %d, %f, %f\n", m.getName(), m.getAge(), m.getWeight(), m.getHeight());
        
    }

}


