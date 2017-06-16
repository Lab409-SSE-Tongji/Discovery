package com.lab409.Service.Impl;

import com.lab409.Domain.BaseResult;
import com.lab409.Domain.AccountDomain;
import com.lab409.MySQL.Entity.AccountDO;
import com.lab409.MySQL.Mapper.AccountMapper;
import com.lab409.Service.AccountService;

import com.lab409.Utilities.PwdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ad
 * @version v0.1 2017/6/15.
 */

@Service

public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    public BaseResult<Object> register(AccountDomain accountDomain) throws Exception{
        accountDomain.setPwd(PwdUtil.EncoderByMd5(accountDomain.getPwd()));

        if (accountMapper.getUserByName(accountDomain.getName()) != null){
            return new BaseResult<>(500, "User already exists");
        }

        accountMapper.register(new AccountDO(accountDomain));
        return new BaseResult<>();
    }
    public BaseResult<Object> login(String name, String pwd) throws Exception{
        pwd = PwdUtil.EncoderByMd5(pwd);
        AccountDO accountDO = accountMapper.login(name, pwd);
        if(accountDO != null) {
            return new BaseResult<>(200, "success login");
        }
        else {
            return new BaseResult<>(500, "failure login");
        }
    }

}
