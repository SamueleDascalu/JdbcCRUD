import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe per operazioni CRUD (Create/Read/Update/Delete) sul database, invio di
 * comandi SQL con invio dei comandi SQL
 * 
 * @author Angelo Pasquarelli
 *
 */

public class JdbcCrud {

	public static void main(String[] args) {

		// Connessione al database
		String databaseName = "magazzino"; // nome del database a cui connettersi
		String dbmsUserName = "root"; // nome utente configurato nel dbms
		String dbmsPassword = ""; // password utente configurato nel dbms
		String jdbcUrl = "jdbc:mariadb://localhost:3306/" + databaseName;

		try {

			Connection jdbcConnectionToDatabase = DriverManager.getConnection(jdbcUrl, dbmsUserName, dbmsPassword);

			System.out.println("Connessione al database magazzino riuscita!");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}