package bitcamp.java100.ch20.ex1;


import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test2 {

    public static void main(String[] args) {
        
        
        
        FileSystemXmlApplicationContext appCtx = 
                new FileSystemXmlApplicationContext("./sample/application-context.xml");
        System.out.printf("빈 개수 = %d\n", appCtx.getBeanDefinitionCount());
        String[] names = appCtx.getBeanDefinitionNames();
        
        for (String name : names) {
            System.out.printf("%s\n    ---->%s", name, appCtx.getBean(name).getClass().getName());
        }
        
        String s1 = (String)appCtx.getBean("str1");
        String s2 = (String)appCtx.getBean("str2");
        
        System.out.println(s1);
        System.out.println(s1);
        
    }

}
