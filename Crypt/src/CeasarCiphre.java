
public class CeasarCiphre {

	public static void main(String[] args) {
		/**
		 * 
		 * A = 65
		 * 
		 * Z = 90
		 * 
		 * a = 97
		 * 
		 * z = 122
		 * 
		 * 
		 * ROTATION 13
		 * 
		 * ZeichenAlsDezimal + 13 
		 * 
		 * A = 65 + 13 = 78 = N
		 * 
		 * P = 80 + 13 = 93 wenn die Zahl größer 90 dann die Zahl - 26 = 
		 * 
		 * 
		 * char 0 - 65535 
		 */

		
		System.out.println("encode('A') " + encode('A'));
		System.out.println("encode('N') " + encode('N'));
		
		System.out.println("encode('S') " + encode('S'));
		System.out.println("encode('F') " + encode('F'));
		
		
//		String original = "HALLO WELT HIER IST JAVA";
		String original = "UNYYB JRYG UVRE VFG WNIN";
		
		char[] toEncode = original.toCharArray();
		
		for (char c : toEncode) {
			System.out.print(encode(c));
		}
		
	}
	
	/**
	 * encode für Ascii Zeichen von 65 bis 90
	 * 
	 * TODO auch die zeichen von 97 bis 122 einbinden
	 */
	public static char encode(char zeichen) {
		int coded = 32;
		if(zeichen != 32){
			coded = zeichen + 13;
			
			if(coded > 90) {
				coded = coded -26;
			}
		}
		
		return (char)coded;
	}

}
