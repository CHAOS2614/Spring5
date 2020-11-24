package cn.edu.bjfu.dao.impl;

import cn.edu.bjfu.dao.UserDao;
import cn.edu.bjfu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Chao Huaiyu
 * @date 2020/11/24
 */

@Repository
public class UserDaoImpl implements UserDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public int insert(User user) {
        String sql = "insert into user_table values(?,?,?)";
        return jdbcTemplate.update(sql,user.getUsername(),user.getPassword(),user.getEmail());
    }

    public User query(String username, String password) {
        String sql = "select * from user_table where username=? and password=?";
        return  jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class),username,password);
    }
}
