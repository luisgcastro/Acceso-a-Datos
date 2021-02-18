package PruebaSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conmysql {

	public static void main(String[] args) {

		Connection conexion = null;
		Statement sentenciaSQL = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");

			conexion = DriverManager.getConnection("jdbc:mysql://hl192.dinaserver.com/cfgsl_2dam", "cfgsl_2damfeb",
					"morcilla1");

			sentenciaSQL = conexion.createStatement();

			ResultSet result = sentenciaSQL.executeQuery("SELECT count(*) FROM peliculas");
			
			if (result.next()) {
				// Si hay resultados obtengo el valor.
				System.out.println("Hay " + result.getInt(1) + " registros");
			} else {
				System.out.println("La tabla películas no tiene registros");
			}

		} catch (ClassNotFoundException cn) {
			cn.printStackTrace();
		} catch (SQLException ex) {
			Logger.getLogger(conmysql.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			try {
				sentenciaSQL.close();
				conexion.close();
			} catch (SQLException ex) {
				System.out.println("Eeerrorrr");
			}
		}
	}

}