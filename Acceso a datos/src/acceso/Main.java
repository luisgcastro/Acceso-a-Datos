package acceso;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class Main {
	public static void main(String[] args) {

		try {
			File fXmlFile = new File("peliculas.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);

// Solo hay que normalizar si en la estructura del xml faltan nodos o algunos est�n vac�os
			doc.getDocumentElement().normalize();

// Mostramos el elemto raiz
			System.out.println("Elemento ra�z :" + doc.getDocumentElement().getNodeName());

// Obtenemos todas las pelis
			NodeList nList = doc.getElementsByTagName("peli");
			System.out.println("----------------------------");

// Recorremos las pelis
			for (int temp = 0; temp < nList.getLength(); temp++) {

// Seleccionamos un nodo
				Node nNode = nList.item(temp);
				System.out.println("\nElemento actual :" + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;

//Imprimimos los datos
					System.out.println("G�nero: " + eElement.getAttribute("genero"));
					System.out.println("T�tulo: " + eElement.getElementsByTagName("titulo").item(0).getTextContent());
					System.out.println(
							"A�o de publicaci�n: " + eElement.getElementsByTagName("ano").item(0).getTextContent());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
