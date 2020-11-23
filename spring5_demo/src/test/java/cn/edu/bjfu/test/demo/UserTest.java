package cn.edu.bjfu.test.demo;

import cn.edu.bjfu.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Chao Huaiyu
 * @date 2020/11/23
 */
public class UserTest {

    @Test
    public void userTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}