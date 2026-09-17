package com.product.service;

import java.util.List;

import com.product.dto.UserDto;
import com.product.request.LoginRequest;
import com.product.request.RegisterRequest;
import com.product.request.UpdateRequest;

public interface UserService {
public UserDto register(RegisterRequest request);
	
	public UserDto login(LoginRequest request);
	
	public UserDto getUserById(Integer userId);
	
	public List<UserDto> getAll();
	
	public UserDto updateUser(Integer userId, UpdateRequest request);
	
	public void deleteUserById(Integer userId);

}
