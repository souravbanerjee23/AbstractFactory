package com.cognizant.main;

import com.cognizant.audi.impl.AudiFactory;
import com.cognizant.audi.impl.AudiHeadlight;
import com.cognizant.audi.impl.AudiTire;
import com.cognizant.factory.FactoryProducer;
import com.cognizant.mercedes.impl.MercedesFactory;
import com.cognizant.mercedes.impl.MercedesHeadlight;
import com.cognizant.mercedes.impl.MercedesTire;

public class Main {

	public static void main(String[] args) {
		AudiFactory audiFactory = (AudiFactory) FactoryProducer.getFactory("Audi");
		AudiTire audiTire = (AudiTire) audiFactory.makeTire();
		audiTire.show();
		AudiHeadlight audiHeadlight = (AudiHeadlight) audiFactory.makeHeadlight();
		audiHeadlight.show();
		MercedesFactory mercedesFactory = (MercedesFactory) FactoryProducer.getFactory("Mercedes");
		MercedesTire mercedesTire = (MercedesTire) mercedesFactory.makeTire();
		mercedesTire.show();
		MercedesHeadlight mercedesHeadlight = (MercedesHeadlight) mercedesFactory.makeHeadlight();
		mercedesHeadlight.show();

	}

}
