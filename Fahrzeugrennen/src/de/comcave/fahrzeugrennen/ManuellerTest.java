package de.comcave.fahrzeugrennen;

public class ManuellerTest {

	public static void main(String[] args) {
		
		/*
		 * Annahme 01
		 * 
		 * amb01 hat:
		 * 
		 * MaxSpeed 80
		 * 
		 * CurrentSpeed 0
		 * 
		 * CurrentPosition 0
		 * 
		 * BlueLight false
		 */
		Ambulance amb01 = new Ambulance();
		System.out.println(amb01);
		System.out.println("amb01.getMaxSpeed() == 80 : " + (amb01.getMaxSpeed() == 80));
		System.out.println("amb01.getCurrentSpeed()==0 : " + (amb01.getCurrentSpeed()==0));
		System.out.println("amb01.getCurrentPosition()==0 : " + (amb01.getCurrentPosition()==0));
		System.out.println("amb01.isBluelight()==false : " + (amb01.isBluelight()==false));
		
		System.out.println("---------------------");
		
		/*
		 * Annahme 02
		 * 
		 * amb02 hat:
		 * 
		 * MaxSpeed 120
		 * 
		 * CurrentSpeed 120
		 * 
		 * CurrentPosition 123
		 * 
		 * BlueLight true
		 */
		Ambulance amb02 = new Ambulance(255, 123, true);
		System.out.println(amb02);
		
		if(amb02.getCurrentSpeed()==120) {
			System.out.println("amb02.getCurrentSpeed() == 120 : correct)");
		} else {
			System.err.println("amb02.getCurrentSpeed() == 120 : fails");
		}
		
		
		System.out.println("amb02.getMaxSpeed() == 120 : " + (amb02.getMaxSpeed() == 120));
		System.out.println("amb02.getCurrentSpeed()==120 : " + (amb02.getCurrentSpeed()==120));
		System.out.println("amb02.getCurrentPosition()==123 : " + (amb02.getCurrentPosition()==123));
		System.out.println("amb02.isBluelight()==true : " + (amb02.isBluelight()==true));

		

	}


}
