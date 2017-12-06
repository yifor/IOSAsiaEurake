package com.xbtd.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class XbtdLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(XbtdLoginApplication.class, args);
	}
}
