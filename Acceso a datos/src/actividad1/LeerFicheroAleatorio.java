package actividad1;


import java.io.*;
import java.util.Scanner;


public class LeerFicheroAleatorio {

	public static void main(String[] args) throws IOException {
		File fichero = new File("AleatorioEmpleados.dat");
		
		Scanner sc = new Scanner(System.in);                                                                      
        FileOutputStream fos = null;
        DataOutputStream salida = null;
        int n;
		
		try {
			
		RandomAccessFile file = new RandomAccessFile(fichero, "r");
		
		int id, posicion;
		String nombre = new String(), aux;
		
		posicion=0;
		
		for(;;) {
			file.seek(posicion);
			id=file.readInt();
					for (int i = 0; i < nombre.length(); i++) {
						aux = file.readLine();
						nombre = aux;
					}
			
			System.out.println("ID; " + id + "Nombre: "+ nombre);
			
			posicion= posicion + 36;
			
			if (file.getFilePointer()==file.length())break;
			
	}
		} catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());                                                               
            }
	
			
				


        }
	}
	
}


