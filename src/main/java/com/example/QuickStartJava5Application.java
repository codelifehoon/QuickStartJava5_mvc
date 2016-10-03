package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

    @Configuration
    @EnableAutoConfiguration
    @ComponentScan
    @SpringBootApplication
public class QuickStartJava5Application {

	public static void main(String[] args) {
		SpringApplication.run(QuickStartJava5Application.class, args);
		 System.out.println(" QuickStartJava5Application Spring Boot Started.");
	}
	
//	@Bean
//    public InternalResourceViewResolver setupViewResolver() {
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setPrefix("/WEB-INF/view/");
//        resolver.setSuffix(".jsp");
//        return resolver;
//    }
	
}
