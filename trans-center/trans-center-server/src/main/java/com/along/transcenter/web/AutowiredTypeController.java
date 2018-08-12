package com.along.transcenter.web;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alipay.common.tracer.core.async.SofaTracerCallable;
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

    private final ExecutorService executor = Executors.newFixedThreadPool(3);

    @RequestMapping("/account/autowired")
    @ResponseBody
    public AccountModel getAccount(Long userId) {
        Long start = System.currentTimeMillis();
        AccountModel accountModel = accountService.queryAccount(userId);
        logger.info("times:{}", System.currentTimeMillis() - start);

        String ret = accountService.hello("zjl");
        System.out.println(ret);

        String sayRet = accountService.say("zjl");
        System.out.println(sayRet);
        return accountModel;
    }

    @RequestMapping("/threadCall")
    @ResponseBody
    public String thread() {
        String ss = "";


        executor.submit(new Runnable() {
            @Override
            public void run() {
                Long start = System.currentTimeMillis();
                AccountModel accountModel = accountService.queryAccount(124l);
                logger.info("times:{}", System.currentTimeMillis() - start);
            }
        });

        executor.submit(new Runnable() {
            @Override
            public void run() {
                String ret = accountService.hello("zjl");
                System.out.println(ret);
            }
        });

        executor.submit(new Runnable() {
            @Override
            public void run() {
                String sayRet = accountService.say("zjl");
                System.out.println(sayRet);
            }
        });

        return ss;
    }


    @RequestMapping("/traceThread")
    @ResponseBody
    public String traceThread() {
        String ss = "success";

        executor.submit(new SofaTracerCallable<Object>(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                Long start = System.currentTimeMillis();
                AccountModel accountModel = accountService.queryAccount(124l);
                logger.info("times:{}", System.currentTimeMillis() - start);
                return new Object();
            }
        }));


        executor.submit(new SofaTracerCallable<Object>(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                String ret = accountService.hello("zjl");
                System.out.println(ret);
                return new Object();
            }
        }));


        executor.submit(new SofaTracerCallable<Object>(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                String sayRet = accountService.say("zjl");
                System.out.println(sayRet);
                return new Object();
            }
        }));

        return ss;
    }

}
