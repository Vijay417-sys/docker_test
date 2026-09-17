package com.product.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UpdateRequest {

	private String productName;
	
	private String price;
	
	private String brand;
	
}
