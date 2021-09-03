package cn.tj712.controller;

import cn.tj712.pojo.Books;
import cn.tj712.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2021/9/2
 * @Time: 14:43
 * @author: ThinkPad
 */
@Controller
@RequestMapping("/book")
public class BookController {
    /**
     * controller层掉service层
     */
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    /**
     * 查询全部的书籍，并且返回到一个书籍展示页面
     */
    @RequestMapping("/allBooks")
    public String listBooks(Model model){
        List<Books> list = bookService.queryAllBooks();
        model.addAttribute("list",list);
        return "allBook";
    }
}
