package com.along.paycenterserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:spring/pay-center.xml"})
public class PayCenterServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayCenterServerApplication.class, args);
	}
}
