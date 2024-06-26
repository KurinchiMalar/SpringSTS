package com.in28minutes.spring.basics.springin5steps;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.spring.basics.componentscan.ComponentDAO;
import com.in28minutes.spring.basics.springin5steps.cdi.SomeCdiBusiness;
import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;

@SpringBootApplication// == @ComponentScan("com.in28minutes.spring.basics.springin5steps")
//@ComponentScan("com.in28minutes.spring.basics.componentscan")
public class SpringIn5StepsCdiApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);

	public static void main(String[] args) {
		
		
		ApplicationContext context = SpringApplication.run(SpringIn5StepsCdiApplication.class, args);
		SomeCdiBusiness someCdiBusiness = context.getBean(SomeCdiBusiness.class);
		
		LOGGER.info("{}",someCdiBusiness.getSomeCdiDao());
				
		
		
	}

}
