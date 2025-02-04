package com.hammad.Command_snippet_API.Domain.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CommandDto (

        UUID id,
        String howTo,
        String line,
        String platform


) implements Serializable {
}
