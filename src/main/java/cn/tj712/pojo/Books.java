package cn.tj712.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2021/8/31
 * @Time: 17:35
 * @author: ThinkPad
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private int bookId;
    private String bookName;
    private int booksCounts;
    private String detail;
}
