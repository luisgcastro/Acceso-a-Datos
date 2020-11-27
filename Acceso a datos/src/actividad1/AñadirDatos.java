package actividad1;
import java.io.DataOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class AñadirDatos {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FileOutputStream fos = null;
        DataOutputStream salida = null;

        String nombre = new String();
        int id;
        do{
            System.out.print("Introduce tu nombre: ");
            nombre = sc.next();
        }while(!nombre.equals(nombre));
        do{
            System.out.print("Introduce tu ID: ");
            id = sc.nextInt();
        }while(id <= 0);

        
        try {
            //crear el fichero de salida
            fos = new FileOutputStream("AleatorioEmpleados.dat");
            salida = new DataOutputStream(fos);

            salida.writeBytes(nombre);
            salida.writeInt(id);
           
           
            
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
