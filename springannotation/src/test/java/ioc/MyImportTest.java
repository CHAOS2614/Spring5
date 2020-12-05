package ioc;

import cn.edu.bjfu.config.MyImport;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Chao Huaiyu
 * @date 2020/12/5
 */
public class MyImportTest {

    @Test
    public void myImport(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyImport.class);
        String[] names = context.getBeanDefinitionNames();
        System.out.println("**********************************");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("**********************************");

        Object color = context.getBean("cn.edu.bjfu.bean.color.ColorFactory");
        System.out.println("ColorFactory的类型--->\t" + color.getClass());

        Object colorFactory = context.getBean("&cn.edu.bjfu.bean.color.ColorFactory");
        System.out.println("ColorFactory的类型--->\t" + colorFactory.getClass());

    }

}