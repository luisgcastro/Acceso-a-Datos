package ArrayList;


import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class repaso {
	
	public static void main(String[] args) {
		String cadena;
		FileReader fichero = null;
		BufferedReader lector = null;
		
		ArrayList<String> lines = new ArrayList<String> ();
		
		try {
			// la ruta del fichero es:
			fichero = new FileReader("nombres.txt");
			lector = new BufferedReader(fichero);
			
			
			while ((cadena = lector.readLine()) != null) {
				System.out.println(cadena);
				lines.add(cadena);
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el fichero");
		} catch (IOException e) {
			System.out.println("Hay un problema de lectura");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (lector != null) {
					lector.close();
				}
				if (fichero != null) {
					fichero.close();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("fin");
		}
	}
}