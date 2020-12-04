package ioc;

import cn.edu.bjfu.config.PropertyValues;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * @author Chao Huaiyu
 * @date 2020/12/4
 */
public class PropertyValuesTest {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PropertyValues.class);

    @Test
    public void person() {
        Object person = context.getBean("person");
        System.out.println(person);
    }

    private void printBeans(){
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }


    }
}