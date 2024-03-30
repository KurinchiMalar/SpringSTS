package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.basics.springin5steps.xml.XmlPersonDAO;

public class SpringIn5StepsXmlContextApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXmlContextApplication.class);

	public static void main(String[] args) {

		// Application Context maintains the beans
		
		//ApplicationContext context = SpringApplication.run(SpringIn5StepsXmlContextApplication.class, args);
		
		// XML method
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			System.out.println();
			LOGGER.info("Beans Loaded -> {}",(Object)context.getBeanDefinitionNames());
			
			XmlPersonDAO xmlPersonDao = context.getBean(XmlPersonDAO.class);
		
			System.out.println(xmlPersonDao.getJdbcConnection());
			
		}finally {
			System.out.println("Finally");
		}
		
	}

}
