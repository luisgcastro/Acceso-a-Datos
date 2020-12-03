package basesDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.CommunicationsException;


public class acceso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try { 
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conexion = DriverManager.getConnection("jdbc:mysql://hl192.dinaserver.com/cfgsl_ejad", "cfgsl_adminejad", "quesitos01");
			
			Statement sentencia = conexion.createStatement();
			
			
			String sql = "SELECT * FROM juegos";
			ResultSet result = sentencia.executeQuery(sql);
			System.out.println("conectado ok");
			while (result.next()) {
				
				System.out.println("ID: " + result.getString("idjuego") + " \n " + result.getString("juego"));
				
			}
			
			result.close(); 
			sentencia.close();
			conexion.close();
			
			
			
			System.out.println("desconectado ok");
		} catch (ClassNotFoundException cn) {
			cn.printStackTrace();
		}catch (CommunicationsException cn) {
			System.out.println("No hay conexion con la BD");
		} catch (SQLException e) {
			e.printStackTrace();
			
		
		} finally {
			
		}
	
		
	}

}
