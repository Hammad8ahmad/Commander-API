package com.hammad.Command_snippet_API.Domain.Mapper.Impl;

import com.hammad.Command_snippet_API.Domain.Dto.CommandDto;
import com.hammad.Command_snippet_API.Domain.Entity.Command;
import com.hammad.Command_snippet_API.Domain.Mapper.CommandMapper;
import org.springframework.stereotype.Component;


@Component
public class CommandMapperImpl implements CommandMapper {


    @Override
    public Command fromDto(CommandDto commandDto) {
        return new Command(
                commandDto.id(),
                commandDto.howTo(),
                commandDto.line(),
                commandDto.platform(),null,null
        );
    }

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
