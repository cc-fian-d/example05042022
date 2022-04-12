
public abstract class AGemuese implements IFressbar{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void wirdgefressen() {
		System.out.println(this.getClass().getName() + " wird gefressen");
	}
	
}
