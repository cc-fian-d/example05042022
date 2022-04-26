package komposition;

import java.util.ArrayList;

public class Lebewesen {

	private ArrayList<Bein> beine = new ArrayList<Bein>();
	private int beinLaenge;

	public ArrayList<Bein> getBeine() {
		ArrayList<Bein> copyList = new ArrayList<Bein>();

		/**
		 * Schleife mit Zählindex
		 */
//		for (int i = 0; i < beine.size(); i++) {
//			copyList.add(beine.get(i).clone());
//		}
		
		/**
		 * Besser Syntaktischer Zucker
		 */
//		for(Bein item : beine) {
//			copyList.add(item.clone());
//		}
		
		/**
		 * Turbo???
		 * 
		 * Lambda und Streams verwenden
		 */
		beine.forEach(item->copyList.add(item.clone()));

		return copyList;
	}

	public int getBeinLaenge() {
		return this.beinLaenge;
	}

	public void setBeinLeange(int laenge) {
		this.beinLaenge = laenge;
	}

	public Lebewesen() {
		this(42);
	}

	public Lebewesen(int laenge) {
		this.setBeinLeange(laenge);
	}

	public void addBein() {
		beine.add(new Bein(this.getBeinLaenge()));
	}

	public String toString() {
		return "Lebewesen : " + beine;
	}

}
