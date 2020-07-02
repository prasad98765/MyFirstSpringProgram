package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	// Define a private field for the dependency
	private FortuneService fortuneService;
	
	public TrackCoach() {
	}
	// define a constructor for dependency injection
	public TrackCoach(FortuneService theService) {
		fortuneService = theService;
	}
	 
	@Override
	public String getDeaiyworkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "just Do It: " + fortuneService.getFortune();
	}
	
	// add an init method
	private void doMyStartStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	// add a destory method
	 private void DoMyCleanupStuff() {
		System.out.println("TrackCoach: inside method doMyCleanupStuff");
	}
}
