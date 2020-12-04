package cn.edu.bjfu.config;

import cn.edu.bjfu.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * 配置类代替配置文件
 * 注解：
 *      Configuration:告诉Spring只是一个配置类
 *      ComponentScan value:开启注解扫描,指定扫描的包
 *      excludeFilters = Filter[]:排除扫描类型
 *          FilterType.ANNOTATION;按照注解(type = FilterType.ANNOTATION,classes = Controller.class)
 *          FilterType.ASSIGNABLE_TYPE:按照给定的类型(type = FilterType.ASSIGNABLE_TYPE,classes = BookService.class)
 *          FilterType.ASSIGNABLE_TYPE:按照给定的类型(type = FilterType.CUSTOM,classes = MyTypeFilter.class)
 *
 * @author Chao Huaiyu
 * @date 2020/12/3
 */
@Configuration
@ComponentScan(value = "cn.edu.bjfu",excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)
})
public class MainConfig {

    @Bean
    public Person person(){
        return new Person("lisa",18);
    }

}
