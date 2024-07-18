package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect
@Configuration
public class AfterAopAspect {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// best practice all the point cuts below can be replaced with
	//com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()
	
	@AfterReturning(value = "execution(* com.in28minutes.spring.aop.springaop.business.*.*(..))",
					returning = "result")
	public void afterReturning(JoinPoint joinpoint, Object result) {
		//Advice
		logger.info(" {} returned with value {}" , joinpoint,result);
	}
	
	@AfterThrowing(value = "execution(* com.in28minutes.spring.aop.springaop.business.*.*(..))",
					throwing = "exception")
	public void afterThrowing(JoinPoint joinpoint, Object exception) {
		//Advice
		logger.info(" {} throw execption {}" , joinpoint,exception);
	}

	@After(value = "execution(* com.in28minutes.spring.aop.springaop.business.*.*(..))")
	public void after(JoinPoint joinpoint) {
		//Advice
		logger.info(" after execution of {} " , joinpoint);
	}
}
