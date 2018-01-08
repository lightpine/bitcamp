package bitcamp.java100.ch21.ex4;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext appCtx = 
                new ClassPathXmlApplicationContext("bitcamp/java100/ch21/ex4/application-context1.xml");
        
        String[] names= appCtx.getBeanDefinitionNames();
        for (String name : names) {
            System.out.printf("%s => %s\n", name,appCtx.getBean(name).getClass().getName());
        }
        System.out.println("-----------------------------------------");
        
        Front obj = (Front) appCtx.getBean(Front.class); // 타입의 객체가 여러가지 일때는 이렇게 찾아선 안된다.
        System.out.println(obj.x.getClass().getName());
        
        System.out.println("-----------------------------------------");
        obj.test("홍길동");
        
        System.out.println("-----------------------------------------");
        
        obj.test(null); // 예외가 발생하는 경우
    }
}
