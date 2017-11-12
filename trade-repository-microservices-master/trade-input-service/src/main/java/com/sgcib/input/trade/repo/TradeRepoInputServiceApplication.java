package com.sgcib.input.trade.repo;

import java.io.FileReader;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.xmlpull.v1.XmlPullParserException;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
/**
 * 
 * @author Nanda
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
public class TradeRepoInputServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradeRepoInputServiceApplication.class, args);
	}
	
	/**
	 * Method required to generate swagger documentation
	 * @return
	 * @throws IOException
	 * @throws XmlPullParserException
	 * @throws org.codehaus.plexus.util.xml.pull.XmlPullParserException
	 */
	   @Bean
	    public Docket api() throws IOException, XmlPullParserException, org.codehaus.plexus.util.xml.pull.XmlPullParserException {
	        MavenXpp3Reader reader = new MavenXpp3Reader();
	        Model model = reader.read(new FileReader("pom.xml"));
	        return new Docket(DocumentationType.SWAGGER_2)  
	          .select() 
	          .apis(RequestHandlerSelectors.basePackage("com.sgcib.input.trade.repo"))
	          .paths(PathSelectors.any())                          
	          .build().apiInfo(new ApiInfo("Trade Repo Input Service", "Service exposed to store the trade details from different front offices", model.getParent().getVersion(), "Service to be used by Front offices", "Nanda kishore",null,null));                                           
	    }
	
}
