package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import lombok.extern.slf4j.Slf4j;

@EnableDiscoveryClient
@SpringBootApplication
@Slf4j
public class IplPlayerApplication {
    public static void main(String[] args) {
    	log.debug("Ipl Player started");
		SpringApplication.run(IplPlayerApplication.class, args);
	    log.debug("Ipl Player stopped");
    }
}
