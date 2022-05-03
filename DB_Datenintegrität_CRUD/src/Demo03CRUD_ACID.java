import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
	 * A transaction has four main attributes, which are known as ACID.
	 * 
	 * The letter A stands for atomicity. It means that each transaction must be
	 * all or nothing. If any operation in the transaction fails, the database
	 * state remains unchanged.
	 * 
	 * The letter C stands for consistency. It makes sure that any transaction
	 * will bring the data in the database from one valid state to another.
	 * 
	 * The letter I stands for isolation. This is for concurrency control. It
	 * ensures that the all concurrent execution of transactions produce the
	 * same result as if they were executed sequentially.
	 * 
	 * The letter D stands for durability. It means when the transaction is
	 * committed, it will remain intact regardless of any errors such as power
	 * loss.
	 * 
	 * You use transactions when the set of database operations you are making
	 * needs to be atomic.
	 * 
	 * That is - they all need to succeed or fail. Nothing in between.
	 */
public class Demo03CRUD_ACID {

	public static void main(String[] args) throws SQLException{
//		String url = "jdbc:derby:memory:Transaction;create=true";
		String url = "jdbc:derby:./DB/Transaction;create=true";
		
		Connection con = DriverManager.getConnection(url);

		/**
		 * Eine Transaction soll gestartet werden.
		 */
		con.setAutoCommit(false);
		
		/**
		 * ACID
		 * 
		 * atomicity
		 * 
		 * isolation
		 * 
		 * consistency
		 * 
		 * durability
		 * 
		 */
		
		/**
		 * Erzeugen einer Tabelle ANFANG
		 */
		String sql = "CREATE TABLE personen (\r\n"
				+ "	  id INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),\r\n"
				+ "	  vorname VARCHAR(45),\r\n"
				+ "	  nachname VARCHAR(45),\r\n"
				+ "	  geburtsjahr INT,\r\n"
				+ "	  CONSTRAINT pk_id PRIMARY KEY (id) )";
		
		Statement stm = con.createStatement();
		
		
		
		try {
			stm.executeUpdate(sql);

		} catch (SQLException e) {
			if(e.getSQLState().equals("X0Y32")) {
				System.out.println("----------------------------Tabelle war schon vorhanden");
			} else {
				throw e;
			}
		}
	
		stm.close();
		/**
		 * Erzeugen einer Tabelle ENDE
		 */
		
		/**
		 * Einfügen von Daten in die Tabelle ANFANG
		 */
		sql = "INSERT INTO personen (vorname,nachname,geburtsjahr) VALUES (?,?,?)";
		PreparedStatement prep = con.prepareStatement(sql); 
		
		prep.setString(1, "Hildegard");
		prep.setString(2, "Schnupf");
		prep.setInt(3, 1965);
		prep.executeUpdate();
		
		/**
		 * Es ist ein fehler aufgetreten
		 */
		System.out.println("Simulierter Fehler Rollback wird durchgeführt.");
		con.rollback();
		System.out.println("Beendet");
		System.exit(0);
		
		prep.setString(1, "Fred");
		prep.setString(2, "Feuerstein");
		prep.setInt(3, 1948);
		prep.executeUpdate();
		prep.close();
		/**
		 * Einfügen von Daten in die Tabelle ENDE
		 */
				
		/**
		 * Die Transaction ist beendet
		 */
		con.commit();
		
		/**
		 * Ausgeben der Daten
		 */
		try (Statement stmRead = con.createStatement()) {
			System.out.println("Ausgeben der Daten");
			stmRead.execute("SELECT * FROM personen");
			try (ResultSet res = stmRead.getResultSet()) {
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
	}

}
