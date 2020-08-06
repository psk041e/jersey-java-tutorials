package com.journaldev.exception;

import javax.xml.bind.annotation.XmlRootElement;

// �� ���񽺿��� �߻��ϴ� �Ϲ����� ���� Ŭ����
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
