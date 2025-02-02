package com.hammad.Command_snippet_API.Domain.Dto;

import java.util.UUID;

public record CommandDto(

        UUID id,
        String howTo,
        String line,
        String platform


) {
}
