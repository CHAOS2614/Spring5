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

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public void print(){
        System.out.println(bookService);
    }
}
