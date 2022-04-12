
public abstract class ATier {

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
		return name;
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
	 * Good Behavior
	 * 
	 * toString - Visitenkarten Methode
	 */
	@Override
	public String toString() {
		return this.getName() + " : " + this.getGewicht() + " : " + this.getAlter();
	}

//	public void fressen(Kartoffel kartoffel) {
//	System.out.println(this.getName() + " frisst " + kartoffel.getSorte());
//	this.setGewicht(this.getGewicht() + kartoffel.getKnollen());
//	kartoffel.wirdgefressen();
//}

//public void fressen(Moehre moehre) {
//	System.out.println(this.getName() + " frisst " + moehre.getName());
//	this.setGewicht(this.getGewicht() + moehre.getLaenge());
//	moehre.wirdgefressen();
//}
	
//	public void fressen(AGemuese gemuese) {
//		System.out.println(this.getName() + " frisst "
//				+ gemuese.getClass().getSimpleName());
//	}
	
	public void fressen(IFressbar iFressbar) {
		System.out.println(this.getName() + " frisst");
		iFressbar.wirdgefressen();
		
	}
	
	
	public abstract void erzeugeLaut();

}
