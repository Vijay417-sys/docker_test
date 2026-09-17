package com.product.service.imp;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.product.dto.ProductDto;
import com.product.entity.Product;
import com.product.exception.AppException;
import com.product.repository.ProductRepository;
import com.product.request.ProductRequest;
import com.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository prepo;

	@Autowired
	private ModelMapper mapper;

	@Override
	public ProductDto addProduct(ProductRequest request) {
		Product product = mapper.map(request, Product.class);
		product = prepo.save(product);
		return mapper.map(product, ProductDto.class);

	}

	@Override
	public void deleteProductById(Integer productId) {
		Product product = prepo.findById(productId)
				.orElseThrow(() -> new AppException("product not found", HttpStatus.NOT_FOUND));

		prepo.delete(product);

	}

	@Override
	public ProductDto getProductById(Integer productId) {
		Product product = prepo.findById(productId)
				.orElseThrow(() -> new AppException("product not found", HttpStatus.NOT_FOUND));
		return mapper.map(product, ProductDto.class);
	}

	@Override
	public List<ProductDto> getAllProduct() {

		List<Product> Products = prepo.findAll();
		return Products.stream().map(p -> mapper.map(p, ProductDto.class)).collect(Collectors.toList());

	}

	@Override
	public ProductDto updateProduct(ProductRequest request, Integer productId) {
		Product product = prepo.findById(productId)
				.orElseThrow(() -> new AppException("product not found!", HttpStatus.NOT_FOUND));
		product.setProductName(request.getProductName());
		product.setPrice(request.getPrice());
		product.setProductCategory(request.getProductCategory());
		product.setImageUrl(request.getImageUrl());
		product.setStockQuantity(request.getStockQuantity());
		return mapper.map(prepo.save(product), ProductDto.class);

	}

}
