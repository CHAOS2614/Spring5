package cn.edu.bjfu.config;

import cn.edu.bjfu.bean.Person;
import cn.edu.bjfu.condition.PersonCondition;
import org.springframework.context.annotation.Bean;

/**
 * 1.@Scope:调整作用域
 *      prototype:多实例:在获取对象时才会创建，获取几次就调用几次
 *      singleton:单实例(默认值):IoC容器启动会调用方法创建对象放到IoC容器中
 *
 * 2.@Lazy:针对单实例bean，使得在容器启动时不创建对象，在第一次获取的时候创建对象并初始化
 *
 * 3.@Conditional:按照一定的条件进行判断，满足条件给容器中注册bean
 *      如果注解在类上，表示满足当前条件，这个类中配置的所有bean才能生效
 *
 * @author Chao Huaiyu
 * @date 2020/12/5
 */
public class Conditional {

    @org.springframework.context.annotation.Conditional(PersonCondition.class)
    @Bean("tom")
    public Person tom(){
        System.out.println("tom--->\tBean创建了!!!!!!");
        return new Person("tom",12);
    }

    @org.springframework.context.annotation.Conditional(PersonCondition.class)
    @Bean("anna")
    public Person anna(){
        return new Person("anna",17);
    }

    @org.springframework.context.annotation.Conditional(PersonCondition.class)
    @Bean("louise")
    public Person louise(){
        return new Person("louise",16);
    }
}
