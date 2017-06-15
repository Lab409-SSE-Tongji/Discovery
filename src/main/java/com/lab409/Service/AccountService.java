package com.lab409.Service;

import com.lab409.Domain.BaseResult;
import com.lab409.Domain.AccountDomain;

/**
 * @author ad
 * @version v0.1 2017/6/15.
 */
public interface AccountService {
    /**
     * 注册
     * @param accountDomain
     * @return
     */
    BaseResult<Object> register(AccountDomain accountDomain) throws Exception;

    /**
     * 登录
     * @param name
     * @param pwd
     * @return
     */
    BaseResult<Object> login(String name, String pwd) throws Exception;

}
