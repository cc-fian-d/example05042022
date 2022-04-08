
public class StringBuilder_API {

	public static void main(String[] args) {
		/**
		 * StringBuilder sind veränderlich
		 */
		
		StringBuilder sb01 = new StringBuilder("Hallo Welt");
		
		/**
		 * Appends the specified string to this character sequence. 
		 */
		sb01.append("Hier ist Java");
		
		System.out.println(sb01);
		
	}

}
