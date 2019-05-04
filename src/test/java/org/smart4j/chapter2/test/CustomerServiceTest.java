package org.smart4j.chapter2.test;

/**
 * 作者：{hasee}
 * 日期：{2019/5/4}
 * CustomerService的测试类，使用JUnit单元测试
 * 用于测试CustomerService中的各种方法
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.service.CustomerService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 单元测试
 */
public class CustomerServiceTest {

    private final CustomerService customerService;

    public CustomerServiceTest(){
        customerService = new CustomerService();
    }

    @Before
    public void init(){
        //TODO 初始化数据库
    }

    @Test
    public void getCustomerListTest() throws Exception {
        List<Customer> customerList = customerService.getCustomerList();
        Assert.assertEquals(2, customerList.size());
    }

    @Test
    public void getCustomerTest() throws Exception {
        long id = 1;
        Customer customer = customerService.getCustomer(id);
        Assert.assertNotNull(customer);
    }

    @Test
    public void createCustomerTest() throws Exception {
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("name", "customer100");
        fieldMap.put("contact", "john");
        fieldMap.put("telephone", "13512345678");
        boolean result = customerService.createCustomer(fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void updateCustomerTest() throws Exception {
        long id = 1;
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("contact", "Eric");
        boolean result = customerService.updateCustomer(id, fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void deleteCustomerTest() throws Exception {
        long id = 1;
        boolean result = customerService.deleteCustomer(id);
        Assert.assertTrue(result);
    }
}
