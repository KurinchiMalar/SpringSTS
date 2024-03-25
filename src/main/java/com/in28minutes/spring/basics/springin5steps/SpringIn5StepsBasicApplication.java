package com.in28minutes.spring.basics.springin5steps;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringIn5StepsBasicApplication {
	
	// What are the beans?
	// What are the dependencies of a bean?
	// Where to search for beans?  ---> No need as we use @SpringBootApplication

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		//int result = binarySearch.binarySearch(new int[] {12,4,6}, 3);
		
		//BinarySearchImpl binarySearch1 = new BinarySearchImpl(new QuickSortAlgorithm());

		// Application Context maintains the beans
		
		ApplicationContext context = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		BinarySearchImpl binarySearchImpl = context.getBean(BinarySearchImpl.class);
		
		System.out.println(binarySearchImpl);
		BinarySearchImpl binarySearchImpl1 = context.getBean(BinarySearchImpl.class);
		System.out.println(binarySearchImpl1);
		/*
		 * Default Bean scope = SINGLETON
		 * 	com.in28minutes.spring.basics.springin5steps.BinarySearchImpl@29876704
			com.in28minutes.spring.basics.springin5steps.BinarySearchImpl@29876704
		 */
		
		
		/*
		 * After adding @Scope("prototype")
		 * com.in28minutes.spring.basics.springin5steps.BinarySearchImpl@a50b09c
		   com.in28minutes.spring.basics.springin5steps.BinarySearchImpl@4da855dd
		 */
		int result = binarySearchImpl.binarySearch(new int[] {12,3,4,2},3);
		System.out.println("Result is "+result);
	}

}
