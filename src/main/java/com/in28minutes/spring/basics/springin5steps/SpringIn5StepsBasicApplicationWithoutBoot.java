package com.in28minutes.spring.basics.springin5steps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan("com.in28minutes.spring.basics.springin5steps.basic")
/*
 * pom dependency needed 
 * 		<!--dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-core</artifactId>
		</dependency>
		<dependency>
			<groupId>org.slf4j</groupId>
			<artifactId>slf4j-api</artifactId>
		</dependency-->
 */
public class SpringIn5StepsBasicApplicationWithoutBoot {
	
	
	public static void main(String[] args) {
		
		
		//ApplicationContext context = SpringApplication.run(SpringIn5StepsBasicApplicationWithoutBoot.class, args);
		// ACAC = AnnotationConfigApplicationContext
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplicationWithoutBoot.class);
		BinarySearchImpl binarySearchImpl = context.getBean(BinarySearchImpl.class);
		
		System.out.println(binarySearchImpl);
		BinarySearchImpl binarySearchImpl1 = context.getBean(BinarySearchImpl.class);
		System.out.println(binarySearchImpl1);
	
		int result = binarySearchImpl.binarySearch(new int[] {12,3,4,2},3);
		System.out.println("Result is "+result);
		context.close();
	}

}
