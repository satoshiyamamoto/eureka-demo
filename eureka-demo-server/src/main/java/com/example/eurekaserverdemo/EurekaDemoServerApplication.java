package com.example.eurekaserverdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDemoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDemoServerApplication.class, args);
	}

}
