package cn.edu.bjfu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 自动装配:Spring利用依赖注入(DI),完成对IoC容器中各个组件的依赖关系赋值
 * @author Chao Huaiyu
 * @date 2020/12/4
 */
@Configuration
@ComponentScan({"cn.edu.bjfu.dao","cn.edu.bjfu.service","cn.edu.bjfu.controller"})
public class Autowired {

}
