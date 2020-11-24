package cn.edu.bjfu.service;

import cn.edu.bjfu.entity.User;

/**
 * @author Chao Huaiyu
 * @date 2020/11/24
 */
public interface UserService {

    int register(User user);

    User login(User user);

}
