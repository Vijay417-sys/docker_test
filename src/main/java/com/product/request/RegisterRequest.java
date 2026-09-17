package com.product.request;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class RegisterRequest {
	
	private String name;
	
	private String phone;
	
	private String email;
	
	private String password;

	
	

}
