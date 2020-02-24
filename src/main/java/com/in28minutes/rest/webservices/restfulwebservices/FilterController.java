package com.in28minutes.rest.webservices.restfulwebservices;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilterController {

	//static filtering
//	@GetMapping("/filtering")
//	public Filter getall() {
//		Filter objs=new Filter("v1","v2","v3");
//		return objs;
//	}
	
	//dynamic filtering
	@GetMapping("/filtering/dynamic")
	public MappingJacksonValue getSome() {
		Filter objs=new Filter("v1","v2","v3");
		
		SimpleBeanPropertyFilter filter= SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field2");
		
		FilterProvider filterprop= new SimpleFilterProvider().addFilter("FilterBean", filter);
		
		MappingJacksonValue mapping=new MappingJacksonValue(objs);
		
		mapping.setFilters(filterprop);
		
		return mapping;
	}
	
	//static filtering
//	@GetMapping("/filtering/many")
//	public List<Filter> listmany() {
//		return Arrays.asList(new Filter("v1","v2","v3"), new Filter("v11","v22","v33"));
//			
//	}
	
	
}
