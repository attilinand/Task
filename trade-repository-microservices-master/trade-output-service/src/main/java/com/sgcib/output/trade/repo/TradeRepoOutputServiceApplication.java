package com.sgcib.output.trade.repo;

import java.io.FileReader;
import java.io.IOException;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.xmlpull.v1.XmlPullParserException;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * 
 * @author Nanda
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableSwagger2
public class TradeRepoOutputServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradeRepoOutputServiceApplication.class, args);
	}
	
	/**
	 * Method which is needed to generate swagger documentation for the API
	 * @return
	 * @throws IOException
	 * @throws XmlPullParserException
	 * @throws org.codehaus.plexus.util.xml.pull.XmlPullParserException
	 */
	@Bean
	public Docket api()
			throws IOException, XmlPullParserException, org.codehaus.plexus.util.xml.pull.XmlPullParserException {
		MavenXpp3Reader reader = new MavenXpp3Reader();
		Model model = reader.read(new FileReader("pom.xml"));
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.sgcib.output.trade.repo")).paths(PathSelectors.any())
				.build()
				.apiInfo(new ApiInfo("Trade Repo output Service", "Service used to get the trade details in the required format based on"
						+ "the back office requirement",
						model.getParent().getVersion(), "Nanda", "kishore", null, null));
	}

}
