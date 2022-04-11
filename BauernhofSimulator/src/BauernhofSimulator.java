
public class BauernhofSimulator {

	public static void main(String[] args) {
		Schwein s01 = new Schwein();

//		s01.name = "Frederick";
		s01.setName("Frederick");
//		s01.gewicht = 234.45;
		s01.setGewicht(234.45);
//		s01.alter = 7;
		s01.setAlter(7);

		Schwein s02 = new Schwein("Piggeldy", 123.15, 4);

		System.out.println(s01.getName() + " : " + s01.getGewicht() + " : " + s01.getAlter());
		System.out.println(s02.toString());
		/**
		 * Das println ruft von allen Komplexen Objekten die toString Methode implizit
		 * auf.
		 */
		System.out.println(s02);
		s02.laufen(12);
		System.out.println(s02);
		
		Kartoffel k01 = new Kartoffel("Linda", 22);
		
		System.out.println(k01);
		
		s02.fressen(k01);
		s02.fressen(new Chinakohl());
		s02.fressen(new Ruebe());
		s02.fressen(new Moehre());
		
		System.out.println(s02);
		System.out.println(k01);
	}

}
