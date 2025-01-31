package com.hammad.Command_snippet_API.Domain.Service.Impl;

import com.hammad.Command_snippet_API.Domain.Entity.Command;
import com.hammad.Command_snippet_API.Domain.Repository.CommandRepository;
import com.hammad.Command_snippet_API.Domain.Service.CommandService;
import org.springframework.stereotype.Service;

import java.util.List;


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
}
