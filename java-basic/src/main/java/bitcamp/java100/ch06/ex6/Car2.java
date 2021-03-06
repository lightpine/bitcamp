package bitcamp.java100.ch06.ex6;

public class Car2 {
    // 모든 차량이 공유하는 변수는 스태틱 변수로 선언해야 한다.
    static int count;
    
    
    
    // 각 차량마다 고유 정보를 저장하는 변수는 인스턴스 변수로 선언해야 한다.
    long no;
    String model;
    int cc;
    int type; // 트럭 = 1, 승용 = 2, 승합 = 3
    int use;  // 개인 = 1, 법인 = 2, 영업용 = 3
    
    Car2(String model, int cc, int type, int use){
        //차량을 만들 때 마다 카운트를 한다.
        count++;
        
        this.model = model;
        this.cc = cc;
        this.no = System.currentTimeMillis();
        this.type = type;
        this.use = use;
        
        
        // 다음은 차량의 고유 번호는 넘버라는 변수에 저장된다
        // 그런데 차량의 고유 번호로 현재 실행 시간을 저장하였다.
        // 현재 실행시간은 1970년 1월 1일 0시 0분 0초를 기준으로
        // 지금까지 경과 시간을 밀리초로 리턴한다.
        
        // 1밀리초동안 여러개의 객체가 생성될 수 있다.
        // 문제는 이렇게 되면 차량번호가 같아지는 문제가 발생한다.
        // 그래서 차량번호가 같지 않게 만들기 위해 객체를 생성한 후
        // 최소 1밀리초는 쉬어야 한다.
        // 다음은 JVM실행을 0.05포 멈추는 코드다.
        
        try {
            
        Thread.currentThread().sleep(50); // 객체를 생성할 때 최소 0.05초 걸린다고 가정하자
        
        }catch(Exception e) {}
    }
    
}
