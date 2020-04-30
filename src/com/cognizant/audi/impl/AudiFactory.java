package com.cognizant.audi.impl;

import com.cognizant.abstract_class.Factory;
import com.cognizant.abstract_class.Headlight;
import com.cognizant.abstract_class.Tire;

public class AudiFactory extends Factory {

	@Override
	public Tire makeTire() {
		// TODO Auto-generated method stub
		return new AudiTire();
	}

	@Override
	public Headlight makeHeadlight() {
		// TODO Auto-generated method stub
		return new AudiHeadlight();
	}

}
