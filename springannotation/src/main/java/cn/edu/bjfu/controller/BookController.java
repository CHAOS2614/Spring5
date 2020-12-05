package cn.edu.bjfu.controller;

import cn.edu.bjfu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author Chao Huaiyu
 * @date 2020/12/3
 */
@Controller
public class BookController {

    private BookService bookService;

    public BookController() {
    }


    public BookService getBookService(){
        return bookService;
    }

    /**
     * (1) @Autowired 标注在方法上,Spring容器创建当前对象,就会调用,完成赋值;
     * (2) 方法使用的参数，自定义类型的值从IoC容器中获取
     * @param bookService 要装配的属性
     */
    @Autowired
    public void setBookService(BookService bookService){
        this.bookService = bookService;
    }

    @Override
    public String toString() {
        return "BookController{" +
                "bookService=" + bookService +
                '}';
    }
}
