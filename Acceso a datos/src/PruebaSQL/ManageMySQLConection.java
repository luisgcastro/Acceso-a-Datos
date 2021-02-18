package PruebaSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ManageMySQLConection {
	
	final String origen_de_datos = "jdbc:mysql://hl192.dinaserver.com/cfgsl_2dam";
	final String user = "cfgsl_2damfeb";
	final String password = "morcilla1";
	final String tablaMySQL = "peliculas";
	
	private Connection conexion = null;
	
	public boolean abrirConexionMySQL() {
		boolean conexionEstablecida = true;
		
		try {
			//Cargar el driver JDBC
			Class.forName("com.mysql.jdbc.Driver");
			
			//Crear el objeto Connection
			conexion = DriverManager.getConnection(origen_de_datos, user, password);
		} catch (ClassNotFoundException e) {
			
			conexionEstablecida = false;
			cerrarConexion();
		}catch (SQLException e) {
			conexionEstablecida = false;
			cerrarConexion();
		}
		return conexionEstablecida;
		
	}
	
	public boolean cerrarConexion() {
		boolean conexionCerrada = true;
		try {
			if(conexion != null && !conexion.isClosed()) {
				conexion.close();
			}
		} catch (SQLException e) {
			conexionCerrada = false;
		}
		return conexionCerrada;
	}

	public Connection getConexion() {
		return this.conexion;
	}
				
	public String getNombreTabla() {
		return tablaMySQL;
	}
			


}
