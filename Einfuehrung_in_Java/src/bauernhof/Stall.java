package bauernhof;

import java.util.ArrayList;

public class Stall {
	
	private ArrayList<Schwein> schweine = new ArrayList<Schwein>();
	
	public void createNewSchwein() {
		schweine.add(new Schwein());
	}
	
	public Schwein getSchwein(int index) {
		return new Schwein(schweine.get(index));
	}
	
}
