package FicherosPractica;

public class Empleado {
    private String nombre;
    private int id;
   
    
    //CONSTRUCTOR VACIO
    public Empleado(){
        
    }
    //CONSTRUCTOR que pide todos los datos
    public Empleado(String titulo,int id, String nombre
           ){
        this.nombre=nombre;
        this.id=id;
        
    }
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    
    //gets y sets
    
}
   