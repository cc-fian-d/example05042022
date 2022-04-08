
public class Vergleich {

	
	
	public static void main(String[] args) {
		
		String tmp = "";
		for(int i =0;i<1_000_000;i++) {
			tmp = tmp.concat(i+"");
		}
//		System.out.println(tmp);

//		StringBuilder sb01 = new StringBuilder("");
//		for (int i = 0; i < 1_000_000; i++) {
//			sb01.append(i);
//		}
		System.out.println("fertig");
		//System.out.println(sb01);
		
	}
}
