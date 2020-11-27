package actividad111;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.io.Writer;

public class Registro {
	private int Id;
	private String nombre;

	public Registro(int Id, String nombre) {
// TODO Auto-generated constructor stub
		this.Id = Id;
		this.nombre = nombre;

	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String cadena, String nombre) {
		this.nombre = nombre;
	}

}
