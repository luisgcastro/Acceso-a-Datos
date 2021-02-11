//package primeraClase;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.RandomAccessFile;
//import java.util.Scanner;
//
//
//
//public class PrimeraClase {
//
//	public static void main(String[] args) {
//		//genera o abre un fichero y busca una palabra que se pasa a mayusculas
//		
//		long pos = 0;
//		int indice;
//		
//		
//		
//		RandomAccessFile fichero = null;
//		String palabra, cadena;
//		StringBuilder auxBuilder;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		
//		try {
//			
//			fichero = new RandomAccessFile("datos/texto.txt","rw");
//			
//			System.out.print("Introduce palabra: ");
//			palabra = sc.nextLine();
//			
//			cadena = fichero.readLine();
//			
//			while (cadena != null) {
//				
//				indice = cadena.indexOf(palabra);
//				
//				while (indice != -1) {
//					
//					auxBuilder = new StringBuilder(cadena);
//					auxBuilder.replace(indice, indice + palabra.length(),
//							
//							palabra.toUpperCase());
//					
//					cadena = auxBuilder.toString();
//					
//					fichero.seek(pos);
//					fichero.writeBytes(cadena);
//					
//					indice = cadena.indexOf(palabra);
//					
//				}
//				
//				pos = fichero.getFilePointer();
//				
//				cadena = fichero.readLine();
//				
//			}
//			
//		} catch (FileNotFoundException ex) {
//			System.out.println(ex.getMessage());
//		} catch (IOException ex) {
//			System.out.println(ex.getMessage());
//		} finally {
//			
//			try {
//				if (fichero != null) {
//					fichero.close();
//				}
//				
//			}catch (IOException e) {
//				System.out.println(e.getMessage());
//			}
//		}
//		
//	}
//	
//}
//	
//				
//				
//					
//					
//					
//					
//					
//		
//				
//			
//			
//			
//			
//			
//		
//		
//		
//		

	


