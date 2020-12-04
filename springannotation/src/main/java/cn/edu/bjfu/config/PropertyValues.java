package cn.edu.bjfu.config;

import cn.edu.bjfu.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * bean属性赋值示例
 * @author Chao Huaiyu
 * @date 2020/12/4
 */
@Configuration
public class PropertyValues {

    @Bean
    public Person person(){
        return new Person();
    }



}
