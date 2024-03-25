package com.in28minutes.spring.basics.springin5steps;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;



@SpringBootApplication
public class SpringIn5StepsScopeApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {
		
		
		ApplicationContext context = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		PersonDAO personDao1 = context.getBean(PersonDAO.class);
		
		PersonDAO personDao2 = context.getBean(PersonDAO.class);
		
		/* Default singleton scope
		 * 
		 * com.in28minutes.spring.basics.springin5steps.scope.PersonDAO@3aa3193a
		com.in28minutes.spring.basics.springin5steps.scope.JdbcConnection@724bade8
		com.in28minutes.spring.basics.springin5steps.scope.PersonDAO@3aa3193a
		com.in28minutes.spring.basics.springin5steps.scope.JdbcConnection@724bade8
		 */
		LOGGER.info("{}",personDao1);
		LOGGER.info("{}",personDao1.getJdbcConnection());
		
		LOGGER.info("{}",personDao2);
		LOGGER.info("{}",personDao2.getJdbcConnection());
		
		
		/* both PersonDAO and JdbcConnection --> prototype
		 * 
		 * com.in28minutes.spring.basics.springin5steps.scope.PersonDAO@3f093abe
		com.in28minutes.spring.basics.springin5steps.scope.JdbcConnection@e24ddd0
		com.in28minutes.spring.basics.springin5steps.scope.PersonDAO@6f70f32f
		com.in28minutes.spring.basics.springin5steps.scope.JdbcConnection@548e76f1
		 */

		
		/*  PersonDAO singleton
		 *  JDBCConnection prototype
		 *  com.in28minutes.spring.basics.springin5steps.scope.PersonDAO@e24ddd0
			com.in28minutes.spring.basics.springin5steps.scope.JdbcConnection@72c927f1
			com.in28minutes.spring.basics.springin5steps.scope.PersonDAO@e24ddd0
			com.in28minutes.spring.basics.springin5steps.scope.JdbcConnection@72c927f1
		 */
		
		// For PersonDAO to have variety of objects for JDBCConnection , you need to use proxy 
		/*  PersonDAO singleton
		 *  JDBCConnection - @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
		 * com.in28minutes.spring.basics.springin5steps.scope.PersonDAO@67af833b
			com.in28minutes.spring.basics.springin5steps.scope.JdbcConnection@41200e0c
			com.in28minutes.spring.basics.springin5steps.scope.PersonDAO@67af833b
			com.in28minutes.spring.basics.springin5steps.scope.JdbcConnection@40f33492
		 */
		
	}

}
