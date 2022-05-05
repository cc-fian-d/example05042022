package de.comcave.fahrzeugrennen;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import de.comcave.fahrzeugrennen.Ambulance;

class TestAmbulance {

	Ambulance amb;

	@BeforeEach
	void setUp() throws Exception {
		Random rand = new Random();
		int currentSpeed = rand.nextInt(1234)+1234;
		int currentPostion = rand.nextInt(5000);
		boolean blueLight = rand.nextBoolean();
		amb = new Ambulance(currentSpeed, currentPostion, blueLight);
	}

//	@Test
//	@RepeatedTest(50)
//	void testGetMaxSpeed() {
//		/**
//		 * Wenn von 5.000 Tests weniger als 10 Tests fehlerhaft sind, dann ist
//		 * der Test Erfolgreich durchgeführt.
//		 */
//		int maxSpeed = amb.getMaxSpeed();
//
//		String message = amb.getCurrentSpeed() + "<=" + maxSpeed;
//
//		assertTrue(amb.getCurrentSpeed() <= maxSpeed, message);
//		
//		assertTrue(amb.getCurrentSpeed() >0,"Wir haben mist gebaut : " + amb.getCurrentSpeed());
//
//	}

	@Test
	public void testDrive() {
		int minutes = 60;
		int currentSpeed = 100;
		Ambulance amb = new Ambulance(currentSpeed,0,true);
		
		/**
		 * amb
		 * 
		 * maxSpeed = 120
		 * 
		 * currentSpeed = 100
		 * 
		 * currenPosition = 0
		 */
		
		/**
		 * Nach dem drive
		 * 
		 * maxSpeed = 120
		 * 
		 * currentSpeed = 100
		 * 
		 * currenPosition = 100
		 */
		amb.drive(minutes);
		assertEquals(100, amb.getCurrentPosition());
		assertEquals(100, amb.getCurrentSpeed(),"Speed abweichend");
	}

}
