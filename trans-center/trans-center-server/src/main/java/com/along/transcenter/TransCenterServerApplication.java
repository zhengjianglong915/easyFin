package com.along.transcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.along.accountcenter.services.AccountService;

@SpringBootApplication
@ImportResource(locations = {"classpath:spring/trans-center-spring.xml"})
public class TransCenterServerApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(TransCenterServerApplication.class);
        ApplicationContext applicationContext = springApplication.run(args);

        AccountService accountService = (AccountService) applicationContext
                .getBean("accountServiceReference");

        System.out.println(accountService.queryAccount(112L));
    }
}
