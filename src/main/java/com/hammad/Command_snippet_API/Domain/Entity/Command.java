package com.hammad.Command_snippet_API.Domain.Entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;


// Command entity it will create the table named commands with these fields in the db
@Entity
@Table(name = "Commands")
public class Command {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "howTo", columnDefinition = "TEXT")
    private String howTo;

    @Column(name = "line")
    private String line;

    @Column(name = "platform")
    private String platform;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    // Getters,setters,hashcode,constructors and tostring for the command entity

    public Command() {
    }

    public Command(UUID id, String howTo, String line, String platform, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.howTo = howTo;
        this.line = line;
        this.platform = platform;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getHowTo() {
        return howTo;
    }

    public void setHowTo(String howTo) {
        this.howTo = howTo;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Command command = (Command) o;
        return Objects.equals(id, command.id) && Objects.equals(howTo, command.howTo) && Objects.equals(line, command.line) && Objects.equals(platform, command.platform) && Objects.equals(createdAt, command.createdAt) && Objects.equals(updatedAt, command.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, howTo, line, platform, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "Command{" +
                "id=" + id +
                ", howTo='" + howTo + '\'' +
                ", line='" + line + '\'' +
                ", platform='" + platform + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}


