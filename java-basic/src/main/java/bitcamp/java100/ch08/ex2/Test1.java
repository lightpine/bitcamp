// 다형성 (poltmorphism) - 다형적 변수 (polymorphic variables)
// 수퍼 클래스의 레퍼런스는 서브 클래스의 인스턴스 주소를 저장할 수 있다.
// 왜? 서브 클래스의 인스턴스는 무조건 수퍼클래스의 인스턴스를 모두 갖고있기 때문이다.

// 그리고 분류 관점에서 상위 분류는 하위분류의 항목을 가리킬 수 있다.
// 예) 동물 ---> 사람, 
// 주의! 하위 분류는 상위 분류의 상목을 가리킬 수 없다.
// 예) 사람 ---> 포유류, 모든 포유류가 사람이 아니다. 그래서 불가하다!


package bitcamp.java100.ch08.ex2;

public class Test1 {

    public static void main(String[] args) {
        // 상위 분류는 하위분류를 가리킬 수 있다.,
        // 하위 분류는 상위 분류의 모든 특징을 갖고 있기 때문이다.
        Vehicle v;
        v = new Vehicle();
        v = new Boat();
        v = new Car();
        v = new Truck();
        v = new Sedan();
        
        Boat b;
        b = new Boat();
        //b = new Vehicle();    // 상위 분류로 하위 분류를 가리킬 수 없다.
        //b = new Car();        // 다른 파생 분류를 가리킬 수 없다.
        //b = new Sedan();      // 다른 파생 분류를 가리킬 수 없다.
        
        Car c;
        c = new Car();
        c = new Truck();        // 하위 분류를 가리킬 수 있다.
        c = new Sedan();        // 하위 분류를 가리킬 수 있다.
        //c = new Boat();       // 다른 파생 분류를 가리킬 수 없다.
        //c = new Vehicle();    // 상위 분류를 가리킬 수 없다.
        
        Sedan s;
        s = new Sedan();
        //s = new Truck();
        //s = new Car();
        //s = new Boat();
        //s = new Vehicle();
        
        // 이렇게 상속 관계에 따라 한 레퍼런스의 다양한 클래스의 객체주소를 
        // 저장 할수 있다고 해서 "다형적 변수"라고 부른다.
        
        // 다형적 변수의 용도?
        // 한 개의 변수로 같은 종류의 여러 클래스의 객체를 저장할 수 있어서
        // 프로그래밍이 편하다.
        // 즉 구체적인 타입을 지정하기 보다는
        // 그것의 상위타입을 지정함으로써
        // 그 자리에 다른 타입의 객체를 넣을수 있다.
        // 물론 분류상 같은 계열의 객체에 대해서만 가능하다.
        
        // 예 ) 
        // 생일날 까르티에 지갑 사줄께?
        // 생일날 지갑 사줄께
        // 생일날 선물 줄께
        // 생일날 좋은거 줄께
        Sedan r1; // Sedan 객체만 가리킬 수 있다.
        Vehicle r; // vehicle뿐만 아니라 그 하위의 모든 클래스의 인스턴스를 가리킬 수 있다.
        
    }

}
