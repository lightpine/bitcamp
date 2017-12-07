// Spring IoC(Inversion of Control) 컨테이너 사용
// 1) 라이브러리 준비
//    => mvnrepository.com 또는 spring.io 사이트에서 
//       라이브러리 정보(spring-context)를 얻는다.
//    => build.gradle 파일에 의존 라이브러리 정보를 등록한다.
//    => "gradlew eclipse" 명령을 실행하여 라이브러리 다운로드 및 
//       이클립스 설정 파일을 갱신한다.
//    => 이클립스 프로젝트를 "Refresh" 한다.
// 
// 2) 스프링 IoC 컨테이너 객체 생성
// 
package xmlspring.spring2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    
    @Bean("str1")
    String getString1() {
        return new String();
    }
    @Bean("str2")
    String getString2() {
        return new String("hello");
    }

    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext appCtx = 
                new ClassPathXmlApplicationContext("xmlspring/spring2/application-context.xml");
        
        
        String[] names = appCtx.getBeanDefinitionNames();
        for (String n : names) {
            System.out.printf("%s\n  클래스명: %s\n",n,
                    appCtx.getBean(n).getClass().getName());
         
            String[] aliases = appCtx.getAliases(n);
            System.out.print("  별명:  ");
            for (String alias : aliases) {
                System.out.print(alias + ", ");
            
            }
            System.out.println();
        }
    }

}








