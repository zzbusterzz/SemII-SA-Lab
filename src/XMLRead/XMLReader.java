/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XMLRead;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author 1
 */
public class XMLReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            File file = new File("C:\\Users\\1\\Desktop\\XMLReader.xml");            
            Document doc =  DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
            doc.getDocumentElement().normalize();
            
            NodeList nodelist = doc.getElementsByTagName("student");
            
            for(int i = 0; i < nodelist.getLength(); i++){
                Node node = nodelist.item(i);  
                System.out.println("\nNode Name :" + node.getNodeName());  
                if (node.getNodeType() == Node.ELEMENT_NODE)   
                {  
                    Element eElement = (Element) node;  
                    System.out.println("Student id: "+ eElement.getElementsByTagName("id").item(0).getTextContent());  
                    System.out.println("First Name: "+ eElement.getElementsByTagName("firstname").item(0).getTextContent());  
                    System.out.println("Last Name: "+ eElement.getElementsByTagName("lastname").item(0).getTextContent());  
                    System.out.println("Subject: "+ eElement.getElementsByTagName("subject").item(0).getTextContent());  
                    System.out.println("Marks: "+ eElement.getElementsByTagName("marks").item(0).getTextContent());  
                }  
            }
            
        }catch(Exception ex){
            
        }
    }
    
}
