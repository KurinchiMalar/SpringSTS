package com.in28minutes.spring.basics.springin5steps.cdi;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@Component
//@Named
public class SomeCdiDao {
	
	public int[] getData() {
		return new int[] {1,9,8};
	}

}
