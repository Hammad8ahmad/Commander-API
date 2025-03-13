package com.hammad.Command_snippet_API;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@EnableCaching
public class CommandSnippetApiApplication {

	public static void main(String[] args) {




		SpringApplication.run(CommandSnippetApiApplication.class, args);
	}

}
