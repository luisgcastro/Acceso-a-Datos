package PruebaSQL;

import java.sql.*;

public class Prueba2 {
	
	public static void main(String [] args) {
		
		Connection conexion = null;
		Statement sentencia = null;
		ResultSet resultado = null;
		
		
		try {
			// Cargamos el driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//establecemos la conexion url, user, password 
			conexion = DriverManager.getConnection("jdbc:mysql://hl192.dinaserver.com/cfgsl_2dam", "cfgsl_2damfeb" , "morcilla1");
			
			//preparamos la consulta 
			sentencia = conexion.createStatement();
			
			resultado = sentencia.executeQuery("SELECT count(id) FROM peliculas");
			
			if(resultado.next()) {
				
				System.out.println(resultado.getInt(1));
			}
			
		} catch (Exception e) {
			
		} finally {
			
			try {
				resultado.close();
				sentencia.close();
				conexion.close();
				System.out.println("desconectado ok");
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	

}
