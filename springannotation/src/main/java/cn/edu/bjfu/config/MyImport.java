package cn.edu.bjfu.config;

import cn.edu.bjfu.bean.color.Black;
import cn.edu.bjfu.bean.color.ColorFactory;
import cn.edu.bjfu.condition.MyImportBeanDefinitionRegistrar;
import cn.edu.bjfu.condition.MyImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 给容器中注册组件:
 *      (1) 包扫描+组件标注注解(@Controller @Service @Repository @Component)，局限于自己写的类
 *      (2) @Bean:导入的第三方包里面的组件
 *      (3) @Import:快速给容器中导入一个组件
 *          a.@Import(要导入到容器中的组件);容器中就会自动注册这个组件，id默认是全类名
 *          b.ImportSelector:返回需要导入的组件的全类名数组
 *          c.ImportBeanDefinitionRegistrar:
 *      (4) 使用Spring提供的FactoryBean(工厂Bean);
 * @author Chao Huaiyu
 * @date 2020/12/5
 */
@Configuration
@Import({Black.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class, ColorFactory.class})
public class MyImport {
}
