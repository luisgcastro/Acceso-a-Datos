package javabean;

import javabean.Peliculas;

public class UsarJb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Peliculas miPeli = new Peliculas();
		
		miPeli.setTitulo("Capitana Marvel");
		miPeli.setAno(2019);
		
		System.out.println("La pel�cula " + miPeli.getTitulo() + " es del a�o " + miPeli.getAno());
		
		
		
		
	}

}
