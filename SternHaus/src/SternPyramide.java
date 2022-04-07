import java.util.Scanner;

public class SternPyramide {

	public static void main(String[] args) {
		/**
		 * Der Benutzer soll die breite angeben können
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie eine Zahl an:");
		int anzahl = scanner.nextInt();
		String zeichen = "*";

		int halb = anzahl / 2;
		int hoehe = halb + 1;

		
		
		for (int i = 0; i <= halb; i++) {
			gebeZeileAus(zeichen, halb - i, i);
		}

	}

	public static void gebeZeileAus(String zeichen, int halb, int iteration) {

		for (int i = 0; i < halb; i++) {
			gebeZeichenAus(" ");
		}

		for (int i = 0; i < 1 + iteration*2; i++) {
			gebeZeichenAus("*");
		}

		System.out.println();
	}

	public static void gebeZeichenAus(String zeichen) {
		System.out.print(zeichen);
	}
}
