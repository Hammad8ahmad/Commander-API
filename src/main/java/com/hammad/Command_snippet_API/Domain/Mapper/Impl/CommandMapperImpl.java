package com.hammad.Command_snippet_API.Domain.Mapper.Impl;

import com.hammad.Command_snippet_API.Domain.Dto.CommandDto;
import com.hammad.Command_snippet_API.Domain.Entity.Command;
import com.hammad.Command_snippet_API.Domain.Mapper.CommandMapper;
import org.springframework.stereotype.Component;



// Mappers for converting command entity into dto and vice versa
@Component
public class CommandMapperImpl implements CommandMapper {

//   Mapper for a commandDto takes a commandDto as an argument and return a command entity

    @Override
    public Command fromDto(CommandDto commandDto) {
        return new Command(
                commandDto.id(),
                commandDto.howTo(),
                commandDto.line(),
                commandDto.platform(),
                null,null
        );
    }

//    Mapper for a command entity takes a command as an argument and return a commandDto

    @Override
    public CommandDto toDto(Command command) {
        return new CommandDto(
                command.getId(),
                command.getHowTo(),
                command.getLine(),
                command.getPlatform()

        );
    }
}
