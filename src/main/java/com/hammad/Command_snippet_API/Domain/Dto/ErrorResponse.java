package com.hammad.Command_snippet_API.Domain.Dto;


// Dto for error handling
public record ErrorResponse(
        int status,
        String message,
        String details
) {
}
