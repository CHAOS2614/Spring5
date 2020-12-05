package cn.edu.bjfu.config;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Profile:Spring提供的可以根据当前环境，动态的激活和切换组件的功能;
 *      开发环境;测试环境;生产环境
 *      数据源(/A)(/B)(/C);
 * /@Profile:指定组件在哪个环境的情况下才能被注册到容器中
 *      1.使用命令行参数:在虚拟机参数位置加载-Dspring.profiles.active=test(idea里面不会用)
 *      2.代码的方式激活
 *      3.写在配置类上，只有是指定的环境时，整个配置类里面的所有配置才能生效
 *      4.没有标识的bean，在任何环境下都加载
 * @author Chao Huaiyu
 * @date 2020/12/5
 */
@ComponentScan(value = "cn.edu.bjfu")
@Configuration
public class Profile {

    private final Properties properties;

    @Autowired
    public Profile(Properties properties) {
        this.properties = properties;
    }

    @org.springframework.context.annotation.Profile("test")
    @Bean("testDataSource")
    public DataSource testDataSource(){
        DataSource dataSource = null;
        try {
             dataSource = DruidDataSourceFactory.createDataSource(properties.getProperties());
            System.out.println("连接testDataSource成功--->" + dataSource);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }

    @org.springframework.context.annotation.Profile("dev")
    @Bean("devDataSource")
    public DataSource devDataSource(){
        DataSource dataSource = null;
        try {
            dataSource = DruidDataSourceFactory.createDataSource(properties.getProperties());
            System.out.println("连接devDataSource成功--->" + dataSource);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }
}
