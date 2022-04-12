
public class Schaf extends ATier{

	public Schaf() {
		this.setName("Dolly");
		this.setAlter(6);
		this.setGewicht(125);
	}
	
	public Schaf(String name, double gewicht, int alter) {
		this.setName(name);
		this.setGewicht(gewicht);
		this.setAlter(alter);
	}

	@Override
	public void erzeugeLaut() {
		System.out.println("M‰‰‰‰‰hhhh");
		
	}
}
