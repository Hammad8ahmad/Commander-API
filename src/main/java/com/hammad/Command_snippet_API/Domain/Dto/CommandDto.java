package com.hammad.Command_snippet_API.Domain.Dto;


import java.io.Serializable;
import java.util.UUID;

// Dto for command entity

public record CommandDto (

        UUID id,
        String howTo,
        String line,
        String platform


) implements Serializable {
}
