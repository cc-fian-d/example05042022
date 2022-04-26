package bauernhof;

/**
 * 
 * Ein Schwein soll nicht älter als 27 Jahre werden.
 *
 */
public class Schwein {

	/**
	 * Attributen/Eigenschaften
	 */
	/**
	 * Ausnahme für die Datenkapselung
	 */
	public static final int ANZAHLBEINE = 4;
	private static final int MAXALTER = 27;

	/**
	 * Datenkapselung
	 */
	/**
	 * Statischen Eigenschaften
	 */
	private static String farbe;

	/**
	 * Instanz Eigenschaften
	 */
	private String name;
	private int alter;
	private int gewicht;

	/**
	 * Getter / Setter
	 * 
	 * In der Reihenfolge Get/Set wie die Attribute angegeben sind.
	 */
	public static String getFarbe() {
		return Schwein.farbe;
	}

	public static void setFarbe(String farbe) {
		Schwein.farbe = farbe;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return this.alter;
	}

	public void setAlter(int alter) {
		if (alter < MAXALTER) {
			this.alter = alter;
		} else {
			this.alter = MAXALTER;
		}
	}

	public int getGewicht() {
		return this.gewicht;
	}

	public void setGewicht(int gewicht) {
		if (gewicht >= 0) {
			this.gewicht = gewicht;
		}
	}

	/**
	 * Konstruktoren
	 * 
	 * Aufgabe ein Objekt mit gültigen Eigenschaften versehen.
	 */
	public Schwein() {
		this.setName("DEFAULT");
		this.setAlter(27);
		this.setGewicht(123);
	}

	public Schwein(int alter, int gewicht) {
		this.setName("DEFAULT");
		this.setAlter(alter);
		this.setGewicht(gewicht);

	}

	public Schwein(String name, int alter, int gewicht) {
		this.setName(name);
		this.setAlter(alter);
		this.setGewicht(gewicht);
	}

	public Schwein(Schwein toClone) {
		this.setName(toClone.getName());
		this.setAlter(toClone.getAlter());
		this.setGewicht(toClone.getGewicht());
	}

	public Schwein clone() {
		return new Schwein(this.getName(), this.getAlter(), this.getGewicht());
	}

	/**
	 * Standard Methoden
	 * 
	 * toString
	 */
	public String toString() {
		return this.getName() + " : " + this.getAlter() + " : "
				+ this.getGewicht() + " : " + Schwein.getFarbe();
	}

}
