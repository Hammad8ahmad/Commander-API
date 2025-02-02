package com.hammad.Command_snippet_API.Domain.Service;

import com.hammad.Command_snippet_API.Domain.Entity.Command;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface CommandService {

     List<Command> getAllCommands();
     Command createCommand(Command command);
     Optional<Command> getCommand(UUID id);
     Command updateCommand(UUID commandId, Command command);
     void deleteCommand(UUID id);

}
