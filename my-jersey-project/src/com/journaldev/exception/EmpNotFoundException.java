package com.journaldev.exception;

import javax.xml.bind.annotation.XmlRootElement;

// 웹 서비스에서 발생하는 일반적인 예외 클래스
@XmlRootElement(name = "empNotFoundException")
public class EmpNotFoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int errorId;
	
	public int getErrorId() {
		return errorId;
	}
	
	public EmpNotFoundException(String msg, int errorId) {
		super(msg);
		this.errorId = errorId;
	}
	
	public EmpNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}
	
	
}
