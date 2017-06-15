package com.lab409.MySQL.Mapper;

import com.lab409.MySQL.Entity.AccountDO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author ad
 * @version v0.1 2017/6/15.
 */

@Mapper
public interface AccountMapper {
    /**
     * 注册
     * @param accountDO
     * @return
     */
    @Insert("INSERT INTO account(name, pwd) " +
            "VALUES(#{name}, #{pwd})")
    int register(AccountDO accountDO);

    /**
     * 登录
     * @param name, pwd
     * @return
     */
    @Select("SELECT * FROM account WHERE name=#{name} AND pwd=#{pwd}")
    AccountDO login(@Param("name") String name, @Param("pwd") String pwd);

    @Select("SELECT * FROM account WHERE name=#{name}")
    AccountDO getUserByName(@Param("name") String name);
}
