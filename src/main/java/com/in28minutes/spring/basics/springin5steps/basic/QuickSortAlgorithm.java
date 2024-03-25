package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary // --> when there is conflict on type of autowiring, this annotation helps to pick the primary one.
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {
	
	public int[] sort(int[] numbers) {
		
		// Logic for quicksort
		System.out.println("Inside quick sort");
		return numbers;
	}

}
