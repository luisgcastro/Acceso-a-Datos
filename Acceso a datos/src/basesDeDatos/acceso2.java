package basesDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.CommunicationsException;


public class acceso2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try { 
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/ventajuegos", "root", "");
			
			Statement sentencia = conexion.createStatement();
			
			
			
			ResultSet rs = sentencia.executeQuery("SELECT count(cbarras) FROM juegos");
			System.out.println("conectado ok");
			if  (rs.next()) {
				
				System.out.println(rs.getInt(1));
				
			}
			
			rs.close(); 
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

