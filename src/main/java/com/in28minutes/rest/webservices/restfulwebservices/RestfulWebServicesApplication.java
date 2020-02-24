package com.in28minutes.rest.webservices.restfulwebservices;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties.LocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import springfox.documentation.swagger.web.SecurityConfiguration;

@SpringBootApplication
public class RestfulWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}

//	@Bean
//	public SessionLocaleResolver localeResolver() {
//		
//		SessionLocaleResolver lr= new SessionLocaleResolver();
//		lr.setDefaultLocale(Locale.US);
//		return lr;
//	}
	@Bean
	public AcceptHeaderLocaleResolver localeResolver() {
		
		AcceptHeaderLocaleResolver lr= new AcceptHeaderLocaleResolver();
		lr.setDefaultLocale(Locale.US);
		return lr;	
	}
	
//	@Bean
//	@Primary
//	public ResourceBundleMessageSource bundleMsgSource() {
//		
//		ResourceBundleMessageSource ms=new ResourceBundleMessageSource();
//		ms.setBasename("message");
//		return ms;	
//	}
	
}
