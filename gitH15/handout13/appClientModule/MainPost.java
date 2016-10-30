import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

public class MainPost {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		HttpClient client = HttpClients.createDefault();
		HttpPost request = new HttpPost("http://localhost:8080/handout11/maiuscula");
		
		List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
		urlParameters.add(new BasicNameValuePair("texto","Obrigado Jesus!"));
		
		request.setEntity(new UrlEncodedFormEntity(urlParameters));
		
		HttpResponse resp = client.execute(request);
		
		if( resp.getStatusLine().getStatusCode() == 200) {
			InputStreamReader stream = new InputStreamReader(resp.getEntity().getContent());
			BufferedReader br = new BufferedReader(stream);
			String Line;
			while ( (Line = br.readLine()) != null){
				System.out.println(Line);
			}
		}
	}
}
