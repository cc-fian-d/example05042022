
public class Kartoffel extends Gemuese{

	private int knollen;

	public int getKnollen() {
		return knollen;
	}

	public void setKnollen(int knollen) {
		this.knollen = knollen;
	}
	
	public Kartoffel() {
		this.setName("Sonja");
		this.knollen = 12;
	}
	
	public Kartoffel(String sorte, int knollen) {
		this.setName(sorte);
		this.setKnollen(knollen);
	}
	
	public String toString() {
		return this.getName() + " : " + this.getKnollen();
	}
	
	public void wirdgefressen() {
		this.setKnollen(0);
	}

}
