package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableConfigServer
@Slf4j
public class IplConfigServerApplication {
	public static void main(String[] args) {
		log.debug("Config Server Started");
		SpringApplication.run(IplConfigServerApplication.class, args);
		log.debug("Config Server Ended");
	}
}
