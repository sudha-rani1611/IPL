package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import lombok.extern.slf4j.Slf4j;

@EnableDiscoveryClient
@SpringBootApplication
@Slf4j
public class IplTeamApplication {
	public static void main(String[] args) {
	    log.debug("Ipl Team Started");
		SpringApplication.run(IplTeamApplication.class, args);
	    log.debug("Ipl Team Stopped");
	}
}
