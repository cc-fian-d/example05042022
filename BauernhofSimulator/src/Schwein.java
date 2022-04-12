
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
	 * befüllen
	 */
	public Schwein() {

	}

	// Sichtbarkeit rückgabewert methodenname parameterliste
	public Schwein(String name, double gewicht, int alter) {
		this.setName(name);
		this.setGewicht(gewicht);
		this.setAlter(alter);
	}

	/**
	 * Eine Methode kann überladen/overload werden.
	 * 
	 * Überladen bedeutet der Methodenname kann wiederverwendet werden innerhald
	 * derselben Klasse, allerdings müssen Überladene Methoden sich anhand von
	 * 
	 * A R A
	 * 
	 * unterscheiden.
	 * 
	 * Anzahl, Reihenfolge und Art der Übergabeparameter
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
