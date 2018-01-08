package bitcamp.java100.ch21.ex3;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext appCtx = 
                new ClassPathXmlApplicationContext("bitcamp/java100/ch21/ex3/application-context1.xml");
        
        String[] names= appCtx.getBeanDefinitionNames();
        for (String name : names) {
            System.out.printf("%s => %s\n", name,appCtx.getBean(name).getClass().getName());
        }
        System.out.println("-----------------------------------------");
        
        // AOP?
        // => 기존의 코드를 손대지 않고 기능을 삽입하는 기술
        // => 메서드 호출 앞/뒤로 코드를 삽입할 수 있다.
        // => 일종의 필터를 추가하는 기술이다.
        Front obj = (Front) appCtx.getBean(Front.class); // 타입의 객체가 여러가지 일때는 이렇게 찾아선 안된다.
        obj.test("홍길동");
        
        System.out.println("-----------------------------------------");
        
        obj.test(null); // 예외가 발생하는 경우
        
        // advice 적용 위치
        // Befor
        // => 메서드 실행 전
        // After
        // => 메서드 실행 후
        // AfterReturning
        // => 값 리턴 후
        // AfterThrowing
        // => 예외를 던진 후
        
        
    }
}
