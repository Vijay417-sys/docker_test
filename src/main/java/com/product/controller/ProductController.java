package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.product.dto.ProductDto;
import com.product.request.ProductRequest;
import com.product.response.ApiResponse;
import com.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService pservice;

	@PostMapping("/add")
	public ApiResponse<?> addproduct(@RequestBody ProductRequest request) {
		ProductDto dto = pservice.addProduct(request);
		return new ApiResponse<>("product added succsfully", dto, HttpStatus.CREATED);

	}

	@GetMapping("/get/{productId}")
	public ApiResponse<?> getProductById(@PathVariable Integer productId) {
		ProductDto dto = pservice.getProductById(productId);
		return new ApiResponse<>("the product data", dto, HttpStatus.OK);

	}

	@GetMapping("/get")
	public ApiResponse<?> getAllProduct() {
		List<ProductDto> list = pservice.getAllProduct();
		return new ApiResponse<>("add the products", list, HttpStatus.OK);

	}

	@PutMapping("update/{productId}")
	public ApiResponse<?> updateProduct(@PathVariable Integer productId, @RequestBody ProductRequest request) {
		ProductDto dto = pservice.updateProduct(request, productId);
		return new ApiResponse<>("the data updated succssfully", dto, HttpStatus.OK);

	}

	@DeleteMapping("delete/{productId}")
	public ApiResponse<?> deleteById(@PathVariable Integer productId) {
		pservice.deleteProductById(productId);
		return new ApiResponse<>("deleted succsfully", null, HttpStatus.OK);

	}

}
