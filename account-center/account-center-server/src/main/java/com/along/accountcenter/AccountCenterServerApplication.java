package com.along.accountcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:spring/account-center-server.xml"})
public class AccountCenterServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountCenterServerApplication.class, args);
    }
}
