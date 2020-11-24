package cn.edu.bjfu.service;

import cn.edu.bjfu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Chao Huaiyu
 * @date 2020/11/24
 */
@Service
public class UserService {

    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("======userService.add=======");
        userDao.insert();
    }

}
