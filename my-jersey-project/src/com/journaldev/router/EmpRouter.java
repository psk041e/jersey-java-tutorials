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

@Path("/emp")	// URI https://<HOST>:<PORT>/My-Jersey-Project/rest/emp/가있는 모든 요청이 이 리소스 클래스에 의해 처리된다.
public class EmpRouter {
	
	@POST	// 사용된 HTTP 메소드가 POST여야함을 정의
	@Path("/getEmp")	// URI https://<HOST>:<PORT>/My-Jersey-Project/rest/emp/getEmp 요청
	@Consumes(MediaType.APPLICATION_XML)	// 메서드가 XML 요소를 허용한다.
	@Produces(MediaType.APPLICATION_XML)	// 이 메서드는 XML 요소를 리턴한다.
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
