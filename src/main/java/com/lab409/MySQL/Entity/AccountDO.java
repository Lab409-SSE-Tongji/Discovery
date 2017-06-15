package com.lab409.MySQL.Entity;

import com.lab409.Domain.AccountDomain;

/**
 * @author ad
 * @version v0.1 2017/6/15.
 */
public class AccountDO {
    private Integer user_id;
    private String name;
    private String pwd;

    public AccountDO(Integer user_id, String name, String pwd) {
        this.user_id = user_id;
        this.name = name;
        this.pwd= pwd;
    }

    public AccountDO(AccountDomain accountDomain) {
        this.name = accountDomain.getName();
        this.pwd = accountDomain.getPwd();
    }

    public AccountDO() {
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
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
