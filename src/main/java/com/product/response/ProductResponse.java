package com.product.response;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductResponse {
	
	private Integer productId;
	
	private String produtName;
	
	private Double price;
	
	private String productCategory;
	
	
	private String imageUrl;
	
	private Integer stockQuantity;
	
	private LocalDate createdAt;
	
	

}
