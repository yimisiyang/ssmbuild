package cn.tj712.service;

import cn.tj712.dao.BookMapper;
import cn.tj712.pojo.Books;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2021/8/31
 * @Time: 18:21
 * @author: ThinkPad
 */
public class BookServiceImpl implements BookService {
    /**
     * service层调用dao层
     */
    private BookMapper bookMapper;
    public BookMapper getBookMapper() {
        return bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }
}