package komposition;

public class Bein {
	
	private int laenge;
	
	public int getLaenge() {
		return this.laenge;
	}
	
	public void setLaenge(int laenge) {
		this.laenge = laenge;
	}
	
	public Bein() {
		this(42);
	}
	
	public Bein(int laenge) {
		this.setLaenge(laenge);
	}
	
	public Bein clone() {
		return new Bein(this.getLaenge());
	}
	
	public String toString() {
		return "Bein laenge = " + this.getLaenge();
	}
}
