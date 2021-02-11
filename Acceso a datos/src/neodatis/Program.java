package neodatis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Program {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int opcion = -1;
		do {
			try {
				System.out.println("--------------");
				System.out.println("1. Insertar\n2. Media de tema\n3.Eliminar duplicados\n0. Salir\n------------------------");
				System.out.println("Selecciona una opción: ");
				opcion = Integer.parseInt(br.readLine());
				switch (opcion) {
				case 1:
					Metodos.insertar();
				break;
				case 2:
					//Consultas.media_tema();
					break;
				case 3:
					//Consultas.eliminar_duplicados();
					break;
				}
				
				if (opcion < 0 || opcion >3) {
					System.out.println("-------------------");
					System.out.println("ERROR AL SELCCIONAR UNA OPCION INEXISTENTE!");
					
					System.out.println("--------------------");
					
				}
				
			} catch (IOException e) {
				System.out.println("Introduce un numero!");
			} catch (NumberFormatException ex) {
				System.out.println("ERROR! Introduce una opcion valida!");
				
			}
		}while (opcion != 0);
		System.out.println("---------------");
		System.out.println("Gracias por utilizar el programa!");
		System.out.println("---------------");
				
		
		}

	

}
