package ioc;

import cn.edu.bjfu.config.Profile;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * @author Chao Huaiyu
 * @date 2020/12/5
 */
public class ProfileTest {

    @Test
    public void dataSource(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("test");
        context.register(Profile.class);
        context.refresh();
        String[] names = context.getBeanNamesForType(DataSource.class);

        System.out.println("****************************************************");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("****************************************************");
    }

}