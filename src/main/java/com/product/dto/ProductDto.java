package com.product.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
	
	private Integer productId;
	
	private String productCategory;
	
	private String productName;        
	
	private Double price;
	
	
	private String imageUrl;
	
	private Integer stockQuantity;
	
	private LocalDate createdAt;
	
	

}
