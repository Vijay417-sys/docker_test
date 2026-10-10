package com.product.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.response.ApiResponse;

@RestController
public class HomeController {

    @GetMapping("/")
    public ApiResponse<String> home() {
        return new ApiResponse<>("Product service is running", "Welcome to Product Service API", HttpStatus.OK);
    }
}
