package com.hammad.Command_snippet_API.Domain.Mapper;

import com.hammad.Command_snippet_API.Domain.Dto.CommandDto;
import com.hammad.Command_snippet_API.Domain.Entity.Command;

public interface CommandMapper {


     Command fromDto(CommandDto commandDto);
     CommandDto  toDto(Command command );
}
