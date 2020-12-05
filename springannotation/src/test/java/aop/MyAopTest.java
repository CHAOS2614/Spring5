package aop;

import cn.edu.bjfu.aop.MyMath;
import cn.edu.bjfu.config.MyAop;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * @author Chao Huaiyu
 * @date 2020/12/5
 */
public class MyAopTest {

    @Test
    public void logAspects() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyAop.class);
        MyMath math = context.getBean(MyMath.class);
        System.out.println(math.div(1, 0));
    }
}