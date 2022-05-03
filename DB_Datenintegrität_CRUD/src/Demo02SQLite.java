import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class Demo02SQLite {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:sqlite:./DB/Mitarbeiter.db";

		/**
		 * Verbindung aufbauen
		 */
		Connection con = DriverManager.getConnection(url);

		/**
		 * Tabelle erzeugen
		 */
		String createTable = "CREATE TABLE IF NOT EXISTS \"mitarbeiter\" (\r\n"
				+ "	\"id\"	INTEGER,\r\n" + "	\"vorname\"	TEXT,\r\n"
				+ "	\"nachname\"	TEXT,\r\n"
				+ "	PRIMARY KEY(\"id\" AUTOINCREMENT)\r\n" + ");";

		Statement stm = con.createStatement();
		stm.execute(createTable);

		/**
		 * Daten Einfügen
		 */
//		createDatas(con);

		/**
		 * Daten Manipulieren - UPDATE
		 */
//		transactionWithoutRollback(con);
		transactionWithRollback(con);

		/**
		 * Daten Auslesen
		 */
		readDatas(con);

		System.out.println("Programm beendet");
	}

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
	private static void transactionWithRollback(Connection con) {
		try {
			/**
			 * Ab hier beginnt die Transaction
			 * 
			 * AutoCommit ist per standard "true"
			 * 
			 * Wenn autoCommit auf false gesetzt wird, soll eine Transaction
			 * eingeleitet werden, welche den ACID regeln folgt.
			 */
			con.setAutoCommit(false);
			String sql = "UPDATE mitarbeiter SET vorname = ? WHERE id = ?";

			PreparedStatement prep = con.prepareStatement(sql);

			Savepoint sp = con.setSavepoint();

			prep.setString(1, "Klaus");
			prep.setInt(2, 1);
			int rowAffected = prep.executeUpdate();
			System.out.println(rowAffected + " : rows affected");

			if (rowAffected == 1) {
				sp = con.setSavepoint();
			} else {
				con.rollback(sp);
			}

			prep.setString(1, "Vorname2");
			prep.setInt(2, 10);
			rowAffected = prep.executeUpdate();
			System.out.println(rowAffected + " rows affected");

			if (rowAffected == 1) {
				sp = con.setSavepoint();
			} else {
				con.rollback(sp);
			}

			// Wenn autocommit auf false ist
			// muss commit() ausgefuehrt werden
			/**
			 * Hier endet die Transaction
			 */
			con.commit();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Daten Manipulieren - UPDATE
	 */
	private static void transactionWithoutRollback(Connection con)
			throws SQLException {

		String sql = "UPDATE mitarbeiter SET vorname = ? WHERE id = ?";

		PreparedStatement prep = con.prepareStatement(sql);

		prep.setString(1, "Klaus");
		prep.setInt(2, 1);
		int rowAffected = prep.executeUpdate();
		System.out.println(rowAffected + " : rows affected");

		/**
		 * Auweia - Nun wird ein Fehler entstehen
		 * 
		 * ID 42 existiert nicht.
		 */
		prep.setString(1, "Julia");
		prep.setInt(2, 10);
		rowAffected = prep.executeUpdate();
		System.out.println(rowAffected + " : rows affected");

	}

	private static void readDatas(Connection con) {
		try (Statement stm = con.createStatement()) {
			System.out.println("Ausgeben der Daten");
			stm.execute("SELECT * FROM mitarbeiter");
			try (ResultSet res = stm.getResultSet()) {
				System.out.printf(" id | %12s | %12s | %n", "vorname",
						"nachname");
				while (res.next()) {
					System.out.printf("%3d | %12s | %12s | %n", res.getInt(1),
							res.getString(2), res.getString(3));
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Daten Einfügen
	 * 
	 * @throws SQLException
	 */
	private static void createDatas(Connection con) throws SQLException {

		String sql = "INSERT INTO mitarbeiter (vorname,nachname) values(?,?)";

		PreparedStatement prep = con.prepareStatement(sql);

		prep.setString(1, "Mark");
		prep.setString(2, "Twain");
		prep.executeUpdate();

		prep.setString(1, "Hildegard");
		prep.setString(2, "Schnupf");
		prep.executeUpdate();

		prep.setString(1, "Maria");
		prep.setString(2, "Musterfrau");
		prep.executeUpdate();
	}
}
