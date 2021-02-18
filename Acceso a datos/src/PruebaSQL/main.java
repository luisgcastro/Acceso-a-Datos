package PruebaSQL;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ManageMySQLConection conexion = new ManageMySQLConection();
		
		if(conexion.abrirConexionMySQL()) {
			System.out.println("conectado");
		}

	}

}
