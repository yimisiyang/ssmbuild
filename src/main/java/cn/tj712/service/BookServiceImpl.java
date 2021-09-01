package cn.tj712.service;

import cn.tj712.dao.BookMapper;
import cn.tj712.pojo.Books;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2021/8/31
 * @Time: 18:21
 * @author: ThinkPad
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookServiceImpl implements BookService {
    /**
     * service层调用dao层
     */
    private BookMapper bookMapper;

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
