
public class Test_TDD {

	public static void main(String[] args) {

		Komponente data = new Komponente();

		/**
		 * Die Funktion/Methode darf nur Zahlen X zurückgeben.
		 */
		if (data.getX() instanceof Number) {
			System.out.println("nur Zahlen Erfolgreich");
		} else {
			System.err.println("nur Zahlen Fehlgeschlagen");
		}
		
		/**
		 * Die Funktion/Methode darf nur Positive Zahlen X zurückgeben.
		 */
		if((long) data.getX() > 0) {
			System.out.println("nur Positive Erfolgreich");
		} else {
			System.err.println("nur Positive Fehlgeschlagen");
		}

	}

}
