package com.along.transcenter.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import com.along.accountcenter.model.AccountModel;
import com.along.accountcenter.services.AccountService;

/**
 * 采用  sofaReference方式引入
 *
 * @author: zhengjianglong
 * @create: 2018-08-07 14:54
 */
@Controller
public class SofaReferenceTypeController {
    private Logger logger = LoggerFactory.getLogger(SofaReferenceTypeController.class);

    /**
     * 这种方式存在问题，会抛出以下错误：
     * com.alipay.sofa.rpc.core.exception.SofaRpcException: Unknown invoke type:bolt
     */
    @SofaReference(interfaceType = AccountService.class,
            binding = @SofaReferenceBinding(bindingType = "bolt"))
    private AccountService accountService;

    @RequestMapping("/account")
    @ResponseBody
    public AccountModel getAccount(Long userId) {
        Long start = System.currentTimeMillis();
        AccountModel accountModel = accountService.queryAccount(userId);
        logger.info("times:{}", System.currentTimeMillis() - start);
        return accountModel;
    }
}
