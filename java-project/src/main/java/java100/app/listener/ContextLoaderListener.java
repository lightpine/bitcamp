package java100.app.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java100.app.AppConfig;
import java100.app.util.DataSource;

//@WebListener <== 스프링 설정 클래스 정보를 DD 파일에서 받기 위해 애노테이션을 제거한다 대신
//                 DD 파일에 선언한다.

public class ContextLoaderListener implements ServletContextListener{
    
    public static AnnotationConfigApplicationContext iocContainer;
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ContextLoaderListener()");
        ServletContext webApplicationInfo = sce.getServletContext();
        String configClassName = webApplicationInfo.getInitParameter("contextConfigLocation");
        
        try {
            Class<?> configClass = Class.forName(configClassName);
            
            iocContainer = new AnnotationConfigApplicationContext(configClass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        DataSource ds = iocContainer.getBean(DataSource.class);
        ds.close();
        
    }

}
