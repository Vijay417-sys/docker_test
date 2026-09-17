package com.product.exception;

import org.springframework.http.HttpStatus;

public class AppException extends RuntimeException {
	
	private HttpStatus httpstatus;
	
	public AppException(String message,HttpStatus httpststus) {
		super(message);
		this.httpstatus=httpstatus;
		
	}
	
	public HttpStatus httpstatus() {
		return httpstatus;
		
	}

}
