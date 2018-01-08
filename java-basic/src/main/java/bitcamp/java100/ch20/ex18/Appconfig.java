package bitcamp.java100.ch20.ex18;

import org.springframework.context.annotation.ComponentScan;
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
@ComponentScan(basePackages="bitcamp.java100.ch20.ex18")
public class Appconfig {
    
}
