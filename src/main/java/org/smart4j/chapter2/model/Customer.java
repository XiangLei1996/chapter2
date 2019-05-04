package org.smart4j.chapter2.model;

/**
 * 客户实体类
 * 作者：{hasee}
 * 日期：{2019/5/4}
 */
public class Customer {

    private long id;
    private String name;
    private String contact;
    private String telepehone;
    private String email;
    private String remark;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTelepehone() {
        return telepehone;
    }

    public void setTelepehone(String telepehone) {
        this.telepehone = telepehone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
