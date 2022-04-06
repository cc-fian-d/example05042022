package logisch;

/**
 * 
 * Logische Operatoren in Java werden immer zu den Literalen TRUE oder FALSE
 * ausgewertet.
 * 
 * UND ODER
 * 
 * Alle Logischen Operatoren arbeiteten als Short-Circuit-Operator, die
 * abarbeitung der Operatoren wird abgebrochen sofern das Ergbenis feststeht.
 * 
 *
 * boolean = true; boolean = false;
 *
 */
public class LogischeOperatoren {

	public static void main(String[] args) {

//		boolean bool01 = getTrue() && getFalse() && getTrue() && getTrue();

//		boolean bool02 = getTrue() & getFalse() & getTrue() & getTrue();
		
		boolean bool03 = getTrue() || getFalse() || getTrue() || getTrue();

//		System.out.println("bool01 " + bool01);
//		System.out.println("bool02 " + bool02);
		System.out.println("bool03 " + bool03);
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
