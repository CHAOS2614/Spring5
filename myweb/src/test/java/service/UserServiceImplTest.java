package service;

import cn.edu.bjfu.entity.User;
import cn.edu.bjfu.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @author Chao Huaiyu
 * @date 2020/11/24
 */
public class UserServiceImplTest {

    @Test
    public void register() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userServiceImpl", UserService.class);
        User user = new User();
        user.setUsername("admin");
        user.setPassword("admin");
        user.setEmail("330276680@qq.com");
        userService.register(user);
    }

    @Test
    public void login(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userServiceImpl",UserService.class);
        User user = new User();
        user.setUsername("admin");
        user.setPassword("admin");
        User login = userService.login(user);
        System.out.println(login);
    }
}