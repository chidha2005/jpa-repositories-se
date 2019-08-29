package com.arrow.trade.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("SE JPA Repositories").description("Microservice to manage SE")
				.version("Version 0.1").license("Restricted Software - Arrow Trade Communications, Inc.")
				.licenseUrl("http://www.arrow.com/licenses/LICENSE-1.0.txt").build();
	}

	@Bean
	public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.paths(PathSelectors.regex("^/(changeSet|contextData)(/.*)?$")).build();
	}

}
