package com.along.accountcenter.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.along.accountcenter.model.AccountModel;
import com.along.accountcenter.services.AccountService;
import com.along.mallcenter.model.GoodInfo;
import com.along.mallcenter.services.GoodsInfoService;
import com.along.services.PayCenterService;

/**
 * @author: zhengjianglong
 * @create: 2018-08-07 13:09
 */
public class AccountServiceImpl implements AccountService {

//    @Autowired
//    private PayCenterService payCenterService;

    @Override
    public AccountModel queryAccount(Long userId) {
        AccountModel accountModel = new AccountModel();
        accountModel.setUserId(userId);
        accountModel.setUserName("畅为");
        accountModel.setLoginName("along");
        accountModel.setAge(27);
        accountModel.setPassword("123456");

//        boolean ret = payCenterService.pay(1000L);
//        System.out.println("pay result:" + ret);

        return accountModel;
    }

    @Override
    public String hello(String msg) {
        return "hello:" + msg;
    }

    @Override
    public String say(String test) {
        return test;
    }
}
