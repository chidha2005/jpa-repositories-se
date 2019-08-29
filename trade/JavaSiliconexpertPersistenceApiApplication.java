package com.arrow.trade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.Import;

import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@Import(SpringDataRestConfiguration.class)
@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
public class JavaSiliconexpertPersistenceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSiliconexpertPersistenceApiApplication.class, args);
	}

}
