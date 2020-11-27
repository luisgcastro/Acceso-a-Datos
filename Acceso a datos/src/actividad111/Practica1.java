package actividad111;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Practica1 {

	private static DataOutputStream StreamSalida;

	static Registro[] ListaRegistros = new Registro[4];

	public static void main(String[] args) throws IOException {
		

		Registro r0 = new Registro(1111, "Jose Antonio");
		Registro r1 = new Registro(2222, "Juan Antonio");
		Registro r2 = new Registro(3333, "David Fernandez");
		Registro r3 = new Registro(4444, "Jose David");

		ListaRegistros[0] = r0;
		ListaRegistros[1] = r1;
		ListaRegistros[2] = r2;
		ListaRegistros[3] = r3;

		OpcionesTabla opciones = new OpcionesTabla();

		File FicheroEmpleados = new File("emple_aleat.dat");

		try {

			StreamSalida = new DataOutputStream(new FileOutputStream("emple_aleat.dat"));

		} catch (FileNotFoundException e) {
// TODO Auto-generated catch block
			System.err.println("ERROR AL CREAR EL DATAOUTPUT");
		}


		for (int i = 0; i < 4; i++) {

			StreamSalida.writeInt(ListaRegistros[i].getId());

			StreamSalida.write(ListaRegistros[i].getnombre().getBytes("UTF-16BE"));

			System.out.println("Registros " + i + "\t" + "ID: " + ListaRegistros[i].getId() + ", "
					+ Integer.toString(ListaRegistros[i].getId()).length() + " bytes" + "\t" + "NOMBRE: "
					+ ListaRegistros[i].getnombre() + ", " + ListaRegistros[i].getnombre().length() + " bytes" + "\t"
		            + "TOTAL BYTES " + FicheroEmpleados.length());

		}

		System.out.println("\n" + "TOTAL DE BITES DEL FICHERO: " + FicheroEmpleados.length() + "\n");

		StreamSalida.close();

		System.out.println("DATOS SIN MODIFICACIONES:");
		opciones.ConsultarEmpleado(1111, FicheroEmpleados);
		opciones.ConsultarEmpleado(2222, FicheroEmpleados);
		opciones.ConsultarEmpleado(3333, FicheroEmpleados);
		opciones.ConsultarEmpleado(4444, FicheroEmpleados);



		System.out.println("---> DATOS MODIFICADOS:");
		opciones.ConsultarEmpleado(1111, FicheroEmpleados);
		opciones.ConsultarEmpleado(2222, FicheroEmpleados);
		opciones.ConsultarEmpleado(3333, FicheroEmpleados);
		opciones.ConsultarEmpleado(4444, FicheroEmpleados);

	}
}
