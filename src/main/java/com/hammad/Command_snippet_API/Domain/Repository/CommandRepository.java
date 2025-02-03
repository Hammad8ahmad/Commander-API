package com.hammad.Command_snippet_API.Domain.Repository;

import com.hammad.Command_snippet_API.Domain.Entity.Command;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CommandRepository extends JpaRepository<Command, UUID>, JpaSpecificationExecutor<Command> {

    Page<Command> findByPlatformContainingIgnoreCase(String platform, Pageable pageable);


}
