package com.amolsoftwares.blogappapi.exceptions;

import com.amolsoftwares.blogappapi.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    ResponseEntity<ApiResponse> resourceNotFoundException(ResourceNotFoundException ex){
        String msg = ex.getMessage();
        ApiResponse apiResponse = new ApiResponse(msg, false);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.NOT_FOUND);
    }

}
