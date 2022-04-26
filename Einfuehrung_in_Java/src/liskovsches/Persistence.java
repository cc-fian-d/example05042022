package liskovsches;

public interface Persistence {
	public abstract Object loadData();
	public abstract void saveData(Object obj);
}
