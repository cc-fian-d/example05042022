package bitweise;

public class BitweiseOperatoren02 {

	public static void main(String[] args) {
		
		int zahl = 5 | 6;//ODER
//		128 64 32 16 8 4 2 1
//		  0  0  0  0 0 1 0 1 = 5
//		  0  0  0  0 0 1 1 0 = 6
//									die Bitmaske wird "verodert"
//		  0  0  0  0 0 1 1 1 = 7

		System.out.println("zahl 5 | 6= " + zahl);
		
		
		zahl = 5 & 6;//UND
//		128 64 32 16 8 4 2 1
//		  0  0  0  0 0 1 0 1 = 5
//		  0  0  0  0 0 1 1 0 = 6
//									die Bitmaske wird "verundet"
//		  0  0  0  0 0 1 0 0 = 4
		
		System.out.println("zahl 5 & 6= " + zahl);
		
		zahl = 5 ^ 6;//Exklusiv ODER
//		128 64 32 16 8 4 2 1
//		  0  0  0  0 0 1 0 1 = 5
//		  0  0  0  0 0 1 1 0 = 6
//		  0  0  0  0 0 0 1 1 = 3
		System.out.println("zahl 5 ^ 6= " + zahl);
		
		zahl = 5 << 1;//Bit Shift
//		128 64 32 16 8 4 2 1
//		  0  0  0  0 0 1 0 1 = 5
//		  0  0  0  1 0 1 0 0 << 2
//		  0  0  0  0 0 0 0 1 >> 2
		System.out.println("zahl 5 << 2= " + zahl);
	}

}
