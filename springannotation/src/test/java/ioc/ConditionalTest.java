package ioc;

import cn.edu.bjfu.bean.Person;
import cn.edu.bjfu.config.Conditional;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Chao Huaiyu
 * @date 2020/12/5
 */
public class ConditionalTest {

    @Test
    public void person() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Conditional.class);
        String[] names = context.getBeanNamesForType(Person.class);
        for (String name : names) {
            System.out.println(name);
        }
    }
}