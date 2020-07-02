package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring congiuration file
		ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("beanScope-applicationContext2.xml");
		
		// retrieve bean from spring container
		Coach theCoach = Context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = Context.getBean("myCoach", Coach.class);
	
		//check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		// print the result
		// SingleTon :- True
		// Prototype :- False
		
		System.out.println("\nPointing to the same object " + result);
		
		System.out.println("\nMemory location for theCoach " + theCoach);
		
		System.out.println("\nMemory location for alphaCoach " + alphaCoach + "\n");
		
		// Close the context
		Context.close();
	}

}

// Default scope singletone :- only one object created at any time 
// scope prototype :- different different object created 
