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
 * 编辑客户的控制器
 */
@WebServlet("/customer_edit")
public class CustomerEditServlet extends HttpServlet {

    /**
     * 进入 编辑客户 界面
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO
    }

    /**
     * 编辑客户
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO
    }
}
