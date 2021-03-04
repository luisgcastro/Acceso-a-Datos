package PruebaExamen;

import java.sql.*;
import java.util.Calendar;

public class operaciones {
	
	Connection mi_conexion = null;
	PreparedStatement mi_preparedStatement = null;
	
	private static Connection getConnection() {
        String sURL = "jdbc:mysql://localhost:3306/ficha";
        String user = "root";
        String pass = "";
        try {
            return DriverManager.getConnection(sURL, user, pass);
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return null;}
	
//	public operaciones() {
//		
//		try {
//			
//			mi_conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ficha", "root", "");
//			mi_preparedStatement = mi_conexion.prepareStatement("INSERT INTO ficha (dni, fecha)(?,?)");
//			
//		} catch (SQLException e) {e.printStackTrace();}
//		
//	}
//	
	public void introduce_registro(String dni, Date fecha) {
		//PreparedStatement mi_preparedStatement
		
		
		try {
			
			//if (!comprueba_dni_cliente(datos[0]))
			
			
			//mi_preparedStatement = mi_conexion.prepareStatement(INSERT INTO cliente VALUES (?,?,?,?,?,?,?,?)");
			mi_preparedStatement.setString(1, dni);
			mi_preparedStatement.setDate(2, fecha);
			
			int filas = mi_preparedStatement.executeUpdate();
			System.out.println("filas afectadas: "+filas);
			//}
			/*else {
			 * 
			 * System.out.println("Clave primaria duplicada");
			 * JOptionPane.showMessageDialog(mi_panel, "Revise el formulario, clave primaria duplicada!!");
			 * 
			 * 
			 }*/
			
		} catch (SQLIntegrityConstraintViolationException ivae) {
			
			System.out.println("Clave primaria duplicada");
			//JOptionPane.showMessageDialog(mi_panel, "Revise el formulario, clave primaria duplicada!!");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}

}
