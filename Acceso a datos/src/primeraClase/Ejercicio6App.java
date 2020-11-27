package primeraClase;

import javax.swing.JOptionPane;
import java.io.*;
 
public class Ejercicio6App {
 
    public static void main(String[] args) {
 
        final String RUTA="D:\\vehiculos.ddr";
 
        String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
        String id=JOptionPane.showInputDialog("Introduce tu id");
       
        try(DataOutputStream dos=new DataOutputStream(new FileOutputStream(RUTA,true));
                DataInputStream dis=new DataInputStream(new FileInputStream(RUTA))){
 
            introduceDatos(dos, nombre, id);
 
            muestraDatos(dis);
        }catch(EOFException e){
 
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
 
    }
 
    public static void introduceDatos(DataOutputStream dos,
                                        String nombre,
                                        String id) throws IOException{
 
        dos.writeUTF(nombre);
        dos.writeUTF(id);
        
 
    }
 
    public static void muestraDatos(DataInputStream dis) throws IOException {
 
        //Cuando se acabe el fichero saltara la excepcion
        while(true){
            JOptionPane.showMessageDialog(null, "El nombre del usuario es: "+dis.readUTF()+
            "y su ID es: " + dis.readUTF());
        }
    }
 
}