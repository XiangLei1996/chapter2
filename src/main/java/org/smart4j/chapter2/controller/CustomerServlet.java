package org.smart4j.chapter2.controller;

import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 作者：{hasee}
 * 日期：{2019/5/4}
 * 客户列表控制器？
 */
@WebServlet("/customer")
public class CustomerServlet extends HttpServlet {

    private CustomerService customerService;

    /**
     * 在Servlet处理事务之前，按特定要求初始化servlet，这里初始化一个CustomerService对象---使用了单例模式 --- 懒汉式
     * @throws ServletException
     */
    @Override
    public void init() throws ServletException {
        customerService = new CustomerService();
    }

    /**
     * 进入 客户列表 界面
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //TODO
        List<Customer> customerList = customerService.getCustomerList();
        req.setAttribute("cusomterList", customerList);
        //这里使用的是绝对路径？ /开头意味着根目录开头？
        req.getRequestDispatcher("/WEB-INF/view/customer.jsp").forward(req, resp);
    }
}
