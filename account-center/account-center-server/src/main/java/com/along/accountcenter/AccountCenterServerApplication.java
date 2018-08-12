package com.along.accountcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.along.services.PayCenterService;

@SpringBootApplication
@ImportResource(locations = {"classpath:spring/account-center-server.xml"})
public class AccountCenterServerApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(AccountCenterServerApplication.class);
        ApplicationContext applicationContext = springApplication.run(args);

//        PayCenterService payCenterService = (PayCenterService) applicationContext
//                .getBean("payCenterServiceReference");
//
//        System.out.println(payCenterService.pay(1000L));

    }

}
