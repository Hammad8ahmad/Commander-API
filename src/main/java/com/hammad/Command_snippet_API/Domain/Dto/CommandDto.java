package com.hammad.Command_snippet_API.Domain.Dto;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;


public record CommandDto (

        UUID id,
        String howTo,
        String line,
        String platform


) implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
}
