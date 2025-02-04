//package com.hammad.Command_snippet_API.Domain.Dto;
//
//import java.io.Serializable;
//import java.util.List;
//
//public record CommandPageResponse implements Serializable(
//
//        List<CommandDto> commands,
//        int totalPages,
//        long totalElements) {
//}

package com.hammad.Command_snippet_API.Domain.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CommandPageResponse(
        List<CommandDto> commands,
        int totalPages,
        long totalElements)
        implements Serializable {
}
