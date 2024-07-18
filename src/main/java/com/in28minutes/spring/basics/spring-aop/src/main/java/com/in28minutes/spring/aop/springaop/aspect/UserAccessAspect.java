package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint; 
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect
@Configuration
public class UserAccessAspect {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//What kind of method calls I would intercept
	/*execution(* PACKAGE.*.*(..))  * any return type
									PACKAGE with in this package
									.* all class
									.* all methods
									(..) any params
	*/
	//@Before(pointcut)
	@Before("com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
	public void before(JoinPoint joinpoint) {
		//Advice
		logger.info("Check for user access"); 
		logger.info(" Allowed execution for {}" , joinpoint);
	}


}
