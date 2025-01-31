package com.hammad.Command_snippet_API.Domain.Repository;

import com.hammad.Command_snippet_API.Domain.Entity.Command;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CommandRepository extends JpaRepository<Command, UUID>{

}
