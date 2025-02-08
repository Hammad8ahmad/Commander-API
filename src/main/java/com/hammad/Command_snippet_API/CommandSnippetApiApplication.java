package com.hammad.Command_snippet_API;

import io.github.cdimascio.dotenv.Dotenv;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import org.springdoc.core.annotations.RouterOperation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.RequestMethod;


@SpringBootApplication
@EnableCaching
public class CommandSnippetApiApplication {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.configure()
				.directory("./")  // Make sure it's pointing to the directory where your .env files are located
				.filename(".env." + System.getProperty("spring.profiles.active"))
				.load();



		SpringApplication.run(CommandSnippetApiApplication.class, args);
	}

}
