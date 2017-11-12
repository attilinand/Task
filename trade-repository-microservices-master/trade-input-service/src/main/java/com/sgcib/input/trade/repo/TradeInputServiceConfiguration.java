package com.sgcib.input.trade.repo;

import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 * 
 * @author Nanda
 *
 */
@Configuration
@ComponentScan("com.sgcib.input.trade.repo")
public class TradeInputServiceConfiguration {

	@Bean
	public AlwaysSampler defaultSampler() {
	  return new AlwaysSampler();
	}
	
}
