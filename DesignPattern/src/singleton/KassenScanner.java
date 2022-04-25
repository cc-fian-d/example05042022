package singleton;

/**
 * Singleton Pattern LAZY : Faul
 *
 */
public class KassenScanner {

	private static KassenScanner INSTANCE;
	
	public static KassenScanner getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new KassenScanner();
		}
		return INSTANCE;
	}
	
	private KassenScanner() {
		System.out.println("Kassenscanner wurde erzeugt");
	}
}
