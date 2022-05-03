import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo01Derby {

	public static void main(String[] args) {
//		String url = "jdbc:derby:./DB/PersonalVerwaltung;create=true";
		String url = "jdbc:derby:memory:PersonalVerwaltung;create=true";

		/**
		 * Verbindung zur Datenbank herstellen
		 */
		try {
			Connection con = DriverManager.getConnection(url);
			System.out.println("Verbindung zur Datenbank herstellen");
			/**
			 * Eine Tabelle in der DB anlegen
			 */
			String sql = "CREATE TABLE personen (\r\n"
					+ "	  id INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),\r\n"
					+ "	  vorname VARCHAR(45),\r\n"
					+ "	  nachname VARCHAR(45),\r\n"
					+ "	  geburtsjahr INT,\r\n"
					+ "	  CONSTRAINT pk_id PRIMARY KEY (id) )";

			try {
				Statement stm = con.createStatement();

				stm.execute(sql);
				System.out.println("Tabelle erzeugt");
			} catch (SQLException e) {
				/**
				 * https://db.apache.org/derby/docs/10.14/ref/rrefexcept71493.html
				 * 
				 * "X0Y32" - <value> '<value>' already exists in <value>
				 * '<value>'.
				 * 
				 * hier jetzt : table exists
				 */
				System.out.println(e.getMessage());
			}

			/**
			 * Daten in die Tabelle eintragen
			 */
			String insert = "INSERT INTO personen (vorname,nachname,geburtsjahr) VALUES (?,?,?)";
			System.out.println("Daten in die Tabelle eintragen");
			try {
				PreparedStatement prep = con.prepareStatement(insert);

				boolean autoCommit = con.getAutoCommit();
				System.out.println("Autocommit = " + autoCommit);
//				prep.executeUpdate();

				prep.setString(1, "Mark");
				prep.setString(2, "Twain");
				prep.setInt(3, 1965);
				prep.executeUpdate();

				prep.setString(1, "Olivia");
				prep.setString(2, "Oil");
				prep.setInt(3, 1978);
				prep.executeUpdate();

				prep.setString(1, "Arnold");
				prep.setString(2, "Hantelfinder");
				prep.setInt(3, 1978);
				prep.executeUpdate();

				prep.setString(1, "Hildegard");
				prep.setString(2, "Schnupf");
				prep.setInt(3, 1978);
				prep.executeUpdate();

			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}

			/**
			 * Ausgeben der Daten
			 */
			try (Statement stm = con.createStatement()) {
				System.out.println("Ausgeben der Daten");
				stm.execute("SELECT * FROM personen");
				try (ResultSet res = stm.getResultSet()) {
					System.out.printf(" id | %12s | %12s | %12s %n", "vorname",
							"nachname", "geburtsjahr");
					while (res.next()) {
						System.out.printf("%3d | %12s | %12s | %12d %n",
								res.getInt(1), res.getString(2),
								res.getString(3), res.getInt(4));
					}
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Programm beendet");
	}

}
