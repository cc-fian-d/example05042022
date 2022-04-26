package komposition;

import java.util.ArrayList;

public class Applikation {
	
	public static void main(String[] args) {
		
		Bein bLinks = new Bein(42);
		
		Lebewesen me = new Lebewesen(23);
		
		me.addBein();
		me.addBein();
		me.addBein();
		me.addBein();
		
		System.out.println(me);
		System.out.println(bLinks);
		System.out.println("----------");
		ArrayList<Bein> listOuter = me.getBeine();
		listOuter.get(0).setLaenge(456);
		listOuter.add(bLinks);
		listOuter.add(bLinks);
		listOuter.add(bLinks);
		listOuter.add(bLinks);
		listOuter.add(bLinks);
		System.out.println(me);
		System.out.println(listOuter);
		
		me = null;
	}
}
