package PruebaExamen;

import java.sql.*;
import java.util.Calendar;
import java.util.Scanner;

public class main1 {
	static Connection mi_conexion = null;
	static PreparedStatement mi_preparedStatement = null;
	
	public static void main(String[] args) {
		
		boolean seguir = true;
		
		String dniString = "";
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("Inserte Dni: ");
		
		dniString = new Scanner(System.in).nextLine();
		
	try {
			
			mi_conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/personal_data", "root", "");
			mi_preparedStatement = mi_conexion.prepareStatement("INSERT INTO ficha VALUES(?,?)");
			
		} catch	(Exception e) {
			
			e.printStackTrace();
		
	}
		
		
	}

}
