import java.util.concurrent.ThreadLocalRandom;

public class Komponente {
	private Number x;

	public Number getX() {

		do {
			x = ThreadLocalRandom.current().nextLong();
		} while ((long) x < 0 || (long)x %2 !=0);
		//         Größer Null	oder  	Ungerade
		//         -19999 		UND		-19999
		//			TRUE		UND		FALSE
		//			TRUE		oder	FALSE
		
		return x;
	}
}
