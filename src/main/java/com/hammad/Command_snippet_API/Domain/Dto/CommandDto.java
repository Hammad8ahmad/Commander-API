package com.hammad.Command_snippet_API.Domain.Dto;

import com.hammad.Command_snippet_API.Domain.Entity.Platform;

import java.util.UUID;

public record CommandDto(

        UUID id,
        String howTo,
        String line,
        Platform platform


) {
}
