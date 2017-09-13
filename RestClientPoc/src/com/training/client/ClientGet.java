package com.training.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.training.bean.User;

public class ClientGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = ClientBuilder.newClient();

		WebTarget target = client
				.target("http://localhost:8080/RestPoc/webresources/user");
		
		Response res = target.request(MediaType.APPLICATION_JSON).get();
		ObjectMapper objectMapper = new ObjectMapper();
		
		// =  res.readEntity(User.class);
		
		
	//	System.out.println(out.getId());

		System.out.println(target.request(MediaType.TEXT_PLAIN).get(String.class));

	}

}
