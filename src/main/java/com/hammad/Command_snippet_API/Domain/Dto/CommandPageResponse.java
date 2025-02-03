package com.hammad.Command_snippet_API.Domain.Dto;

import java.util.List;

public record CommandPageResponse(

        List<CommandDto> commands,
        int totalPages,
        long totalElements) {
}
