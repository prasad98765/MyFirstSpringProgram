package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	// Define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public BaseballCoach(FortuneService theService) {
		fortuneService = theService;
	}
	
	@Override
	public String getDeaiyworkout() {
		return "Spend 30 mintes on batting practice";	
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
}
