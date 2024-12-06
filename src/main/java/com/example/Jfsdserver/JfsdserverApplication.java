package com.example.Jfsdserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class JfsdserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(JfsdserverApplication.class, args);
	}

}
