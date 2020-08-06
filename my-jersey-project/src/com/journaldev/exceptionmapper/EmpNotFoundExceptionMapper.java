package com.journaldev.exceptionmapper;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.journaldev.exception.EmpNotFoundException;
import com.journaldev.model.ErrorResponse;

// EmpNotFoundException을 Response 객체에 매핑하는 Exception Mapper 클래스이다. 
// 클래스에는 @Provider 주석이 있어야한다. 이 클래스는 web.xml의 리소스 클래스에 대해 제공되는 패키지에 있어야합니다. 
// toResponse()메소드 구현은 ErrorResponse 오브젝트를 생성하고 상태가 INTERNAL_SERVER_ERROR 인 응답 오브젝트의 엔티티로 설정합니다.
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
