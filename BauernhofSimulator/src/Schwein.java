
public class Schwein extends ATier {

	/**
	 * Konstruktoren
	 * 
	 * Jede Klasse muss seine eigenen Konstruktoren erstellen, diese werden
	 * nicht mitvererbt
	 */
	/**
	 * No-Arg Constructor / Default Constructor
	 * 
	 * Standard Konstruktor
	 * 
	 * Aufgabe des Konstruktors ist, das Objekt mit geeigneten werten zu
	 * bef�llen
	 */
	public Schwein() {

	}

	// Sichtbarkeit r�ckgabewert methodenname parameterliste
	public Schwein(String name, double gewicht, int alter) {
		this.setName(name);
		this.setGewicht(gewicht);
		this.setAlter(alter);
	}

	/**
	 * Eine Methode kann �berladen/overload werden.
	 * 
	 * �berladen bedeutet der Methodenname kann wiederverwendet werden innerhald
	 * derselben Klasse, allerdings m�ssen �berladene Methoden sich anhand von
	 * 
	 * A R A
	 * 
	 * unterscheiden.
	 * 
	 * Anzahl, Reihenfolge und Art der �bergabeparameter
	 * 
	 */
	public void laufen() {
		this.setGewicht(this.getGewicht() - 1);
	}

	public void laufen(int meter) {
		this.setGewicht(this.getGewicht() - meter);
	}

	@Override
	public void erzeugeLaut() {
		System.out.println("Oink Oink Oink Oink");
	}

}
