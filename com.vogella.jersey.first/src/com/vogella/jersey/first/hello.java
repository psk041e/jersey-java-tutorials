package com.vogella.jersey.first;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello") // �ش� ���񽺸� ����Ҽ� ������ �����Ѵ�.
public class hello {

	@GET							// �ڽ��� get ���ҽ��� ����Ѵ�. 
	@Produces(MediaType.TEXT_PLAIN)	// �ؽ�Ʈ �� HTML MIME ������ �����ϵ��� �����Ѵ�. 
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

