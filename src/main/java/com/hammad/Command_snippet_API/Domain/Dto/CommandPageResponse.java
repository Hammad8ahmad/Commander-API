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


import java.io.Serializable;
import java.util.List;


// Dto for the paginated response
public record CommandPageResponse(
        List<CommandDto> commands,
        int totalPages,
        long totalElements)
        implements Serializable {

}
