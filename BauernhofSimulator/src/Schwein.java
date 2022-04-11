
public class Schwein {

	/**
	 * Attribute, hier lager die zustände der Objekte
	 * 
	 * In der OOP gilt immer und ohne Ausnahme : Datenkapselung
	 * 
	 * Der zugriff auf die Attribute einer Klasse darf nur von der Klasse selbst
	 * vorgenommen werden. Die Attribute werden mit "private" markiert.
	 * 
	 * Für alle Attribute für die ein zugriff von außen benötigt wird, werden
	 * Getter/Setter Methoden erstellt.
	 */
	private String name;
	private double gewicht;
	private int alter;

	/**
	 * Getter/Setter
	 * 
	 * getXXX Lesende Methode
	 * 
	 * setXXX Schreibende Methode
	 */
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	/**
	 * Konstruktoren
	 */
	/**
	 * No-Arg Constructor / Default Constructor
	 * 
	 * Standard Konstruktor
	 * 
	 * Aufgabe des Konstruktors ist, das Objekt mit geeigneten werten zu befüllen
	 */
	public Schwein() {

	}

	// Sichtbarkeit rückgabewert methodenname parameterliste
	public Schwein(String name, double gewicht, int alter) {
		this.name = name;
		this.gewicht = gewicht;
		this.alter = alter;
	}

	/**
	 * Good Behavior
	 * 
	 * toString - Visitenkarten Methode
	 */
	public String toString() {
		return this.name + " : " + this.gewicht + " : " + this.alter;
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
	
//	public void fressen(Kartoffel kartoffel) {
//		System.out.println(this.getName() + " frisst " + kartoffel.getSorte());
//		this.setGewicht(this.getGewicht() + kartoffel.getKnollen());
//		kartoffel.wirdgefressen();
//	}

//	public void fressen(Moehre moehre) {
//		System.out.println(this.getName() + " frisst " + moehre.getName());
//		this.setGewicht(this.getGewicht() + moehre.getLaenge());
//		moehre.wirdgefressen();
//	}
	
	public void fressen(Gemuese gemuese) {
		System.out.println(this.getName() + " frisst " + gemuese.getClass().getSimpleName());
		
		
	}
	

	
}
