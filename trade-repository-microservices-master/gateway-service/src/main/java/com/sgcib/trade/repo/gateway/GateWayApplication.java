package com.sgcib.trade.repo.gateway;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * Zuul server which is used as a API gateway which acts as a single entry point into any service.
 * This gateway service provides dynamic routing, monitoring, resiliency and security
 * @author Nanda
 *
 */
@SpringBootApplication
@EnableZuulProxy
@RestController
@EnableSwagger2
public class GateWayApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(GateWayApplication.class).web(true).run(args);
	}

	@Bean
	public AlwaysSampler defaultSampler() {
	  return new AlwaysSampler();
	}
	
}
