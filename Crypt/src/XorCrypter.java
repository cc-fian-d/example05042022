import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class XorCrypter {

	private static final byte secretByte = 97;

	public static void main(String[] args) {

		String original = "Wir brauchen Wochenende";

		byte[] toEncode = original.getBytes();

		List<Byte> encodedBytes = new ArrayList<Byte>();

		for (byte b : toEncode) {
			byte xor = (byte) (b ^ secretByte);
			encodedBytes.add(xor);
		}
		
		System.out.println(encodedBytes);
		
		System.out.println("Dekodieren");
		
		List<Byte> decodedBytes = new ArrayList<Byte>();
		
		for (byte b : encodedBytes) {
			byte xor = (byte) (b ^ secretByte);
			decodedBytes.add(xor);
		}
		
		System.out.println(decodedBytes);
		System.out.println("---------------");
		
		System.out.println("encodedBytes");
		for (byte b : encodedBytes) {
			System.out.print((char)b);
		}
		
		System.out.println("\ndecodedBytes");
		for (byte b : decodedBytes) {
			System.out.print((char)b);
		}
		
	}

}
