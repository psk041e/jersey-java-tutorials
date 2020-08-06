package com.journaldev.client;

import javax.ws.rs.core.MediaType;

import com.journaldev.model.EmpRequest;
import com.journaldev.model.EmpResponse;
import com.journaldev.model.ErrorResponse;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

// 웹 서비스를 호출
// Jersey Client API를 사용하여 서비스를 호출하고 응답 상태를 기반으로 응답 엔티티를  EmpResponse 또는 ErrorResponse 클래스로 구분한다.
public class EmpClient {
	
	public static void main(String[] args) {
		String uri = "https://localhost:8088/My-Jersey-Project/rest/emp/getEmp";
		EmpRequest request = new EmpRequest();
		request.setId(2);
		request.setName("PK");
		try {
			Client client = new Client().create();
			WebResource r = client.resource(uri);
			ClientResponse response = r.type(MediaType.APPLICATION_XML).post(ClientResponse.class, request);
			System.out.println(response.getStatus());
			
			if (response.getStatus() == 200) {
				EmpResponse empResponse = new EmpResponse();
				System.out.println(empResponse.getId() + "::" + empResponse.getName());
			} else {
				ErrorResponse exc = response.getEntity(ErrorResponse.class);
				System.out.println(exc.getErrorCode());
				System.out.println(exc.getErrorId());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
