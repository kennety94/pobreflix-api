package com.pobreflix.projeto.config;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket contatoApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.pobreflix.projeto"))
				.paths(regex("/api.*"))
				.build()
				.apiInfo(metaInfo());
	}
	
	private ApiInfo metaInfo() {
		ApiInfo apiInfo = new ApiInfo(
				"Pobreflix API", 
				"API REST para os conteúdos Pobreflix", 
				"1.0", 
				"Apache License Version 2.0", 
				new springfox.documentation.service.Contact(
						"Kennety Andersson", "http:github.com/kennety94", "kennetyandersson@gmail.com"), 
				"Apache License Version 2.0", 
				"https://www.apache.org/license.html", new ArrayList<VendorExtension>()); 
		
		return apiInfo;
	}
	
}
