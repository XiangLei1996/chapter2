package org.smart4j.chapter2.service;

/**
 * 作者：{hasee}
 * 日期：{2019/5/4}
 * 具体是使用 接口 还是 实现类，根据实际情况而定。比较简单时可以直接使用实现类
 * 标准MVC是没有这一层，这一层被用作 控制器层 与 数据库 之间的桥梁
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.util.PropsUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * 提供客户数据服务
 */
public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropsUtil.class);

    /**
     * 为JDBC的配置项定义一些常量，便于之后使用，以及修改
     */
    private static final String DRIVER;
    private static final String URL;
    private static final String USERNAME;
    private static final String PASSWORD;

    static {
        //通过自己编写的工具类获得properties属性文件中的属性值
        Properties conf = PropsUtil.loadProps("config.properties");
        DRIVER = conf.getProperty("jdbc.driver");
        URL = conf.getProperty("jdbc.url");
        USERNAME = conf.getProperty("jdbc.username");
        PASSWORD = conf.getProperty("jdbc.password");

        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            LOGGER.error("can not load jdbc driver", e);
        }
    }

    /**
     * 获取客户列表
     */
    public List<Customer> getCustomerList(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Customer> customerList = new ArrayList<Customer>();
        try {
            String sql = "SELECT * FROM customer";
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                //依次存储查询到的对像，每次需要一个新的Customer对象来存储数据
                Customer customer = new Customer();
                customer.setId(rs.getLong("id"));
                customer.setName(rs.getString("name"));
                customer.setContact(rs.getString("contact"));
                customer.setTelepehone(rs.getString("telephone"));
                customer.setEmail(rs.getString("email"));
                customer.setRemark(rs.getString("remark"));
                //将每次的新对象添加到返回list中
                customerList.add(customer);
            }
        } catch (SQLException e) {
            LOGGER.error("execute sql failure", e);
        } finally {
            //使用完之后需要关闭资源，先打开的后关闭
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    LOGGER.error("close rs failure", e);
                }
            }

            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    LOGGER.error("close stmt failure", e);
                }
            }

            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    LOGGER.error("close connect failure", e);
                }
            }
        }
        return customerList;
    }

    /**
     * 根据ID获取客户
     */
    public Customer getCustomer(long id){
        // TODO
        return null;
    }

    /**
     * 创建客户
     */
    public boolean createCustomer(Map<String, Object> fieldMap){
        // TODO
        return false;
    }

    /**
     * 更新客户
     */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap){
        // TODO
        return false;
    }

    /**
     * 删除客户
     */
    public boolean deleteCustomer(long id){
        //TODO
        return false;
    }
}
