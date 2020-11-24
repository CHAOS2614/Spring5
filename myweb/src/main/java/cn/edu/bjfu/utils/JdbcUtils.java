package cn.edu.bjfu.utils;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Chao Huaiyu
 * @date 2020/11/23
 */
public class JdbcUtils {

    private static DruidDataSource dataSource = null;

    static {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        dataSource = context.getBean("dataSource", DruidDataSource.class);
    }

    public static Connection getConnection(){
        try {
            System.out.println("==========");
            return dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
