
public class StringKonkatenation {

	public static void main(String[] args) {
		int a = 42;
		int b = 58;
		int c = a + b;

		String text = "Das ergebnis ist : ";
		String text02 = " : ist das Ergebnis von ";

		System.out.println(text + a + b);// Das ergebnis ist : 4258
		System.out.println(text + (a + b));// Das ergebnis ist : 100
		System.out.println(text + c);// Das ergebnis ist : 100

		System.out.println(a + b + text02 + a + " + " + +b);// NNNN : ist das
															// Ergebnis 4258

	}

}
