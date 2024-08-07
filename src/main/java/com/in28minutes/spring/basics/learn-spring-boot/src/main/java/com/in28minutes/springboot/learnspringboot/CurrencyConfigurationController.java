package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * 
 * http://localhost:8080/currency-configuration 
 {
"url": "http://default.in28minutes.com",
"username": "defaultusername",
"key": "defaultkey"
}
 */

@RestController
public class CurrencyConfigurationController {
	
	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration retrieveConfiguration(){
		
		return configuration;
		
	}
	
	

}
