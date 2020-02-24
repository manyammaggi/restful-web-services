package com.in28minutes.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersionController {

	@GetMapping("/person/v1")
	public PersonV1 uriV1() {
		return new PersonV1("bob charlie");
	}
	
	@GetMapping("/person/v2")
	public PersonV2 uriV2() {
		return new PersonV2(new Name("bob", "charlie"));
	}
	
	@GetMapping(value="/person/param", params="version=1")
	public PersonV1 param1() {
		return new PersonV1("bob charlie");
	}
	
	@GetMapping(value="/person/param", params="version=2")
	public PersonV2 param2() {
		return new PersonV2(new Name("bob", "charlie"));
	}
	
	@GetMapping(value="/person/header", headers="X-API-VERSION=1")
	public PersonV1 header1() {
		return new PersonV1("bob charlie");
	}
	
	@GetMapping(value="/person/header", headers="X-API-VERSION=2")
	public PersonV2 header2() {
		return new PersonV2(new Name("bob", "charlie"));
	}
	
	@GetMapping(value="/person/produces", produces="application/vnd.company.app-v1+json")
	public PersonV1 produce1() {
		return new PersonV1("bob charlie");
	}
	
	@GetMapping(value="/person/produces", produces="application/vnd.company.app-v2+json")
	public PersonV2 produce2() {
		return new PersonV2(new Name("bob", "charlie"));
	}
	
	
}
