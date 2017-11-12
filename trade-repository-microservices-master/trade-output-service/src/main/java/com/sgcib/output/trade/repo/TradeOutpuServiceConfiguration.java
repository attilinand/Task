package com.sgcib.output.trade.repo;

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
@ComponentScan("com.sgcib.output.trade.repo")
public class TradeOutpuServiceConfiguration {

	@Bean
	public AlwaysSampler defaultSampler() {
	  return new AlwaysSampler();
	}
	
}
