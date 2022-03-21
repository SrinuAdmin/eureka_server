package com.vsnp.punjulu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class JathiPunjuluApplication {

	public static void main(String[] args) {
		SpringApplication.run(JathiPunjuluApplication.class, args);
	}

}
