package cn.edu.niit.javabean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @Author zhangli
 * @Description TODO
 * @Date 2021/5/2 20:05
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Collection {
    private int id;
    private int userId;
    private int bookId;
    private Date createTime;
    private Date updateTime;
    private boolean status;

}