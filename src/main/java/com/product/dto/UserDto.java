package com.product.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDto {
	private Integer userId;
	
	private String name;
	
	private String phone;
	
	private String email;
	
	private LocalDateTime createdAt;

}
