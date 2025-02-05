package com.hammad.Command_snippet_API.Controller;


import com.hammad.Command_snippet_API.Domain.Dto.CommandDto;
import com.hammad.Command_snippet_API.Domain.Dto.CommandPageResponse;
import com.hammad.Command_snippet_API.Domain.Entity.Command;
import com.hammad.Command_snippet_API.Domain.Mapper.CommandMapper;
import com.hammad.Command_snippet_API.Domain.Service.CommandService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(path = "/commands")
@Tag(name = "Commands API",description = "Create,Read,Update and Delete commands.")
public class CommandController {


  private  final CommandService commandService;
  private  final CommandMapper commandMapper;

    public CommandController(CommandService commandService, CommandMapper commandMapper) {
        this.commandService = commandService;
        this.commandMapper = commandMapper;
    }


    // Paginated GET - retrieve commands with pagination
//    @GetMapping()
//    public Page<CommandDto> getAllCommandsPaged(@RequestParam(defaultValue =  "0") int page,@RequestParam(defaultValue = "10") int size) {
//        return commandService.getAll(page,size)
//                .map(commandMapper::toDto); // Convert each Command to CommandDto
//    }


    @Operation(
            summary = "Get command by ID",
            description = "Fetches a command by its ID. Caching is enabled, and subsequent requests for the same command will be faster due to Redis caching."
    )
    @GetMapping()
    public CommandPageResponse getAllCommandsPaged(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy,  // Default sort field
            @RequestParam(defaultValue = "asc") String sortDirection, // Default sorting direction
            @RequestParam(required = false) String platform) { // Optional filtering

        return commandService.getAll(page, size, sortBy, sortDirection, platform);
    }

    // Post commands in the database
    @PostMapping()
    public  CommandDto createCommand(@RequestBody  CommandDto commandDto){

        Command createdCommand = commandService.createCommand(commandMapper.fromDto(commandDto));
        return commandMapper.toDto(createdCommand);

    }

    // Get a single command from the database using specific id
    @GetMapping(path = "/{id}")
    public Optional<CommandDto> getCommand(@PathVariable("id") UUID id){

        return commandService.getCommand(id).map(commandMapper::toDto);
    }

    // Delete a single command from the database using specific id
    @DeleteMapping(path = "/{id}")
    public void deleteCommand(@PathVariable("id") UUID id){
       commandService.deleteCommand(id);
    }

    /* Update a single command(put updates the whole command and not just a single field)
     from the database using specific id */
    @PutMapping(path = "/{commandId}")
    public CommandDto updateCommand(@PathVariable("commandId") UUID commandId ,@RequestBody CommandDto commandDto){
      Command  commandToBeUpdated = commandService.updateCommand(commandId,

              (commandMapper.fromDto(commandDto))
              );
      return commandMapper.toDto(commandToBeUpdated);

    }

}
