package com.hammad.Command_snippet_API.Controller;


import com.hammad.Command_snippet_API.Domain.Dto.CommandDto;
import com.hammad.Command_snippet_API.Domain.Dto.CommandPageResponse;
import com.hammad.Command_snippet_API.Domain.Entity.Command;
import com.hammad.Command_snippet_API.Domain.Mapper.CommandMapper;
import com.hammad.Command_snippet_API.Domain.Service.CommandService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;
import java.util.UUID;

// Rest Controller / Command Controller

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


    // Post commands in the database
    @Operation(
            summary = "Post a command",
            description = "You can post a command by having a howTo,line and platform you don't need an id to create a command it is auto-generated."
    )
    @PostMapping()
    public  CommandDto createCommand(@RequestBody  CommandDto commandDto){

        Command createdCommand = commandService.createCommand(commandMapper.fromDto(commandDto));
        return commandMapper.toDto(createdCommand);

    }

    // Get all commands
    @Operation(
            summary = "Get all commands",
            description = "Fetches all commands.Pagination and Caching is enabled,So by default if you dont specify the page and size it would show first 10 commands from page 0 and subsequent requests for the same command will be faster due to Redis caching."
    )
    @GetMapping()
    public CommandPageResponse getAllCommandsPaged(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "howTo") String sortBy,  // Default sort field
            @RequestParam(defaultValue = "asc") String sortDirection,
            @Parameter(
                    name = "FilterByPlatform",
                    description = "Filter commands by platform (e.g., Linux, Windows, Mac)",
                    example = "Linux",
                    in = ParameterIn.QUERY,
                    schema = @Schema(type = "string")
            )// Default sorting direction
            @RequestParam(required = false) String platform) { // Optional filtering

        return commandService.getAll(page, size, sortBy, sortDirection, platform);
    }


    // Get a single command from the database using specific id
    @Operation(
            summary = "Get a command by an id",
            description = "You can get a specific command by an id."
    )
    @GetMapping(path = "/{id}")
    public Optional<CommandDto> getCommand(@PathVariable("id") UUID id){

        return commandService.getCommand(id).map(commandMapper::toDto);
    }

    // Delete a single command from the database using specific id
    @Operation(
            summary = "Delete a command by id",
            description = "You can delete a specific command by an id."
    )
    @DeleteMapping(path = "/{id}")
    public void deleteCommand(@PathVariable("id") UUID id){
       commandService.deleteCommand(id);
    }

    /* Update a single command(put updates the whole command and not just a single field)
     from the database using specific id */
    @Operation(
            summary = "Update an existing command by an id",
            description = "You can update a specific command by an existing id."
    )
    @PutMapping(path = "/{id}")
    public CommandDto updateCommand(@PathVariable("id") UUID id ,@RequestBody CommandDto commandDto){
      Command  commandToBeUpdated = commandService.updateCommand(id,

              (commandMapper.fromDto(commandDto))
              );
      return commandMapper.toDto(commandToBeUpdated);

    }

}
