package cn.tj712.dao;

import cn.tj712.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2021/8/31
 * @Time: 17:38
 * @author: ThinkPad
 */
public interface BookMapper {
    /**
     * 增加一本书
     * @param books
     * @return
     */
    int addBook(Books books);

    /**
     * 通过ID删除一本书
     * @param id
     * @return
     */
    int deleteBookById(@Param("bookId") int id);

    /**
     * 更新一本书
     * @param book
     * @return
     */
    int updateBook(Books book);

    /**
     * 根据id查询一本书
     * @param id
     * @return
     */
    Books queryBookById(@Param("bookId") int id);

    /**
     * 查询全部的书
     * @return
     */
    List<Books> queryAllBooks();

}
