import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import org.json.JSONObject;
import org.json.XML;
import org.json.JSONException;

public class Main {

    public static String XML_STRING =
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                    "<root>" +
                    "<firstName>John</firstName>" +
                    "<lastName>Snow</lastName>" +
                    "<age>25</age>" +
                    "<spouse/>" +
                    "<address>" +
                    "<street>237 Harrison Street</street>" +
                    "<city>Brooklyn, NY</city>" +
                    "<state>New York</state>" +
                    "<postalCode>11238</postalCode>" +
                    "</address>" +
                    "<phoneNumbers>" +
                    "<type>mobile</type>" +
                    "<number>212 555-3346</number>" +
                    "</phoneNumbers>" +
                    "<phoneNumbers>" +
                    "<type>fax</type>" +
                    "<number>646 555-4567</number>" +
                    "</phoneNumbers>" +
                    "</root>";
    public static int PRETTY_PRINT_INDENT_FACTOR = 4;

    public static void main(String[] args) throws IOException, TransformerException {
        Document doc = convertStringToXMLDocument( XML_STRING );
        convertXMLDocumentToFile(doc);
        doc = convertXMLFileToXMLDocument("user_data.xml");
        String XMLStringFromFile = writeXmlDocumentToXmlFile(doc);
        try {
            JSONObject xmlJSONObj = XML.toJSONObject(XMLStringFromFile);
            String jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
            System.out.println(jsonPrettyPrintString);
        } catch (JSONException je) {
            System.out.println(je.toString());
        }
    }

    private static Document convertStringToXMLDocument(String xmlString)
    {
        //Parser that produces DOM object trees from XML content
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        //API to obtain DOM Document instance
        DocumentBuilder builder = null;
        try
        {
            //Create DocumentBuilder with default configuration
            builder = factory.newDocumentBuilder();

            //Parse the content to Document object
            Document doc = builder.parse(new InputSource(new StringReader(xmlString)));
            return doc;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    private static void convertXMLDocumentToFile(Document doc) throws TransformerException, IOException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        FileWriter writer = new FileWriter(new File("user_data.xml"));
        StreamResult result = new StreamResult(writer);
        transformer.transform(source, result);
    }

    private static Document convertXMLFileToXMLDocument(String filePath)
    {
        //Parser that produces DOM object trees from XML content
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        //API to obtain DOM Document instance
        DocumentBuilder builder = null;
        try
        {
            //Create DocumentBuilder with default configuration
            builder = factory.newDocumentBuilder();

            //Parse the content to Document object
            Document xmlDocument = builder.parse(new File(filePath));

            return xmlDocument;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    private static String writeXmlDocumentToXmlFile(Document xmlDocument)
    {
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer;
        try {
            transformer = tf.newTransformer();

            // Uncomment if you do not require XML declaration
            // transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");

            //A character stream that collects its output in a string buffer,
            //which can then be used to construct a string.
            StringWriter writer = new StringWriter();

            //transform document to string
            transformer.transform(new DOMSource(xmlDocument), new StreamResult(writer));

            String xmlString = writer.getBuffer().toString();
            return xmlString;                     //Print to console or logs
        }
        catch (TransformerException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
