package org.smart4j.chapter2.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 作者：{hasee}
 * 日期：{2019/5/4}
 * 删除客户控制器
 */
@WebServlet("/customer_delete")
public class CustomerDeleteServlet extends HttpServlet {

    /**
     * 删除客户
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO
    }
}
