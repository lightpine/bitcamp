// 다형적 변수에 활용
package bitcamp.java100.ch08.ex2;

import java.io.File;

public class Test5 {

    public static void main(String[] args) throws Exception{
        
        Vehicle[] cars = new Vehicle[10];
        cars[0] = new Car();
        
        cars[0] = new Boat();
        cars[0] = new Truck();
        cars[0] = new Sedan();
        
        Object[] objs = new Object[10];
        objs[0] = new Car();
        objs[1] = new String("hello");
        objs[0] = new Integer(10);
        objs[0] = new File("");
        objs[0] = new StringBuffer();
        objs[0] = new ServerSoket(9999);
        
        
        
    }

}
