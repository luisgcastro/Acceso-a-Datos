package FicherosPractica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Fichero {

    String nombreFichero = null;
    ArrayList<Empleado> list;
	private int nombre;
    //PrintWriter ficheroSalida;
    //BufferReader ficheroEntrada;

    public Fichero() {

    }

    public void guardarLista(String nombreFichero, ArrayList<Empleado> lista) {
        try {
            PrintWriter fichSalida = new PrintWriter(nombreFichero);

            for (int empleado = 0; empleado < lista.size(); empleado++) {
                String nom = lista.get(nombre).getNombre();
                int id = lista.get(nombre).getId();
           

                fichSalida.println(nom + "-" + id + "-");
            }
            fichSalida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cargarLista(String nombreFichero, ArrayList<Empleado> lista) {
        if (new File(nombreFichero).exists()) {

            try {
                BufferedReader miFichero = new BufferedReader(
                        new FileReader(
                                new File(nombreFichero)));
                String linea;

                do {
                    linea = miFichero.readLine();
                    if (linea != null) {
                        //System.out.println(linea);

                        //String cadena = "Esto es una prueba.";
                        String[] campos = linea.split("-");
                        for (String campo : campos) {
                            Empleado miEmpleado = new Empleado();
                            
                            lista.add(miEmpleado);
                        }
                    }
                } while (linea != null);
                miFichero.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No existe ese fichero.");
        }
    }

}