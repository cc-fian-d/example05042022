
public class String_API {

	public static void main(String[] args) {
		/**
		 * String API
		 * 
		 * Unveränderlich
		 * 
		 * Immutable
		 */

		String text01 = "Hallo Welt";
		String text02 = "Hier ist Java";

		/**
		 * Concatenates the specified string to the end of this string.
		 * 
		 * Verknüpft am Ende diesen String mit dem angegebenen String
		 */
		String text03 = text01.concat(text02);

		System.out.println(text03);//

		/**
		 * compareTo vergleicht 2 Zeichenketten miteinander.
		 * 
		 * Ergebnis:
		 * 
		 * The result is a positive integer if this String object lexicographically
		 * follows the argument string. The result is zero if the strings are equal;
		 * 
		 * compareTo returns 0 exactly when the equals(Object) method would return true.
		 * 
		 */
		String text04 = "AAAAB";
		System.out.println(text04.compareTo("AAAAA"));

		/**
		 * Aufgabe: Pirate Speech
		 * 
		 * Der Text:
		 * 
		 * Steuermann wir müssen weiter nach Süden, sonst lass ich dich Kielholen.
		 * 
		 * a -> arrr
		 * 
		 * e -> errr
		 * 
		 * u -> urrr
		 * 
		 * i -> irrr
		 * 
		 * o -> orrr
		 * 
		 * ü -> ürrrr
		 * 
		 * usw.
		 * 
		 * eu,au, umlaute aufpassen
		 * 
		 */
		String text05 = "Steuermann wir müssen weiter nach Süden, sonst lass ich dich Kielholen";

		text05 = text05.replace("a", "arrr").replace("e", "errr").replace("i", "irrr")
				.replace("u", "urrr").replace("o", "orrr").replace("errru", "eu").replace("arru", "au");

		System.out.println(text05);
		
		

	}

}
