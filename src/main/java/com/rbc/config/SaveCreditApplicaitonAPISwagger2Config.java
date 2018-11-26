package com.rbc.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SaveCreditApplicaitonAPISwagger2Config {

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.rbc"))
				.paths(regex("/credit-scoring/.*")).build().apiInfo(metaInfo());
	}

	private ApiInfo metaInfo() {

		ApiInfo apiInfo = new ApiInfo("Credit scoring SAVE application API",
				"API for saving credit scoring application data into DB", "0.1", "Terms of Service",
				new Contact("RBC", "https://www.rbc.com/about-rbc.html", "sudarshansiu.datta@rbc.com"), null, null);

		return apiInfo;
	}

}
