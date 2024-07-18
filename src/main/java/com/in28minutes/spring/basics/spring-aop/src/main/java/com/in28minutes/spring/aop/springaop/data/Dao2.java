package com.in28minutes.spring.aop.springaop.data;

import org.springframework.stereotype.Repository;

import com.in28minutes.spring.aop.springaop.aspect.TrackTime;

@Repository
public class Dao2 {
	@TrackTime
	public String retrieveSomething() {
		return "Dao2";
	}

}
