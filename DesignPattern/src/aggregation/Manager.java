package aggregation;

public class Manager {

	public static void main(String[] args) {
		Stuhl s01 = new Stuhl();
		Stuhl s02 = new Stuhl();
		Stuhl s03 = new Stuhl();
		Stuhl s04 = new Stuhl();
		
		Restaurant r01 = new Restaurant();
		
		r01.addStuhl(s01);
		r01.addStuhl(s02);
		r01.addStuhl(s03);
		r01.addStuhl(s04);
	}

}
