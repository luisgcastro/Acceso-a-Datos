package zoo;

public class Animal {
	
	private String nombre;
	private String especie;
	private String madre;
	private String padre;
	public Animal(String nombre, String especie, String madre, String padre) {
		super();
		this.nombre = nombre;
		this.especie = especie;
		this.madre = madre;
		this.padre = padre;
	}
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getMadre() {
		return madre;
	}
	public void setMadre(String madre) {
		this.madre = madre;
	}
	public String getPadre() {
		return padre;
	}
	public void setPadre(String padre) {
		this.padre = padre;
	}
	
	public boolean esHijo(String progenitor) {
		
		boolean resultado = false;
		
		if(progenitor.equals(madre) || progenitor.equals(padre)) {
		resultado=true;
		
		}
		
		
		
		return	resultado;
			
		
		
	}
	

}
