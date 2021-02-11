package neodatis;

import java.util.Date;
import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import neodatis.Alumno;

public class Metodos {
	
	public static boolean insertar() {
		boolean insertado = false;
		ODB odb = null;
		try {
			
			odb = ODBFactory.open("neodatis.test");
			
			Alumno alumno = crear_Alumno();
			
			odb.store(alumno);
			insertado = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (odb != null) {
				
				odb.close();
			}
		}
		return insertado;
	}
		
	public static Alumno crear_Alumno() {
		
		
	}

}
