package cn.edu.bjfu.dao;

import cn.edu.bjfu.entity.User;

/**
 * @author Chao Huaiyu
 * @date 2020/11/24
 */
public interface UserDao {

    int insert(User user);

    User query(String username,String password);
}
