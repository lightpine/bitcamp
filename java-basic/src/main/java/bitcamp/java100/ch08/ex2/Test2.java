package bitcamp.java100.ch08.ex2;

public class Test2 {

    public static void main(String[] args) {
        
        Car c;
        
        // 하위 클래스에 객체를 가리킬 수 있는 이유?
        c = new Car();
        
        // 컴파일러는 c 레퍼런스의 사용을 검사할 때
        // 그 레퍼런스의 타입 범위 안에서 사용되었는지 검사한다.
        // 예) c는 car타입이다. 따라서 car의 모든 기능을 사용할 것이다.
        c.model = "티코";
        c.capacity = 4;
        c.enginType = 1;
        c.cylinder = 4;
        c.valve = 16;
        
        // auto는 sedan클래스에 있는 변수이다.
        // 따라서 컴파일러는 car클래스에 없는 멤버를 사용하려 할 때 
        // 컴파일 오류를 발생 시킨다.
        
        //c.auto = true;

        
        c = new Truck();        // 하위 분류를 가리킬 수 있다.
        // 위에 c변수는 실제 truck 인스턴스를 가리킨다.
        // truck 객체에는 weight와 dumpfksms qustnrk dlTwlaks.
        // c변수를 통해서 오직 car클래스의 범위 안에서만 사용할 것이다.
        // 뭐/ 
        c.model = "타이탄";
        c.capacity = 3;
        c.enginType = 2;
        c.cylinder = 8;
        c.valve = 32;
        
        // 비록 c가 truck의 인스턴스를 가리키고 있고,
        // 그 인스턴스에 wegith와 dump라는 변수가 있더라도
        // c 변수를 통해서는 사용할 수 없다.
        //c.weight = 15;
        //c.dump = true;
        
        
        //c = new Sedan();        // 하위 분류를 가리킬 수 있다.
        // 결론은 c가 가리키는 객체는 car와 car의 서브 클래스만 가능하다.
        // 따라서 무조건 car보다는 더 많은 기능이 있다.
        // 그 기능 중에 car에 있는 기능만 쓴다하더라도 문제될 것은 없다.
        // 문제는 다음 예이다.
        
        
        // 만약 다음과 같이 서브 클래스의 레퍼런스가 수퍼 클래스의 객체를 가리킬 수 있다면
        // 어떤 상황에 빠징 수 있는지 고민해 보자!
        c = vehicle();  // 이것이 가능하다고 가정해 보자
        
        // c가 가리키는 것은 vehicle의 인스턴스인데
        // 아래의 코드는 vehicle의 인스턴스에 없는
        // car에 있는 변수를 사용하려하고 있다.
        // 이것이 문제가 되는 것이다.
        // 만약 레퍼런스가 그 상위 타입의 객체를 가리키게 허용한다면?
        
        c.model = "소나타";
        c.capacity = 4;
        c.enginType =1;
        c.capacity = 16;
        
        
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
