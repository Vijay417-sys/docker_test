package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.dto.UserDto;
import com.product.request.LoginRequest;
import com.product.request.RegisterRequest;
import com.product.request.UpdateRequest;
import com.product.response.ApiResponse;
import com.product.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService uservice;

	@PostMapping("/register")
	public ApiResponse<?> register(@RequestBody RegisterRequest request) {
		UserDto dto = uservice.register(request);
		return new ApiResponse<>("User created successfully!", dto, HttpStatus.OK);
	}

	@PostMapping("/login")
	public ApiResponse<?> login(@RequestBody LoginRequest request) {
		UserDto dto = uservice.login(request);
		return new ApiResponse<>("Login successful!", dto, HttpStatus.OK);
	}

	@GetMapping("/get/{userId}")
	public ApiResponse<?> getUserById(@PathVariable Integer userId) {
		UserDto dto = uservice.getUserById(userId);
		return new ApiResponse<>("User Info!", dto, HttpStatus.OK);
	}

	@GetMapping("/get")
	public ApiResponse<?> getAllUser() {
		List<UserDto> dtoList = uservice.getAll();
		return new ApiResponse<>("Users Data!", dtoList, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{userId}")
	public ApiResponse<?> deleteById(@PathVariable Integer userId) {
		uservice.deleteUserById(userId);
		return new ApiResponse<>("User created successfully!", null, HttpStatus.OK);

	}

	@PutMapping("/update/{userId}")
	public ApiResponse<?> updateUser(@PathVariable Integer userId, @RequestBody UpdateRequest request) {
		UserDto dto = uservice.updateUser(userId, request);
		return new ApiResponse<>("User updated successfully!", dto, HttpStatus.OK);
	}

}
