package service;

import cn.edu.bjfu.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @author Chao Huaiyu
 * @date 2020/11/24
 */
public class UserServiceTest {

    @Test
    public void add(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService",UserService.class);
        userService.add();
    }
}