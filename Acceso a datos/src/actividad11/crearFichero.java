package actividad11;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class crearFichero {

public crearFichero() {

    RandomAccessFile raf = null;

    try {

        File fichero = new File("fichero.obj");

        raf = new RandomAccessFile(fichero, "rw");

        a�adirNumerosAlPrincipio(raf);

    } catch (Exception e) {

        System.out.println(e.getMessage());

    } finally {

        try {

            if (raf != null) {

                raf.close();

            }

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }



}

private void a�adirNumerosAlPrincipio(RandomAccessFile raf) {
	// TODO Auto-generated method stub
	
}

public static void a�adirNumenosAlPrincipio(RandomAccessFile raf) throws Exception {

    Scanner teclado = new Scanner(System.in);

    double numero;

    System.out.println("Introduce un numero Double para añadir al principio del fichero: ");

    numero = teclado.nextDouble();

    raf.seek(0);

    raf.writeDouble(numero);



}

}
