package com.hammad.Command_snippet_API.Controller;


import com.hammad.Command_snippet_API.Domain.Dto.CommandDto;
import com.hammad.Command_snippet_API.Domain.Entity.Command;
import com.hammad.Command_snippet_API.Domain.Mapper.CommandMapper;
import com.hammad.Command_snippet_API.Domain.Service.CommandService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(path = "/commands")
public class CommandController {


  private  final CommandService commandService;
  private  final CommandMapper commandMapper;

    public CommandController(CommandService commandService, CommandMapper commandMapper) {
        this.commandService = commandService;
        this.commandMapper = commandMapper;
    }


    @GetMapping()
    public List<CommandDto> getAllCommands(){
        return commandService.getAllCommands().stream().map(commandMapper::toDto).toList();
    };


    @PostMapping()
    public  CommandDto createCommand(@RequestBody  CommandDto commandDto){

        Command createdCommand = commandService.createCommand(commandMapper.fromDto(commandDto));
        return commandMapper.toDto(createdCommand);

    }

    @GetMapping(path = "/{id}")
    public Optional<CommandDto> getCommand(@PathVariable("id") UUID id){

        return commandService.getCommand(id).map(commandMapper::toDto);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteCommand(@PathVariable("id") UUID id){
       commandService.deleteCommand(id);
    }

    @PutMapping(path = "/{commandId}")
    public CommandDto updateCommand(@PathVariable("commandId") UUID commandId ,@RequestBody CommandDto commandDto){
      Command  commandToBeUpdated = commandService.updateCommand(commandId,

              (commandMapper.fromDto(commandDto))
              );
      return commandMapper.toDto(commandToBeUpdated);

    }

}
