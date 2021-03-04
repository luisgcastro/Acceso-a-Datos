package PruebaExamen;

import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Calendar micalendar = Calendar.getInstance();
		Scanner miScanner = new Scanner(System.in);
		System.out.println("Introduce tu DNI: ");
		String dniIntroducido = miScanner.nextLine();
		
		
		GestorMySQL _gestorMySQL = new GestorMySQL("localhost", "fichajes", "root", "Sismed08", true);
		
		String dniString = null;
		String queryString = "Insert into personas (DNI, FECHA) VALUES('"+dniString+"', '2011-11-11')";
		
		try {
			_gestorMySQL.ejecutarQueryDeModificacionDeRegistros(queryString);
			ResultSet resultadoResultSet = _gestorMySQL.ejecutarQueryConsulta(GetFormated_MySQLQuery.getALLRegisters("personas"));
			
			ImprimirResultSet _impresoraImprimirResultSet = new ImprimirResultSet(resultadoResultSet, false);
			
		}catch (Exception e) {
			e.printStackTrace();
		
		
		}
	
	}

}
