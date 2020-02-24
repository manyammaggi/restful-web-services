package com.in28minutes.rest.webservices.restfulwebservices;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@Autowired
	private MessageSource msg;

	@GetMapping("/hello-world")
	public String helloworld() {
		return "hello";
	}
	
	@GetMapping("/hello-world-bean")
	public  helloworldbean helloworldbean() {
		return new helloworldbean("hellobean");
	}
	
	@GetMapping("/hello-world/pathvariable/{name}")
	public  helloworldbean helloworldpath(@PathVariable String name) {
		return new helloworldbean(String.format("hellobean, %s", name));
	}
	
//	@GetMapping("/hello-world-internationalization")
//	public String international(@RequestHeader(name="Accept-Language", required= false) Locale locale) {
//		return msg.getMessage("gm.msg", null, locale);
//	}
	
	@GetMapping("/hello-world-internationalization")
	public String international() {
		return msg.getMessage("gm.msg", null, LocaleContextHolder.getLocale());
	}
}
