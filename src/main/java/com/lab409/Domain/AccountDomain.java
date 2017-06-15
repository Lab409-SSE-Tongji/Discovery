package com.lab409.Domain;


import com.lab409.MySQL.Entity.EventDO;

/**
 * @author ad
 * @version v0.1 2017/6/15.
 */
public class AccountDomain {
    private Integer userId;
    private String name;
    private String pwd;

    public AccountDomain(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public AccountDomain() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}