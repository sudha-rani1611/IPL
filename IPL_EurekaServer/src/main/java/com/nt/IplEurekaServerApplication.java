package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class IplEurekaServerApplication {
	public static void main(String[] args) {
		log.debug("Eureka Server Started");
		SpringApplication.run(IplEurekaServerApplication.class, args);
	    log.debug("Eureka Server Stopped");
	}
}
