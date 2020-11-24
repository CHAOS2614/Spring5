package cn.edu.bjfu.service.impl;

import cn.edu.bjfu.dao.UserDao;
import cn.edu.bjfu.entity.User;
import cn.edu.bjfu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Chao Huaiyu
 * @date 2020/11/24
 */

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public int register(User user) {
        return userDao.insert(user);
    }

    public User login(User user) {
        return userDao.query(user.getUsername(),user.getPassword());
    }
}
