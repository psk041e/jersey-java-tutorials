package com.journaldev.exceptionmapper;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.journaldev.exception.EmpNotFoundException;
import com.journaldev.model.ErrorResponse;

// EmpNotFoundException�� Response ��ü�� �����ϴ� Exception Mapper Ŭ�����̴�. 
// Ŭ�������� @Provider �ּ��� �־���Ѵ�. �� Ŭ������ web.xml�� ���ҽ� Ŭ������ ���� �����Ǵ� ��Ű���� �־���մϴ�. 
// toResponse()�޼ҵ� ������ ErrorResponse ������Ʈ�� �����ϰ� ���°� INTERNAL_SERVER_ERROR �� ���� ������Ʈ�� ��ƼƼ�� �����մϴ�.
@Provider
public class EmpNotFoundExceptionMapper implements ExceptionMapper<EmpNotFoundException> {
	
	public EmpNotFoundExceptionMapper() {
	}
	
	public Response toResponse(EmpNotFoundException empNotFoundException) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrorId(empNotFoundException.getErrorId());
		errorResponse.setErrorCode(empNotFoundException.getMessage());
		return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
				.entity(errorResponse).type(MediaType.APPLICATION_XML).build();
	}
	
}
