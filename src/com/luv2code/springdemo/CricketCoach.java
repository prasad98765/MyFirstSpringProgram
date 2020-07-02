package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	// add new Field For Email And team
	private String emailAddress;
	private String team;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCosch: inside Setter Method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCosch: inside Setter Method - setteam");
		this.team = team;
	}

	private FortuneService fortuneService;

	// Create no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCosch: inside no-arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCosch: inside Setter Method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDeaiyworkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
