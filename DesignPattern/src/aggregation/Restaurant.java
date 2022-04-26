package aggregation;

import java.util.ArrayList;

public class Restaurant {
	
	private ArrayList<Stuhl> stuehle = new ArrayList<>();
	
	public ArrayList<Stuhl> getStuehle() {
		return stuehle;
	}
	
	public void setStuehle(ArrayList<Stuhl> stuehle) {
		this.stuehle = stuehle;
	}
	
	public Stuhl getStuhl(int index) {
		return stuehle.get(index);
	}
	
	public void addStuhl(Stuhl stuhl) {
		stuehle.add(stuhl);
	}
	
	public void removeStuhl(Stuhl stuhl) {
		stuehle.remove(stuhl);
	}
}
