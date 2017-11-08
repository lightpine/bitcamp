// 상속: Generalization 수행 후
package bitcamp.java100.ch11.ex3;


public class Test4 extends Car{
    
    public static void main(String[] args) {
        
        Car car = new Car();
        car.run();
        car.model = "그냥 차";
        car.cc = 300;
        
        car.run();
        car.stop();
    }
}
