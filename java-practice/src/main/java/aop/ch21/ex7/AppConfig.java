package aop.ch21.ex7;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("aop.ch21.ex7")
@EnableAspectJAutoProxy
public class AppConfig {

}
