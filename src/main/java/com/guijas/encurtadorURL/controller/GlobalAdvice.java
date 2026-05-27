package com.guijas.encurtadorURL.controller;

import com.guijas.encurtadorURL.dto.ErrorResponseDto;
import com.guijas.encurtadorURL.exception.BadRequestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalAdvice {

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ErrorResponseDto> BadRequestExceptionHandler(BadRequestException ex){
        ErrorResponseDto error = new ErrorResponseDto(
                ex.getMessage(),
                ex.getStatus().toString(),
                LocalDateTime.now()
        );

        return ResponseEntity.ok(error);
    }
}
