package com.guijas.encurtadorURL.dto;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public record ErrorResponseDto(
        String message,
        String status,
        LocalDateTime timeStamp

) {
}
