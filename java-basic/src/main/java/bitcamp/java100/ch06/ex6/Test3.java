// 스태틱 변수의 활용 - 상수를 사용한 후
package bitcamp.java100.ch06.ex6;

public class Test3 {

    public static void main(String[] args) throws Exception{
        Car3[] cars = new Car3[6];
        
        // 자동차가 개인용인지 영업인지 법인 소속인지 지정하기 위해 숫자를 사용한다. 
        // 또한 자동차가 트럭인지 승용인지 승합인지 지정하기 위해 숫자를 사용한다.
        // 문제는 이 숫자를 기억가 무엇을 의미하는지 알아 채기 힘들다는 것이다.
        // 그러나 각각의 숫자 값을 의미있는 문자변수로 표현 한다면,
        // 코드를 읽고 해석하기가 매우 쉽고 편할 것이다.
        // 이럴때 사용하는 문법이 상수이다.
        // 상수는 인스턴스마다 다를 필요가 없기때문에 공통변수로 선언한다.
        // 또한 값을 변경하지 못하게 final 을 붙인다.
        
        cars[0] = new Car3("티코", 900, Car3.TYPE_BUS,   Car3.USE_COMMERCIAL);
        cars[1] = new Car3("티코", 900, Car3.TYPE_SEDAN, Car3.USE_PRIVATE);
        cars[2] = new Car3("티코", 900, Car3.TYPE_TRUCK, Car3.USE_COMMERCIAL);
        
        cars[3] = new Car3("소나타", 1980, Car3.TYPE_TRUCK, Car3.USE_PRIVATE);
        cars[4] = new Car3("소나타", 1980, Car3.TYPE_SEDAN, Car3.USE_COMPANY);
        cars[5] = new Car3("소나타", 1980, Car3.TYPE_BUS,   Car3.USE_COMMERCIAL);
        
        // 특정 인스턴스의 고유 정보가 아니라.
        // 모든 인스턴스가 공유하는 정보
        
        System.out.printf("총 생산량 = %d 대\n",Car3.count);
        

        for (int i = 0; i < cars.length; i++) {
            System.out.printf("%d, %s, %d, %d, %d\n",
                    cars[i].no,
                    cars[i].model,
                    cars[i].cc,
                    cars[i].type,
                    cars[i].use
                    );
            
        }
        
    }

}
