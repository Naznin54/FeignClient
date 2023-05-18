package com.UST.springbootFeignClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringbootFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFeignClientApplication.class, args);
	}

}
