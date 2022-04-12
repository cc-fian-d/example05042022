
public class BauernhofSimulator {

	public static void main(String[] args) {
//		demo01();
//		demo02();
//		demo03();
		demo04();
	}

	private static void demo04() {
		Schaf schaf01 = new Schaf("Betty", 155, 14);
		Schwein schwein01 = new Schwein();
		var g01 = new Chinakohl();
		
		System.out.println(schaf01);
		schaf01.fressen(g01);
		schaf01.fressen(new Stein());
		System.out.println(schaf01);
		
		schaf01.erzeugeLaut();
		schwein01.erzeugeLaut();
	}

	private static void demo03() {
		/**
		 * Typinferenz : Type inference : Datentypherleitung
		 * 
		 * seit Java 11 möglich
		 */
		var k01 = new Kartoffel("Linda", 25);
		var s01 = new Schwein("Frederick", 245, 7);
		
		System.out.println(k01);
		System.out.println(s01);
		
		s01.fressen(k01);
		
	}

	public static void demo02() {
		/**
		 * Cannot instantiate the type Gemuese
		 * 
		 * Type Gemuese is abstract
		 */
//		Gemuese g01 = new Gemuese();

		/**
		 * Den Referenzdatentyp so allgemein wie möglich, jedoch so Speziell wie
		 * nötig.
		 */
		// Links Referenzdatentyp = Rechts Objektdatentyp
//		Object obj01 = new Kartoffel("Linda", 25);
		AGemuese obj01 = new Kartoffel("Linda", 25);

//		Object obj02 = new Schwein("Fredderick", 245, 7);
		Schwein obj02 = new Schwein("Fredderick", 245, 7);

		System.out.println(obj01);
		System.out.println(obj02);

		/**
		 * Java sieht nur den Referenzdatentyp und auch nur die API von dem
		 * Referenzdatentyp
		 */
		obj02.fressen(obj01);
	}

	public static void demo01() {
		Schwein s01 = new Schwein();

//		s01.name = "Frederick";
		s01.setName("Frederick");
//		s01.gewicht = 234.45;
		s01.setGewicht(234.45);
//		s01.alter = 7;
		s01.setAlter(7);

		Schwein s02 = new Schwein("Piggeldy", 123.15, 4);

		System.out.println(s01.getName() + " : " + s01.getGewicht() + " : "
				+ s01.getAlter());
		System.out.println(s02.toString());
		/**
		 * Das println ruft von allen Komplexen Objekten die toString Methode
		 * implizit auf.
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
