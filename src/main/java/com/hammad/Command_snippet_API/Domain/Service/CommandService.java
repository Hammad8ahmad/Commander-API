package com.hammad.Command_snippet_API.Domain.Service;

import com.hammad.Command_snippet_API.Domain.Dto.CommandPageResponse;
import com.hammad.Command_snippet_API.Domain.Entity.Command;
import java.util.Optional;
import java.util.UUID;

// Service instance
public interface CommandService {

     CommandPageResponse getAll(int page, int size ,String sortBy, String sortDirection, String platform);
     Command createCommand(Command command);
     Optional<Command> getCommand(UUID id);
     Command updateCommand(UUID id, Command command);
     void deleteCommand(UUID id);

}
