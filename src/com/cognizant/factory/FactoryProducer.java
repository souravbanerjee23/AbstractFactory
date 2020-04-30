package com.cognizant.factory;

import com.cognizant.abstract_class.Factory;
import com.cognizant.audi.impl.AudiFactory;
import com.cognizant.mercedes.impl.MercedesFactory;

public class FactoryProducer {
	public static Factory getFactory(String brand) {
		
		if (brand.equalsIgnoreCase("Audi")) {
			return new AudiFactory();

		} else {
			return new MercedesFactory();
		}

	}

}
