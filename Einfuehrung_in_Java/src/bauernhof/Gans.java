package bauernhof;

public class Gans {

	private String name;
	private int alter;
	
	public Gans() {
//		super();
		this("Die Goldene");
	}
	
	public Gans(String name) {
//		super();
		this(name,42);
	}
	
	public Gans(String name, int alter) {
//		super();
		this.name = name;
		this.alter = alter;
	}
	
}
