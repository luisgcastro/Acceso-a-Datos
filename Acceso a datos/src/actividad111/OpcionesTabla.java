package actividad111;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class OpcionesTabla {

	RandomAccessFile AccAletorio;

	public void ConsultarEmpleado(int Id, File f) throws IOException {
		AccAletorio = new RandomAccessFile(f, "r");

		boolean CompruebaExisteEmpleado = false;

		int contador = 0;

		String NombreEmpleadoCompleto = "";

		if (f != null) {
			do {

				if (AccAletorio.readInt() == Id) {

					for (int i = 0; i < 10; i++) {
						NombreEmpleadoCompleto += AccAletorio.readChar();
					}


					System.out.println("-EMPLEADO: " + NombreEmpleadoCompleto);
					CompruebaExisteEmpleado = true;
				}

				contador += 36;
				AccAletorio.seek(contador);

			} while (contador < f.length());

			if (CompruebaExisteEmpleado == false)
				System.out.println("NO EXISTE EL ID DEL EMPLEADO");

		} else {
			System.out.println("EL FICHERO NO EXISTE, NO APUNTA A NINGUN OBJETO FILE");
		}

	}

	public void ModificarNombre(int Id, File f, String nombreString) throws IOException {

		AccAletorio = new RandomAccessFile(f, "rw");

		boolean CompruebaExisteEmpleado = false;

		int contador = 0;

		if (f != null && Integer.toString(Id).length() == 4) {
			do {

				if (AccAletorio.readInt() == Id) {
					AccAletorio.seek(AccAletorio.getFilePointer() + 20);
					AccAletorio.writeInt(Id);

					CompruebaExisteEmpleado = true;
				}

				contador += 36;

				AccAletorio.seek(contador);

			} while (contador < f.length());

			if (CompruebaExisteEmpleado == false)
				System.out.println("NO EXISTE EL ID DEL EMPLEADO, NO SE A PODIDO MODIFICAR NADA");

		} else {
			System.out.println("EL FICHERO NO EXISTE o El numero de departamento No ocupa 4 bytes");
		}

		AccAletorio.close();
	}

}
