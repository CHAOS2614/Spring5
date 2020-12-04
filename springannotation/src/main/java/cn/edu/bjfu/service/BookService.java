package cn.edu.bjfu.service;

import cn.edu.bjfu.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 *     1.@Autowired:
 *          (1) 默认优先按照类型去容器中找对应的组件：applicationContext.getBean(BookDao.class);
 *          (2) 如果找到多个相同类型的组件，再将属性的名称作为组件的id去容器中查找
 *          (3) @Qualifier(""):指定需要装配的组件id，而不是使用属性名
 *          (4) 自动装配默认一定要将属性赋值好，没有就会报错;可以使用@Autowired(required=false)
 *          (5) @Primary:让Spring进行自动装配的时候，默认使用首选的bean(注释写在bean上，不是要装配的属性上);
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
    }

    @PostConstruct
    public void init(){
        System.out.println("BookService--->初始化方法!@PostConstruct");
        System.out.println(bookDao);
    }
}
