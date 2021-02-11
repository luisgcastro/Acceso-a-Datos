package zoo;
 import zoo.Animal;
public class GestionZoo {
	
	public static void main(String [] args) {
		
		Animal animal1=new Animal();
		Animal animal2=new Animal("Po", "Panda", "desconocido", "Ganso");
		
		animal1.setPadre("Gansooooo");
		
		System.out.println(animal2.esHijo(animal1.getNombre()));
		
		
		
	}

}
