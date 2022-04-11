
public class Moehre extends Gemuese {

	private int laenge;

	public int getLaenge() {
		return laenge;
	}

	public void setLaenge(int laenge) {
		this.laenge = laenge;
	}

	public Moehre() {
		this.setName("Lecker Moehre");
		this.setLaenge(12);
	}
	
	public Moehre(String name, int laenge) {
		this.setName(name);
		this.setLaenge(laenge);
	}
	
	public String toString() {
		return this.getName() + " : " + this.getLaenge();
	}
	
	public void wirdgefressen() {
		this.setLaenge(0);
	}
}
