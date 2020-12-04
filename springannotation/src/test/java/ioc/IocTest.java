package ioc;

import cn.edu.bjfu.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

/**
 * @author Chao Huaiyu
 * @date 2020/12/3
 */
public class IocTest {

    @Test
    public void iocTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        Object people = context.getBean("person");
        System.out.println(people);
    }

}
