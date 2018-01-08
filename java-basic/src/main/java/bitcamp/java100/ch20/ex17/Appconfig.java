package bitcamp.java100.ch20.ex17;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 스프링 IoC 컨테이너의 종류
// 1) ClassPathXmlApplicationContext
//    - 설정 정보를 XML 파일에 작성한다.
//    - XML 파일을 찾을 때는 자바 클래스 경로에서 찾는다.

// 2) FileSystemXmlApplicationContext
//    - 설정 정보를 XML 파일에 작성한다.
//    - XML 파일을 찾을때는 OS의 파일 시스템에서 찾는다.

// 3) XmlWebApplicationContext
//    - 설정 정보를 XML 파일에 작성한다.
//    - DispatcherServlet에서 기본으로 사용하는 IoC 컨테이너다.
//    - 웹 애플리케이션과 연동하는 기능이 들어있다.

// 4) AnnotationConfigApplicationContext
//    - 설정 정보를 자바 객체에 어노테이션과 메서드를 이용하여 작성한다.
//    - IoC 컨테이너를 생성할 때 @Configuration 어노테이션이 붙은 클래스를 알려줘야한다.

@Configuration
public class Appconfig {
    
    // 객체를 만들어 리턴하는 함수를 정의하고,
    // 그 함수에 @Bean 어노테이션을 붙이면
    // 스프링 IoC컨테이너가 해당 함수를 호출하여
    // 그 리턴값을 컨테이너에 보관한다.
    // XML 설정엣허 bean 태그와 같은 용도이다.
    
    @Bean // 빈의 이름을 지정하지 않으면 메서드명을 bean의 이름으로 사용한다.
    public Car getCar() {
        Car c = new Car();
        c.setModel("tico");
        c.setColor("red");
        c.setCapacity(5);
        return c;
    }
    
    @Bean("engine") // 빈의 이름을 지정하면 그 이름을 사용하여 저장한다.
    public Engine getEngine() {
        Engine e = new Engine();
        e.setName("비트엔진");
        e.setValve(16);
        e.setCc(800);
        return e;
    }
}
