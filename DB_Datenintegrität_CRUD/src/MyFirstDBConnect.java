import java.sql.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

public class MyFirstDBConnect {

	public static void main(String[] args) {
		Enumeration<Driver> drivers = DriverManager.getDrivers();
		
		while(drivers.hasMoreElements()) {
			System.out.println(drivers.nextElement().getClass());
		}
		
		/**
		 * JNDI - Java Naming and Directory Interface
		 */
//		String url = "jdbc:derby:memory:myDerby;create=true";
//		String url = "jdbc:derby:./DB/myDerby;create=true";
//		String url = "jdbc:sqlite:./DB/Mitarbeiter.db";
//		String url = "jdbc:sqlite:./DB/GibtEsNicht.db";
//		String url = "jdbc:sqlite:./DB/GibtEsNicht.ExtensionKannAndersLauten";
		String url = "jdbc:sqlite:./DB/DatabaseName.sqlite3";
		
		try {
			Connection con = DriverManager.getConnection(url);
			System.out.println("Verbindung wurde erzeugt");
			System.out.println(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
