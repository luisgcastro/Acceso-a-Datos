package acceso;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.Scanner;

public class acceso {

	public static void main(String[] args) {
		String asignatura;
		int sumaNotas=0;
		int totalNotas=0;

		try {
			File fXmlFile = new File("datos.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Introduce la asignatura (PSP,AD,PM)");
			asignatura=sc.nextLine();

			// Solo hay que normalizar si en la estructura del xml faltan nodos o algunos
			// están vacíos
			doc.getDocumentElement().normalize();

			// Mostramos el elemto raiz
			System.out.println("Elemento raíz :" + doc.getDocumentElement().getNodeName());

			// Obtenemos todas las pelis
			NodeList nList = doc.getElementsByTagName("alumno");
			System.out.println("----------------------------");

			// Recorremos las pelis
			for (int temp = 0; temp < nList.getLength(); temp++) {

				// Seleccionamos un nodo
				Node nNode = nList.item(temp);
				System.out.println("\nElemento actual :" + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;

					// Imprimimos los datos
					System.out.println("Nombre: " + eElement.getAttribute("nombre"));
					System.out.println("PSP: " + eElement.getElementsByTagName("PSP").item(0).getTextContent());
					System.out.println("PM: " + eElement.getElementsByTagName("PM").item(0).getTextContent());
					System.out.println("AD: " + eElement.getElementsByTagName("AD").item(0).getTextContent());
					
					switch (asignatura) {
					case "PSP":
						sumaNotas=sumaNotas + Integer.parseInt(eElement.getElementsByTagName("PSP").item(0).getTextContent());
						break;
					case "PM":
						sumaNotas=sumaNotas + Integer.parseInt(eElement.getElementsByTagName("PM").item(0).getTextContent());
						break;
					case "AD":
						sumaNotas=sumaNotas + Integer.parseInt(eElement.getElementsByTagName("AD").item(0).getTextContent());
						break;	
					}
					
					
					
					totalNotas++;
				}
				
								
			}
			
			System.out.println("La nota media de " + asignatura + " es: " + (sumaNotas/totalNotas));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
