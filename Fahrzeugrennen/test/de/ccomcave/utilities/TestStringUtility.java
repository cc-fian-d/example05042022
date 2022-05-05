package de.ccomcave.utilities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.comcave.utilities.StringUtility;

class TestStringUtility {


	@Test
	public void testReverseString() {
		String expected = "ollaH";
		String current = StringUtility.reverseString("Hallo");
		
		assertEquals(expected, current);
		
	}
	
	@Test
	public void testRepeatString() {
		int expected = 42;
		int current = StringUtility.repeatString("123123123123123123123").length();
		
		assertEquals(expected, current);
	}
	

}
