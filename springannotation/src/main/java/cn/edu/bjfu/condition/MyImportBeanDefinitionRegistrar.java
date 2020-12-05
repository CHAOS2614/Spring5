package cn.edu.bjfu.condition;

import cn.edu.bjfu.bean.color.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author Chao Huaiyu
 * @date 2020/12/5
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     * @param importingClassMetadata 当前类的注解信息
     * @param registry BeanDefinition注册类;
     *                 把所有需要添加到容器中的bean，调用BeanDefinitionRegistry.registryBeanDefinition()手动注册
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //容器中是否含有这两个对象
        boolean red = registry.containsBeanDefinition("cn.edu.bjfu.bean.color.Red");
        boolean blue = registry.containsBeanDefinition("cn.edu.bjfu.bean.color.Blue");
        if(red&&blue){
            //指定bean定义信息（bean的类型）
            RootBeanDefinition beanDefinition = new RootBeanDefinition(RainBow.class);
            //注册bean，指定bean名
            registry.registerBeanDefinition("rainBow",beanDefinition);
        }
    }
}
