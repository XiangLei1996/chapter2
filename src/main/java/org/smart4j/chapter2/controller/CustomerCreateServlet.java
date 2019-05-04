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
 * 创建客户控制器
 */
@WebServlet("/customer_create")
public class CustomerCreateServlet extends HttpServlet {

    /**
     * 进入 创建客户 界面
     * TODO表示之后需要写入具体的处理，先分析需求，再设计，再写大概的servlet，最后才去处理具体的业务代码
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO
    }

    /**
     * 处理 创建客户 请求
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO
    }
}
