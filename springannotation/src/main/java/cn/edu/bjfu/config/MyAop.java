package cn.edu.bjfu.config;

import cn.edu.bjfu.aop.LogAspects;
import cn.edu.bjfu.aop.MyMath;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * AOP:指在程序运行期间，动态的将某段代码切入到指定方法的指定位置进行运行的编程方式，底层使用动态代理模式;
 * 1.导入aop模块;Spring AOP:(spring-aspects)
 * 2.定义一个业务逻辑类(MyMath)，在业务逻辑运行的时候将日志进行打印(方法之前，运行结束后，出现异常。。。。。。);
 * 3.定义一个日志切面类(LogAspects)，动态感知MyMath.div()运行到哪步了
 *      通知方法:
 *          前置通知:@Before
 *          后置通知:@After
 *          返回通知:@AfterReturning
 *          异常通知:@AfterThrowing
 *          环绕通知:@Around
 * 4.给切面类的目标方法标注何时何地运行(通知注解)
 * 5.将切面类和业务逻辑类都加入到容器中
 * 6.必须告诉Spring哪个类是切面类(@Aspect)
 * 7.给配置类中加@EnableAspectJAutoProxy注解，开启基于注解的AOP模式
 * @author Chao Huaiyu
 * @date 2020/12/5
 */
@EnableAspectJAutoProxy
@ComponentScan("cn.edu.bjfu.aop")
@Configuration
public class MyAop {

    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }


}
