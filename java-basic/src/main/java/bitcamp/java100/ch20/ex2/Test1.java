package bitcamp.java100.ch20.ex2;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext appCtx = 
                new ClassPathXmlApplicationContext("bitcamp/java100/ch20/ex2/application-context1.xml");
        
        String[] names = appCtx.getBeanDefinitionNames();
        
        for (String name : names) {
            System.out.printf("%s\n  클래스명 : %s\n", name, appCtx.getBean(name).getClass().getName());
            // 지정된 객체에 별명이 있으면 가져오기
            String[] alliases =appCtx.getAliases(name);
            System.out.print("  별명 : ");
            for (String alias : alliases) {
                System.out.print(alias + ", ");
            }
            System.out.println();
        }
    }
}
