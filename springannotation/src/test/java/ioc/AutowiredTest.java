package ioc;

import cn.edu.bjfu.config.Autowired;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Chao Huaiyu
 * @date 2020/12/4
 */
public class AutowiredTest {

    private AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Autowired.class);
    
    @Test
    public void autowired(){
        Object bookDao = context.getBean("bookDao");
        Object bookService= context.getBean("bookService");
        System.out.println(bookService);
        System.out.println(bookDao);
    }

}