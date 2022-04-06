package bitweise;

/**
 * 
 * Logische Operatoren in Java werden immer zu den Literalen TRUE oder FALSE
 * ausgewertet.
 * 
 * UND ODER
 * 
 * Alle Bitweisen arbeiteten als Long-Circuit-Operator, das bedeutet
 * das Ergebnis steht erst mit dem letzten Operator fest. Geht unabhängig vom
 * feststehendem Ergebnis die gesamte Kette weiter durch.
 * 
 * 
 *
 * boolean = true; boolean = false;
 *
 */
public class BitweiseOperatoren {

	public static void main(String[] args) {

		boolean bool01 = getTrue() | getFalse() | getTrue() | getTrue();

		System.out.println("bool01 " + bool01);
	}

	public static boolean getTrue() {
		System.out.println("getTrue");
		return true;
	}

	public static boolean getFalse() {
		System.out.println("getFalse");
		return false;
	}
}
