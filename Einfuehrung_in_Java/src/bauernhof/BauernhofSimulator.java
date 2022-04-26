package bauernhof;

public class BauernhofSimulator {

	public static void main(String[] args) {
		Schwein.setFarbe("Rosa");

		System.out.println(Schwein.getFarbe());// Rosa

		Schwein s01 = new Schwein();
		s01.setName("Piggeldy");
		Schwein s02 = new Schwein();
		s02.setName("Fredderick");
		// Line 15
		//The static field Schwein.farbe should be accessed in a static way
		s02.setFarbe("RostRosaGetupft");
		Schwein s03 = new Schwein();
		s03.setAlter(5);
		

		System.out.println(s01);//  Piggeldy
		Schwein.setFarbe("Lila");
		System.out.println(s02);//  Fredderick
		System.out.println(s03);//  DEFAULT
	}

}
