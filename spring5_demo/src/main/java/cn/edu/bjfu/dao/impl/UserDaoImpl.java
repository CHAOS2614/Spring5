package cn.edu.bjfu.dao.impl;

import cn.edu.bjfu.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author Chao Huaiyu
 * @date 2020/11/24
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void insert() {
        System.out.println("======UserDao.insert()======");
    }
}
