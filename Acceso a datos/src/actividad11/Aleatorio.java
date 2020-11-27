package actividad11;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.Scanner;


public class Aleatorio {

 

    public static void menu(){

        Scanner teclado = new Scanner(System.in);

        int opcion;

        do {

 

            System.out.println("1.-Añadir datos");
            System.out.println("2. Buscar");
            System.out.println("3. Modificar");
            System.out.println("4. Eliminar");
            System.out.println("5.- Salir del programa");

            opcion = teclado.nextInt();

 

            switch (opcion) {

                case 1: {

                    crearFichero();

 

                    break;

                }

                case 2: {

                    crearFichero();

 

                    break;

                }

                case 3: {

                    leerFichero();

                    break;

                }

                case 4: {

                    sustituirDoubles();

                    break;

                }

                case 5: {

                    System.out.println("Gracias por usar el programa....");

                    break;

                }

                default: {

                    System.out.println("Opcion no es correcta");

                }

            }

        } while (opcion != 5);

 

    }

	private static void sustituirDoubles() {
		// TODO Auto-generated method stub
		
	}

	private static void leerFichero() {
		// TODO Auto-generated method stub
		
	}

	private static void crearFichero() {
		// TODO Auto-generated method stub
		
	}
    
}