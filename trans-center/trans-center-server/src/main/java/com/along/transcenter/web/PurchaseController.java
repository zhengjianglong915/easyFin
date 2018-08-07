package com.along.transcenter.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.along.accountcenter.model.AccountModel;
import com.along.accountcenter.services.AccountService;

/**
 * 申购提交
 *
 * @author: zhengjianglong
 * @create: 2018-08-07 14:54
 */
@Controller
public class PurchaseController {

    @SofaReference
    private AccountService accountService;

    @RequestMapping("/account")
    @ResponseBody
    public AccountModel getAccount(Long userId) {
        return accountService.queryAccount(userId);
    }
}
