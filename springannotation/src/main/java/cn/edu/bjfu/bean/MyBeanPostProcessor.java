package cn.edu.bjfu.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * BeanPostProcessor:bean的后置处理器
 * 在bean初始化前后进行一些处理：
 * postProcessBeforeInitialization:在初始化之前工作
 * postProcessAfterInitialization:在初始化之后工作
 * 将后置处理器加入到容器中
 *
 * @author Chao Huaiyu
 * @date 2020/12/4
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println(s + "--->postProcessBeforeInitialization:在初始化之前工作");
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println(s + "--->postProcessAfterInitialization:在初始化之后工作");
        return o;
    }
}
