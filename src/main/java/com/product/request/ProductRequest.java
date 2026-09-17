package com.product.request;

import lombok.Data;

@Data
public class ProductRequest {
	
	private String productName;

    private String productCategory;
    
    private Double price;
    
    private String imageUrl;
	
	private Integer stockQuantity;

}
