package bitcamp.java100.ch21.ex2;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext appCtx = 
                new ClassPathXmlApplicationContext("bitcamp/java100/ch21/ex2/application-context1.xml");
        
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
        obj.test();
        
        // 작업 순서
        // 0) AOP 관련 라이브러리 가져오기
        //    - mvnrepository에서 aspactj weaver로 검색한다.
        //    - 가져와서 빌드그래들에 코드 삽입
        //    - 그래들 이클립스
        //    - 리플레쉬
        // 1) advice를 수행할 클래스를 만든다.
        // 2) XML 설정 파일에 코드 삽입 정보를 지정한다. 
        
    }
}

// [용어정리]
// Advice
// => 메서드 호출 앞/뒤에 삽입하는 코드이다.
// Pointcut
// => 코드를 삽입할 메서드의 위치정보
// join point
// => 코드가 삽입되는 곳, 메서드를 말한다.
// traget object
// => 코드가 삽입될 대상이 되는 객체
// Aspect
// => 어떤 위치(pointcut)에 어떤 객체의 코드(advice)를 삽입할 것인지를 가르키는 정보.


