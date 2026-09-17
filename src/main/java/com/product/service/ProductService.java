package com.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.product.dto.ProductDto;
import com.product.request.ProductRequest;
@Service
public interface ProductService {
	
	public ProductDto addProduct(ProductRequest request);
	
	public void deleteProductById(Integer productId);
	
	public ProductDto getProductById(Integer productId);

    public List<ProductDto> getAllProduct();
    
    public ProductDto updateProduct(ProductRequest request,Integer productId);
    
    

    

    

}
