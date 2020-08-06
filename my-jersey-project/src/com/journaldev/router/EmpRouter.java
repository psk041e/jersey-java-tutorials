package com.journaldev.router;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBElement;

import com.journaldev.exception.EmpNotFoundException;
import com.journaldev.model.EmpRequest;
import com.journaldev.model.EmpResponse;

@Path("/emp")	// URI https://<HOST>:<PORT>/My-Jersey-Project/rest/emp/���ִ� ��� ��û�� �� ���ҽ� Ŭ������ ���� ó���ȴ�.
public class EmpRouter {
	
	@POST	// ���� HTTP �޼ҵ尡 POST�������� ����
	@Path("/getEmp")	// URI https://<HOST>:<PORT>/My-Jersey-Project/rest/emp/getEmp ��û
	@Consumes(MediaType.APPLICATION_XML)	// �޼��尡 XML ��Ҹ� ����Ѵ�.
	@Produces(MediaType.APPLICATION_XML)	// �� �޼���� XML ��Ҹ� �����Ѵ�.
	public Response getEmp(JAXBElement<EmpRequest> empRequest) throws EmpNotFoundException {
		EmpResponse empResponse = new EmpResponse();
		if (empRequest.getValue().getId() == 1) {
			empResponse.setId(empRequest.getValue().getId());
			empResponse.setName(empRequest.getValue().getName());
		} else {
			throw new EmpNotFoundException("Wrong ID", empRequest.getValue().getId());
		}
		return Response.ok(empResponse).build();
	}
	
	
	
}
