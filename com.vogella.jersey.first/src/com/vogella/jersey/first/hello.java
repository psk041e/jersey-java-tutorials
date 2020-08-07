package com.vogella.jersey.first;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello") // 해당 서비스를 사용할수 있음을 정의한다.
public class hello {

	@GET							// 자신의 get 리소스로 등록한다. 
	@Produces(MediaType.TEXT_PLAIN)	// 텍스트 및 HTML MIME 유형을 전달하도록 정의한다. 
	public String sayPlainTextHello() {
		return "Hello Jersey";
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXmlHello() {
		return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlTextHello() {
		return "<html>" + "<title>" + "Hello Jersey" + "</title>" 
				+ "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html>";
	}
}

