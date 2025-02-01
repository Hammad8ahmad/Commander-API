package com.hammad.Command_snippet_API.Domain.Service.Impl;

import com.hammad.Command_snippet_API.Domain.Entity.Command;
import com.hammad.Command_snippet_API.Domain.Repository.CommandRepository;
import com.hammad.Command_snippet_API.Domain.Service.CommandService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class CommandServiceImpl implements CommandService {

    private  final CommandRepository commandRepository;

    public CommandServiceImpl(CommandRepository commandRepository){
        this.commandRepository = commandRepository;
    }

    @Override
    public List<Command> getAllCommands() {
        return commandRepository.findAll();
    }

    @Override
    public Command createCommand(Command command) {
        if (null != command.getId()) {
            throw new IllegalArgumentException("Command has already an id");
        }
        if (null == command.getHowTo() || command.getHowTo().isBlank()) {
            throw new IllegalArgumentException("Command should have a value");
        }
        LocalDateTime now = LocalDateTime.now();
        return commandRepository.save(new Command(
                null,
                command.getHowTo(),
                command.getLine(),
                command.getPlatform(),
                now, now
        ));
    }

    @Override
    public Optional<Command> getCommand(UUID id) {
        return commandRepository.findById(id);
    }


}
