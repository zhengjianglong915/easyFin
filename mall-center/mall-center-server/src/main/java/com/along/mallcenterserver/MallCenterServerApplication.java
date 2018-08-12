package com.along.mallcenterserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:spring/mall-center.xml"})
public class MallCenterServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallCenterServerApplication.class, args);
	}
}
