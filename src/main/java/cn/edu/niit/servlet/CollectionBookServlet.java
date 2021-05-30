package cn.edu.niit.servlet;

import cn.edu.niit.service.BookService;
import com.alibaba.fastjson.JSON;
import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * @Author zhangli
 * @Description TODO
 * @Date 2021/5/2 22:01
 * @Version 1.0
 */
@WebServlet(name = "CollectionBookServlet", urlPatterns = "/book/collection")

public class CollectionBookServlet extends HttpServlet {
    private BookService bookService=new BookService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取参数
        String paramJson = IOUtils.toString(
                req.getInputStream(), "UTF-8");
        HashMap<String, Object> parseObject =
                JSON.parseObject(paramJson,
                        HashMap.class);
        String username = (String) parseObject.get("user");
        String bookId = (String) parseObject.get("book");



    }
}
