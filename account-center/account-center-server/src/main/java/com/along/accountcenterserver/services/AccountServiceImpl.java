package com.along.accountcenterserver.services;

import com.along.accountcenter.model.AccountModel;
import com.along.accountcenter.services.AccountService;

/**
 * @author: zhengjianglong
 * @create: 2018-08-07 13:09
 */
public class AccountServiceImpl implements AccountService {
    @Override
    public AccountModel queryAccount(Long userId) {
        AccountModel accountModel = new AccountModel();
        accountModel.setUserId(userId);
        accountModel.setUserName("畅为");
        accountModel.setLoginName("along");
        accountModel.setAge(27);
        accountModel.setPassword("123456");
        return accountModel;
    }
}
