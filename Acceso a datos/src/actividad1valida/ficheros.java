package actividad1valida;


import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class ficheros  {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion = "", opcion2 = "", nombre, genero, anyo,
                plataforma, resumen, coincidencia;
        ArrayList datos = new ArrayList();
        do {
            System.out.println(); 
            System.out.println("Menú del control de empleados.");
            System.out.println("1.- Añadir empleado.");
            System.out.println("2.- Buscar empleado.");
            System.out.println("3.- Modificar empleado.");
            System.out.println("0.- Salir");
            System.out.println(); 
            System.out.println("Inserte una opción: ");
            opcion = sc.next();

            switch (opcion) {
                case "1":
                    //añadirDatos(datos);
                    break;
                case "2":
                    buscar();
                    break;
                case "3":
                    System.out.println("Inserte el nombre del empleado a modificar: ");
                    coincidencia = sc.next();
                    // for(int contador = 0; contador< )
                    break;
            }
        } while (!opcion.equals("0"));

    }

   public static void añadirDatos(String[] datos) {
        if (!(new File("empleados.dat")).exists()) {
            System.out.println("Fichero no encontrado.");
        } else {
            Scanner sc = new Scanner(System.in);

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("ID: ");
            String id = sc.nextLine();

         
            System.out.print("Resumen: ");
            String resumen = sc.nextLine();

            datos[0] = nombre;
            datos[1] = id;
            datos[2] = resumen;

        }
    }

   public static void actualizarFichero(ArrayList datos) {
        try {

            PrintWriter ficheroSalida = new PrintWriter("empleados.dat");
            for (int contador = 0; contador < datos.size(); contador++) {
                    System.out.println(datos.indexOf(0) + "//"+ datos.indexOf(1) +
                            "//" + datos.indexOf(2) + "//"+ datos.indexOf(3) + 
                            "//" + datos.indexOf(4));
                }
                
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void modificar(ArrayList datos) {
        if (!(new File("empleados.dat")).exists()) {
            System.out.println("Fichero no encontrado.");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Titulo a modificar: ");
            String nombre = sc.nextLine();

            for (int i = 0; i < datos.size(); i++) {
                // if ( datos.indexOf(i)[0].equals(nombre) ) {

            }
        }

        try {
            PrintWriter fichero = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter("empleados.dat", true)));

            //fichero.println(registro);
            fichero.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void buscar()
    {
        Scanner sc = new Scanner(System.in);
       
        if ( ! (new File("empleados.dat")).exists() ) {
            System.out.println("No se ha encontrado el fichero");
            return;
        }
       
        try {
            BufferedReader ficheroEntrada = new BufferedReader(
                new FileReader(new File("empleados.dat")));
           
            System.out.println("Selecciona la búsqueda por nombre (N) " +
                    "o por id (I)");
            char opcion = sc.next().charAt(0);
            String linea;
           
            switch (opcion) {
                case 'N':
                case 'I':
                    System.out.println("Introduce el nombre del empleado: ");
                    String nombre = sc.nextLine();
                   
                    linea = ficheroEntrada.readLine();
                    do {                        
                        if (linea.contains(nombre)) {
                            String[] datosNombre = linea.split("//");
                            System.out.println("El empleado es: ");
                            System.out.println("Nombre: " + datosNombre[0]);
                            System.out.println("ID: " + datosNombre[1]);
                            System.out.println("Resumen: " + datosNombre[2]);                          
                        }
                    }
                    while (linea != null);                    
                    break;
                   
                case 'a':
                case 'A':
                    System.out.println("Introduce el ID del empleado: ");    
                    String id = sc.nextLine();
                   
                    linea = ficheroEntrada.readLine();
                    do {                        
                        if (linea.contains(id)) {
                            String[] datosId = linea.split("//");
                            System.out.println("El empleado es: ");
                            System.out.println("Nombre: " + datosId[0]);
                            System.out.println("ID: " + datosId[1]);
                            System.out.println("Resumen: " + datosId[2]);
                        }
                    }
                    while (linea != null);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
        catch (IOException e) {
            System.out.println("Ha habido un error");
        }
    }
}
