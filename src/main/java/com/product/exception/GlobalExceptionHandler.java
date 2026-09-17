package com.product.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(exception = AppException.class)
	public ResponseEntity<?> handleAppException(AppException exception){
		
		
		com.product.response.ApiResponse<?> response= new com.product.response.ApiResponse<>(exception.getMessage(), null, exception.httpstatus());
		return new ResponseEntity<>(response,exception.httpstatus());
		
		
	}

}
