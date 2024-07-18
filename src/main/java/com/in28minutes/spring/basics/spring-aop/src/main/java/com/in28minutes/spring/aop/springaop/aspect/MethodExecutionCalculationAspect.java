package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect
@Configuration
public class MethodExecutionCalculationAspect {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Around(value = "com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.trackTimeAnnotation()")
	public void around(ProceedingJoinPoint joinpoint) throws Throwable {
		
		//startTime = x
		// allow execution of method
		//endTime = y
		
		long startTime = System.currentTimeMillis();
		joinpoint.proceed();  // asking the method to continue execution. 
		long timeTaken = System.currentTimeMillis() - startTime;
		logger.info(" Time Taken by {} is {} " , joinpoint,timeTaken);
	}
		
}
