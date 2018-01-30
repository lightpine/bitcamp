package aop.ch21.ex2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext appCtx = 
                new ClassPathXmlApplicationContext("aop/ch21/ex2/application-context3.xml");
        
        String[] names = appCtx.getBeanDefinitionNames();
        for (String name : names) {
            System.out.printf("%s => %s\n", name, appCtx.getBean(name).getClass().getName());
        }
        System.out.println("----------------------------------------");
        
        Front obj = (Front) appCtx.getBean(Front.class);
        obj.test();
        
        
        
    }

}
