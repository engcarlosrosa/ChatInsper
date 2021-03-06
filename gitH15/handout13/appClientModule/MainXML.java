import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class MainXML {
	
	public static void main(String[] args) throws ClientProtocolException, IOException {
		
		HttpClient client = HttpClients.createDefault();
		String url = "http://finance.yahoo.com/webservice/v1/symbols/allcurrencies/quote";
		HttpGet request = new HttpGet(url);
		HttpResponse resp = client.execute(request);
		
		HttpEntity entity = resp.getEntity();
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		Document doc = null;
		try{
			DocumentBuilder builder = factory.newDocumentBuilder();
			doc = builder.parse(entity.getContent());			
		}catch (UnsupportedOperationException|SAXException|ParserConfigurationException e){
			e.printStackTrace();
		}
		
		NodeList nList = doc.getElementsByTagName("resource");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Element eElement = (Element) nList.item(temp);
			NodeList node = eElement.getElementsByTagName("field");
			System.out.print("Nome: " + node.item(0).getTextContent());
			System.out.print(" Pre�o: " + node.item(1).getTextContent());
			System.out.print(" S�mbolo: " + node.item(2).getTextContent());
			System.out.println(" ts: " + node.item(3).getTextContent());
			}
	}

}
