package com.hammad.Command_snippet_API.Domain.Service;

import com.hammad.Command_snippet_API.Domain.Entity.Command;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CommandService {

    List<Command> getAllCommands();
}
