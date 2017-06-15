package com.lab409.Controller;

import com.lab409.Domain.BaseResult;
import com.lab409.Domain.AccountDomain;
import com.lab409.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ad
 * @version v0.1 2017/6/15.
 */
@RestController
public class AccountController {
    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/accounts", method = RequestMethod.POST)
    public BaseResult<Object> register(@RequestBody AccountDomain accountDomain) throws Exception{
        return accountService.register(accountDomain);
    }

    @RequestMapping(value = "/accounts", method = RequestMethod.GET)
    public BaseResult<Object> login(@RequestParam("name") String name, @RequestParam("pwd") String pwd) throws Exception{
        return accountService.login(name, pwd);
    }
}
