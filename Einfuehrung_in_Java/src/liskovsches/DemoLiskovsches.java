package liskovsches;

public class DemoLiskovsches {

	public static void main(String[] args) {
		
		load(new MySQLLoad());
		load(new PostSQLLoad());
		load(new LoadData() {
			
			@Override
			public Object loadData() {
				return null;
			}
		});
	}

	public static void load(LoadData ld) {
		System.out.println(ld.getClass());
	}
}
