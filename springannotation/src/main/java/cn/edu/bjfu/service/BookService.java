package cn.edu.bjfu.service;

import cn.edu.bjfu.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * 自动装配:
 *      1.@Autowired:
 *          (1) 默认优先按照类型去容器中找对应的组件：applicationContext.getBean(BookDao.class);
 *          (2) 如果找到多个相同类型的组件，再将属性的名称作为组件的id去容器中查找
 *          (3) @Qualifier(""):指定需要装配的组件id，而不是使用属性名
 *          (4) 自动装配默认一定要将属性赋值好，没有就会报错;可以使用@Autowired(required=false)
 *          (5) @Primary:让Spring进行自动装配的时候，默认使用首选的bean(注释写在bean上，不是要装配的属性上);
 *      2.Spring还支持使用java规范的注解:@Resource(JSR250)和@Inject(JSR330)
 *          (1) @Resource:默认是按照组件名称进行装配的;没有能支持@Primary功能;没有支持(required=false)
 *          (2) @Inject:需要导入javax.inject包;
 *      3.AutowiredAnnotationBeanPostProcessor:解析完成自动装配功能;
 *      4.@Autowired可以放在:属性，构造器(如果组件只有一个有参构造器，@Autowired可以省略)，方法，参数位置
 *      5.自定义组件想要使用Spring容器底层的一些组件(ApplicationContext，BeanFactory，。。。。。。);
 *          自定义组纪检实现xxxAware;在创建对象的时候，会调用接口规定的方法注入相关组件;Aware;
 *          把Spring底层一些组件注入到自定义的Bean中;
 *          xxxAware:功能使用xxxProcessor;
 *              ApplicationContextAware-->ApplicationContextAwareProcessor;
 *
 * @author Chao Huaiyu
 * @date 2020/12/3
 */
@Service
public class BookService {

    private final BookDao bookDao;

    @Autowired
    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
        System.out.println("bookService--->构造器!--->给" + bookDao + "赋值!");
    }

    @PostConstruct
    public void init() {
        System.out.println("BookService--->初始化方法!@PostConstruct");
    }

    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao +
                '}';
    }
}
