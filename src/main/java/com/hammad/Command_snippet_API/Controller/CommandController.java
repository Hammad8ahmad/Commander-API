package com.hammad.Command_snippet_API.Controller;


import com.hammad.Command_snippet_API.Domain.Dto.CommandDto;
import com.hammad.Command_snippet_API.Domain.Mapper.CommandMapper;
import com.hammad.Command_snippet_API.Domain.Service.CommandService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "/commands")
public class CommandController {

    private final CommandMapper commandMapper;
    private final CommandService commandService;

    public CommandController(CommandMapper commandMapper, CommandService commandService) {
        this.commandMapper = commandMapper;
        this.commandService = commandService;
    }


    @GetMapping()
    public List<CommandDto> getAllCommands(){
        return commandService.getAllCommands().stream().map(commandMapper::toDto).toList();
    };


}
