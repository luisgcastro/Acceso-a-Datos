package menu;


import java.sql.*;
import java.io.*;
import java.net.*;
import java.util.*;


public class menu {

	public static void main(String[] args) {
		ArrayList<String> _menuImprimirArrayList = null;
		
		boolean seguir = true;
		
		int opcion = -1;
		
		do {
			opcion = -1;
			
			_menuImprimirArrayList = new ArrayList<String>();
			
			System.out.println("");
			_menuImprimirArrayList.add("Seleccione opción");
			_menuImprimirArrayList.add("1. Opción");
			_menuImprimirArrayList.add("2. Opción");
			_menuImprimirArrayList.add("3. Opción");
			_menuImprimirArrayList.add("4. Opción");
			_menuImprimirArrayList.add("5. Opción");
			System.out.println("");
			
			try {
				opcion = Integer.valueOf(new Scanner(System.in).next());
				
			}catch (NumberFormatException e) {
				opcion = -1;
			}
			
			switch (opcion) {
			case 1: System.out.println("Presionado 1"); 
	
			break;
			case 2: System.out.println("Presionado 2");
			break;
			case 3: System.out.println("Presionado 3");
			break;
			case 4: System.out.println("Presionado 4");
			break;
			case 5: System.out.println("Presionado 5");
			break;
			
		}
		
	

	}
while (true);
	}
}
