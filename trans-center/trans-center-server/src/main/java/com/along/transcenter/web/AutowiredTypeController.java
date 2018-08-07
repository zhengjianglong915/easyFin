package com.along.transcenter.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.along.accountcenter.model.AccountModel;
import com.along.accountcenter.services.AccountService;

/**
 * @author: zhengjianglong
 * @create: 2018-08-07 15:47
 */
@Controller
public class AutowiredTypeController {
    private Logger logger = LoggerFactory.getLogger(SofaReferenceTypeController.class);

    /**
     * 这种方式是可行的
     */
    @Autowired
    private AccountService accountService;

    @RequestMapping("/account/autowired")
    @ResponseBody
    public AccountModel getAccount(Long userId) {
        Long start = System.currentTimeMillis();
        AccountModel accountModel = accountService.queryAccount(userId);
        logger.info("times:{}", System.currentTimeMillis() - start);
        return accountModel;
    }
}
