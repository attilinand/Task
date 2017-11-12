package com.sgcib.trade.repo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * Eureka server used for service registration and discovery also used for monitoring the health of the services registered
 * @author Nanda
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class TradeRepoEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradeRepoEurekaServerApplication.class, args);
	}

}
