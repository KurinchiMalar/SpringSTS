package com.in28minutes.spring.basics.springin5steps.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

//@Component
@Service
//@Scope("prototype")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	
	//Sort the array
	//search the array
	//Return the result
	@Autowired
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm; // Autowiring by name 
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	/*public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.bubbleSortAlgorithm = sortAlgorithm;
	}*/


	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		//Bubble Sort Algo Imagine
		
		//BubbleSortAlgorithm bubbleSortAlgortihm = new BubbleSortAlgorithm();
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.print(sortedNumbers);
		return 3;
	}
	
	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
	}

}
