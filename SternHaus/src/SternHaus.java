import java.util.InputMismatchException;
import java.util.Scanner;

public class SternHaus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/**
		 * Hausbau mit Java
		 */
		System.out.print("Bitte ein einzelnes Zeichen eingeben : ");
		String zeichen = scanner.nextLine();
		System.out.print("Bitte geben Sie die Breite des Hauses ein: ");
		int breite = scanner.nextInt();
		System.out.print("Bitte geben Sie die Anzahl der Etagen ein: ");
		int etagen = scanner.nextInt();

		if (breite % 2 == 0) {
			breite++;
		}

		baueHaus(zeichen, breite, etagen);
	}
	
	public static void baueHaus(String zeichen,int breite, int etagen) {
		dach(zeichen, breite);
		for(int i=0; i<etagen;i++) {
			baueEtage(zeichen, breite);
		}
	}

	public static void dach(String zeichen, int breite) {

		int hoehe = (breite / 2) + 1;

		for (int i = 0; i < hoehe; i++) {
			for (int j = 0; j < (hoehe -1 - i); j++) {
				setzeStein(" ");
			}
			for (int j = 0; j < 1 + i * 2; j++) {
				setzeStein(zeichen);
			}
			System.out.println();
		}

	}

	public static void baueEtage(String zeichen, int breite) {
		int etagenHoehe = 4;
		for (int i = 0; i < etagenHoehe; i++) {
			if (i == etagenHoehe - 1) {
				erstelleBoden(zeichen, breite);
			} else {
				stelleWaende(zeichen, breite);
			}
		}
	}

	public static void stelleWaende(String zeichen, int breite) {
		for (int i = 0; i < breite; i++) {
			if (i == 0 || i == breite - 1) {
				setzeStein(zeichen);
			} else {
				setzeStein(" ");
			}
		}
		System.out.println();
	}

	public static void erstelleBoden(String zeichen, int breite) {
		for (int i = 0; i < breite; i++) {
			setzeStein(zeichen);
		}
		System.out.println();
		
		//System.out.println(zeichen.repeat(breite));
	}

	public static void setzeStein(String zeichen) {
		System.out.print(zeichen);
	}
}
