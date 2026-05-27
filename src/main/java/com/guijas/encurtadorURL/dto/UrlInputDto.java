package com.guijas.encurtadorURL.dto;

import jakarta.validation.constraints.NotNull;

public record UrlInputDto(

        @NotNull
        Long id,
        @NotNull(message = "URL NAO PODE SER VAZIA")
        String url

) {
}
