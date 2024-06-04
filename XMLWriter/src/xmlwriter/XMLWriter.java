
package xmlwriter;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Element;


public class XMLWriter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TransformerConfigurationException, TransformerException {
        
        DocumentBuilderFactory factory=DocumentBuilderFactory.newDefaultInstance();
        
        try {
            DocumentBuilder builder=factory.newDocumentBuilder();
            
            org.w3c.dom.Document document=builder.newDocument();
            
            Element root=document.createElement("company");
            
            document.appendChild(root);
            
            Element employee1=document.createElement("employee");
            root.appendChild(employee1);
            
            Element id1=document.createElement("id");
            id1.appendChild(document.createTextNode("1"));
            employee1.appendChild(id1);
            
          Element name1=document.createElement("name");
          name1.appendChild(document.createTextNode("Towhid"));
          employee1.appendChild(name1);
          
          Element position1=document.createElement("position");
          position1.appendChild(document.createTextNode("idb student"));
           employee1.appendChild(position1);
           
           Element salary1=document.createElement("salary");
           salary1.appendChild(document.createTextNode("30000"));
            employee1.appendChild(salary1);
            
            
            TransformerFactory transformerFactory=TransformerFactory.newInstance();
            Transformer transformer=transformerFactory.newTransformer();
            DOMSource source=new DOMSource(document);
            
            StreamResult result=new StreamResult(new File("output.xml"));
            
            transformer.transform(source, result);
            
            System.out.println("xml file created succesfully");
            
            
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(XMLWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
