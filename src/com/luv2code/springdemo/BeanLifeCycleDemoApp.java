package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		// load the spring congiuration file
		ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = Context.getBean("myCoach",Coach.class);
		
		System.out.println(theCoach.getDeaiyworkout());
		// Close the context
		Context.close();
	}

}

// Default scope singletone :- only one object created at any time 
// scope prototype :- different different object created 
