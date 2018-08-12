package com.along.accountcenter.services;

import com.along.accountcenter.model.AccountModel;

/**
 * 账户服务
 *
 * @author: zhengjianglong
 * @create: 2018-08-07 13:05
 */
public interface AccountService {

    AccountModel queryAccount(Long userId);

    String hello(String msg);

    String say(String test);
}
