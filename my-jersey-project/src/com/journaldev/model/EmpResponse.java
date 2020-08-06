package com.journaldev.model;

import javax.xml.bind.annotation.XmlRootElement;

// 응답 오브젝트의 java bean
@XmlRootElement(name = "empResponse")
public class EmpResponse {
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
