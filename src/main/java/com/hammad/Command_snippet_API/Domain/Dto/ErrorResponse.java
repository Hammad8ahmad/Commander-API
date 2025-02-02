package com.hammad.Command_snippet_API.Domain.Dto;

public record ErrorResponse(
        int status,
        String message,
        String details
) {
}
