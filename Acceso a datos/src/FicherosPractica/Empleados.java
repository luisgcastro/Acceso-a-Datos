
package FicherosPractica;

import java.util.ArrayList;
import java.util.Scanner;

public class Empleados {

    public static void main(String[] args) {
        Empleados e = new Empleados();
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        String option = "" ;
        
        do{
            MuestraMenu();
            option = sc.next();
            
            switch (option){
                case "1": 
                    e.IntroducirEmpleado(sc, listaEmpleados);
                    break;
                case "2":
                    e.BuscarEmpleado(sc, listaEmpleados);
                    break;
                case "3":
                    e.ModificarEmpleado(listaEmpleados);
                    break;
                case "4": exit = true;
                    break;
                default: System.out.println("Opción no válida");
            }
        }
        while (!exit);
    }
    
    public static void MuestraMenu(){
        System.out.println("1. Añadir empleado");
        System.out.println("2. Buscar empleado");
        System.out.println("3. Modificar empleado");
        System.out.println("4. Salir");
    }
    
    public void ModificarEmpleado(ArrayList listaEmpleados){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Nombre del empleado que quiere modificar");
        String nuevonombre = "";
        /*
        for (int i = 0; i < listaEmpleados.size() ; i++ )
        {
            if (!listaEmpleados.get(i).)
            {
            } else {
                System.out.println ("Nombre antiguo "+
                    listaEmpleados.get(i).getNommbre());
                System.out.println ("Introduzca nuevo nombre ");
                nuevonombre = teclado.next();

                listaEmpleados.get(i).setTitulo(nuevonombre);
            }
        }
        */
    }
    
    public void IntroducirEmpleado(Scanner sc, ArrayList listaEmpleados){
        System.out.println("Introduce el nombre: ");
        String nombre = sc.next();
        System.out.println("ID: ");
        int id = sc.nextInt();
       
        //Añade el empleado
        Empleado empleado = new Empleado(
                nombre, id, nombre);
        listaEmpleados.add(empleado);
        Fichero fich = new Fichero();
        fich.guardarLista("empleados.txt", listaEmpleados);
    }
    
    public void BuscarEmpleado(Scanner sc, ArrayList listaEmpleados){
        // TO DO
        
        System.out.println("Introduce el nombre: ");
        String nombre = sc.nextLine();
        /*
        for(int i = 0; i < listaEmpleados.size(); i++){
            if(empleados == listaEmpleados.get(i).toString(){
                
            }
        }
        */
    }
}