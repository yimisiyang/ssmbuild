import cn.tj712.pojo.Books;
import cn.tj712.service.BookService;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.text.DefaultFormatterFactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2021/9/2
 * @Time: 15:35
 * @author: ThinkPad
 */
public class MyTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl =(BookService) context.getBean("BookServiceImpl");
        for (Books books: bookServiceImpl.queryAllBooks()) {
            System.out.println(books);
        }
    }
    @Test
    public void dataSourceTest(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ComboPooledDataSource dataSource = ac.getBean("dataSource", ComboPooledDataSource.class);
        System.out.println(dataSource.getJdbcUrl());
        System.out.println(dataSource.getUser());
        System.out.println(dataSource.getPassword());

    }
}
