package singleton;

public class KassenSystem {

	
	public static void main(String[] args) {
		System.out.println("Bitte Ware scannen");
		
		KassenScanner ks01 = KassenScanner.getInstance();
		
		System.out.println(ks01.hashCode());
		
		KassenScanner ks02 = KassenScanner.getInstance();
		
		System.out.println(ks02.hashCode());
		
		System.out.println(ks01 == ks02);
		

		
	}
}
