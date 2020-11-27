package actividad1valida;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Empleado
{
    private String nombre;
    private int id;
    
    public Empleado(String nombre,
        int id)
    {
        this.nombre = nombre;
        this.id = id;
    }
    
    public String getNombre() { return nombre; }
    public int getId() { return id; }
}



public class GestionEmpleados
{
   

	public static void guardarEmpleados(
            ArrayList<Empleado> listaEmpleados)
    {

        try{
            PrintWriter fichero = new PrintWriter("empleados.txt");
        for(int posicionempleado = 0; posicionempleado < listaEmpleados.size();
                posicionempleado++){
            fichero.print(listaEmpleados.get(posicionempleado).getNombre()+",");
            fichero.print(listaEmpleados.get(posicionempleado).getId()+",");
     
        }
        fichero.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    
  



	public static void buscar(ArrayList<Empleado> lista){
        Scanner entrada = new Scanner(System.in);
        int posicionEmpleado = 0;
        System.out.println("Introduce el nombre a buscar");
        String nombre = entrada.nextLine();
        for(Empleado empleado : lista){
            if( ! empleado.getNombre().equals(nombre)){
                int posicionNombre = 0;
				posicionNombre++;
            }
            else{
                break;
            }
        }
        if(posicionEmpleado==lista.size()){
            System.out.println("Nombre no encontrado.");
        }
        else{
            System.out.println("Nombre: "+lista.get(posicionEmpleado).getNombre());
            System.out.println("Año: "+lista.get(posicionEmpleado).getId());
        }
        
    }
    
    public static void modificar(String nombre, int id, ArrayList<Empleado>lista){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quieres modificar algun empleado? S / N: ");
        String opcion = teclado.nextLine().toUpperCase();
        
        if(opcion.equals("S")){
            //nombre =
            String texto;
            int newId=0;
            System.out.println("Nombre o intro para continuar: "+ nombre);
            texto = teclado.nextLine();
            if( ! texto.equals("")){
                nombre= texto;
            }
            
           
    
            System.out.println("Id o intro para continuar: "+ id);
            texto = teclado.nextLine();
            if( ! texto.equals("")){
            	id= newId;
               
            }
            
          
  
        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int opcion;

        List<Empleado> listaDeEmpleados = new ArrayList();
        
        
        System.out.println("Bienvenido!");
        
        do
        {
            System.out.println("1. Añadir un nuevo empleado");
            System.out.println("2. Modificar un empleado");
            System.out.println("3. Buscar un empleado");
            opcion = sc.nextInt();
            
            switch(opcion)
            {
                case 1:
                    String nuevoEmpleado;
                    int nuevoAño;
                    
                    do
                    {
                        System.out.println("Introduce el nombre: ");
                        nuevoEmpleado = sc.nextLine();
                   
     
                        System.out.println("Introduce su ID:");
                        nuevoAño = sc.nextInt();

                        if ( ! nuevoEmpleado.equals("") )
                        {
                           Empleado empleado = new Empleado(nuevoEmpleado, 
                              
                             nuevoAño);
                        }
                        else
                            System.out.println("Introduzca un nombre valido");
                    }
                    while( nuevoEmpleado.equals("") );
                    
                    break;
                    
                case 2:
                    
                    //modificar();
                    break;
                    
                case 3:
                    break;
            }
            
        }
        while( opcion != 0 );
    }
    
}
