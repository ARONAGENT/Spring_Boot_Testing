package com.springJourney.Spring_Boot_Testing.advices;

import com.springJourney.Spring_Boot_Testing.Exceptions.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handlesResourceNotFoundException(ResourceNotFoundException e){
        return ResponseEntity.notFound().build();
    }
}
