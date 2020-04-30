package com.cognizant.mercedes.impl;

import com.cognizant.abstract_class.Factory;
import com.cognizant.abstract_class.Headlight;
import com.cognizant.abstract_class.Tire;

public class MercedesFactory extends Factory {

	@Override
	public Tire makeTire() {
		// TODO Auto-generated method stub
		return new MercedesTire();
	}

	@Override
	public Headlight makeHeadlight() {
		// TODO Auto-generated method stub
		return new MercedesHeadlight();
	}

}
