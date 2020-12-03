package basesDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.Scanner;
import java.util.logging.*;
import java.util.Scanner;

public class conmysql {
	
	public static void main(String[] args) {
		int result=0;
		Connection conexion = null;
		Statement sentenciaSQL = null;
		
		try { 
			String cbarras;
			String Juego;
			String Desarrolladora;
			
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("Pon el cbarras");
			cbarras=sc.nextLine();
			System.out.println("Pon el juego");
			Juego=sc.nextLine();
			System.out.println("Pon la Desarrolladora");
			Desarrolladora=sc.nextLine();
			
			
			
			
			
			
			
			
			Class.forName("com.mysql.jdbc.Driver");
			
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/ventajuegos", "root", "");
			
			
			
			sentenciaSQL = conexion.createStatement();
			
			//String sql = "Insert into juegos (juego, desarrolladora, cbarras) values ('test', 'testd', '123')";
			String sql = "Insert into juegos (juego, desarrolladora, cbarras) values ('NULL', '"+cbarras+"', '"+Juego+"', '"+Desarrolladora+"')";
			
			result = sentenciaSQL.executeUpdate(sql);
			System.out.println("\n" + sql + "\n");
			if (result >= 1) {
				System.out.println("Se ha insertado bien");
				
			}
			
			sentenciaSQL.close();
			conexion.close();
			
		}catch (ClassNotFoundException cn) {
			cn.printStackTrace();
		}catch (SQLException ex) {
			Logger.getLogger(conmysql.class.getName()).log(Level.SEVERE, null, ex);
		}finally {
			try {
				sentenciaSQL.close();
				conexion.close();
			}catch (SQLException ex) {
				System.out.println("Error");
			}
			
		}
	

}
}