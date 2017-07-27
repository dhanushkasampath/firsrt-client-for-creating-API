package users;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class People {
	public static void main(String[]args){
		Client client=Client.create();
		WebResource resource = client.resource("http://localhost:8080/WSdemo/book/samapth");
			
		ClientResponse clientResponse = resource.get(ClientResponse.class);
				
		String entity = clientResponse.getEntity(String.class);
				
		System.out.println(entity);		
		
	}
}
