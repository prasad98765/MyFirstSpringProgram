package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	String[] fortuneArray= {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	Random mynumber = new Random();
			
	@Override
	public String getFortune() {
		int index = mynumber.nextInt(fortuneArray.length);
		String theFortune = fortuneArray[index];
		return theFortune;
	}

}
